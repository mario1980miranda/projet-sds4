import NavBar from "components/NavBar";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";
import DataTable from "components/DataTable";
import Footer from "components/Footer";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Tableau de board des ventes</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Tax de réussite (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Tout les ventes</h5>
            <DonutChart />
          </div>
        </div>
        <div className="py3">
          <h2 className="text-primary">Tout les ventes</h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
