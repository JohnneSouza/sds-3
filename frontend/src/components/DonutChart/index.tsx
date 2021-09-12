import axios from 'axios'
import { useEffect, useState } from 'react'
import Chart from 'react-apexcharts'
import { SaleSum } from 'types/sale'
import { BASE_URL } from 'utils/Requests'

type ChartData = {
    labels: string[],
    series: number[]
}

const DonutChart = () => {

    const [chartData, setChartData] = useState<ChartData>({labels: [], series: []})

    useEffect(() => {
        axios.get(`${BASE_URL}/sales/quantity-by-seller`).then(
            response => {
                const data = response.data as SaleSum[];
                const responseLabels = data.map(label => label.sellerName);
                const responseSeries = data.map(serie => serie.sum);
    
                setChartData({labels: responseLabels, series: responseSeries})
            }
        )
    }, [])

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart
            options={{ ...options, labels: chartData.labels }}
            series={chartData.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;