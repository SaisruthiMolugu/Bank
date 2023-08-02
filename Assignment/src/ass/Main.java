package ass;

public class Main {

	public static void main(String[] args) {
		Airport a = new Airport();
		a.addFlight(new Flight("2468","Delhi","Karnataka",7900.45,35,5,"1:34","3:50","Indigo"));
		a.addFlight(new Flight("3555","Telanganna","goa",8900.45,35,5,"2:34","4:50","Airways"));
		a.addFlight(new Flight("6555","Karnataka","J&K",9900.45,35,5,"3:34","5:50","Indigo"));
		a.addFlight(new Flight("7555","Delhi","Kerala",5900.45,35,5,"4:34","6:50","AIrways"));
		a.addFlight(new Flight("7555","Delhi","Kerala",5900.45,35,5,"4:34","6:50","AIrways"));
	    System.out.println(a.searchFlightBySandD("Delhi", "Kerala"));
	}

}
