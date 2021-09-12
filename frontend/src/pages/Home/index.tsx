import NavBar from "components";
import Footer from "components/Footer";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">DS Sales</h1>
                    <p className="lead">Verify your sales performance from different perspectives</p>
                    <hr />
                    <p>This application consists of displaying a dashboard from data provided by a back end built with Spring Boot.</p>
                    <Link className="btn btn-primary btn-lg" to="/dashboard">
                        Access Dashboard
                    </Link>
                </div>
            </div>
            <Footer />
        </>
    )
}

export default Home;