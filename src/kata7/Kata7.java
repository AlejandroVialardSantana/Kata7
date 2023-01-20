package kata7;

import model.FlightDB;
import static spark.Spark.*;

public class Kata7 {

    public static void main(String[] args) {
        FlightDB flightDB = new FlightDB();

        port(8080);
        
        get("/hello", (req, res) -> "Hello World");
    
        get("/flights/all", (req, res) -> {
            return flightDB.getAll();
        });
        
        get("/flights/day/:day", (req, res) -> {
            return flightDB.getDay(req.params(":day"));
        });
        
        get("/flights/distance/bigger/:distance", (req, res) -> {
            return flightDB.getBiggerDistance(req.params(":distance"));
        });
        
        get("/flights/distance/lower/:distance", (req, res) -> {
            return flightDB.getLowerDistance(req.params(":distance"));
        });
        
        get("/flights/cancelled", (req, res) -> {
            return flightDB.getCancelled();
        });
        
        get("/flights/diverted", (req, res) -> {
            return flightDB.getDiverted();
        }); 
    }
}
