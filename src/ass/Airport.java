package ass;
import java.util.ArrayList;
import java.time.LocalDate;
class Airport 
{
  Address address;
  ArrayList<Flight> flights = new ArrayList<>();
  
  ArrayList<Traveller> travellers = new ArrayList<>();
 public Airport() {	 }
 
  public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

public ArrayList<Flight> getFlights() {
	return flights;
}

public void setFlights(ArrayList<Flight> flights) {
	this.flights = flights;
}



public ArrayList<Traveller> getTravellers() {
	return travellers;
}

public void setTravellers(ArrayList<Traveller> travellers) {
	this.travellers = travellers;
}

public ArrayList<Flight>  searchFlightBySandD(String source,String destination)
  {
	ArrayList<Flight> flist = new ArrayList<>();
	  for(Flight f:flights) 
	if(f.getSource().equals(source) && f.getDestination().equals(destination))
		flist.add(f);
	  return flist;
		
  }

  public void bookTicket(String flightId,Traveller traveller)
  {
	  System.out.println("aa");
	  for(Flight f:flights)
	  {
	  if(f.getId().equals(flightId)&& (f.getAvailableSeats()>=1))
	  {
		  traveller.setFlightId(flightId);
		  travellers.add(traveller);
		  f.setAvailableSeats(f.getAvailableSeats()-1);
		  System.out.println("your ticket is booked");
		  
	  }
	  else
		  System.out.println("ticket booking is failed");
	  }
  }
  public boolean addFlight(Flight f)
  {
	  
	  if(!(flights.contains(f)))//return flights.add(flightObj);
	  {
		  flights.add(f);
		  return true;
	  }
	  return false;
	
	 }
  
  
  

}