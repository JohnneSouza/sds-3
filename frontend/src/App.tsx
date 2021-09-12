import NavBar from "components";
import DataTable from "components/DataTable/indext";
import Footer from "components/Footer";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Hello World!</h1>
        <DataTable />
      </div>
      <Footer/>
    </>
  );
}

export default App;
