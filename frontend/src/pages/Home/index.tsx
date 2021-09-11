import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";

const Home = () => {
    return (
        <>
            <NavBar />
            <div className="container">
                <div className="jumbotron">
                    <h1 className="display-4">DSVendas</h1>
                    <p className="lead">Analysez vos performances de vente sous différents angles</p>
                    <hr />
                    <p>Cette application consiste à afficher un tableau de bord à partir des données fournies par un back-end construit avec Spring Boot.</p>
                    <Link className="btn btn-primary btn-lg" to="/dashboard">
                        Accès la table de bord
                    </Link>
                </div>
            </div>
            <Footer />
        </>
    );
}

export default Home;