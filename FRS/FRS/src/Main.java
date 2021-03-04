import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Passenger passenger = new Passenger("H.no abccba", "Sircilla","Telangana",
                "Saichandra", "9908082434", "thammishetti@gmail.com");
        Flight flight = new Flight("124Tr","Indigo", 186, 7);

        RegularTicket regularTicket = new RegularTicket("123235456", "Hyd", "Bglr",
                "02/03/21", "03/03/21", "45",
                1500, false, flight, passenger, "abc");

        String hotelAddress = "Hotel, Bangalore";
        String[] locations = {"kjhasd","asdf"};

        TouristTicket touristTicket = new TouristTicket("45234624", "Hyd", "Bglr",
                "02/03/21", "03/03/21", "57",
                1500, false, flight, passenger, hotelAddress,locations);

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }

}
