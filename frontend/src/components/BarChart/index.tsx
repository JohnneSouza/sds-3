import axios from 'axios'
import { useEffect, useState } from 'react'
import Chart from 'react-apexcharts'
import { SaleSuccess } from 'types/sale'
import { round } from 'utils/Format'
import { BASE_URL } from 'utils/Requests'

type SeriesData = {
    name: string;
    data: number[];
}

type ChartData = {
    labels: {
        categories: string[];
    };
    series: SeriesData[];

}

const BarChart = () => {

    const [chartData, setChartData] = useState<ChartData>({
        labels: {
            categories: []
        },
        series: [{
            name: "",
            data: []
        }
        ]
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/success-by-seller`).then(
            response => {
                const data = response.data as SaleSuccess[];
                const responseLabels = data.map(label => label.sellerName);
                const responseSeries = data.map(serie => round(100 * serie.deals / serie.visited, 1));

                setChartData({
                    labels: {
                        categories: responseLabels
                    },
                    series: [{
                        name: "Success Rate (%)",
                        data: responseSeries
                    }
                    ]
                });
            }
        )
    }, []);

    const options = {
        plotOptions: {
            bar: {
                horizontal: true,
            }
        },
    };


    return (
        <Chart
            options={{ ...options, xaxis: chartData.labels }}
            series={chartData.series}
            type="bar"
            height="240"
        />
    );
}

export default BarChart;