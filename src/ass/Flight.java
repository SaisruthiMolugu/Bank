package ass;


class Flight {
	private String id;
	private String source;
	private String destination;
	private double fare;
	private int totalseats;
	private int availableSeats;
	private String arrivaltime;
	private String departuretime;
	private String companyname;
	public Flight(String id, String source, String destination, double fare, int totalseats, int availableSeats,
			String arrivaltime, String departuretime, String companyname) {
		
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.fare = fare;
		this.totalseats = totalseats;
		this.availableSeats = availableSeats;
		this.arrivaltime = arrivaltime;
		this.departuretime = departuretime;
		this.companyname = companyname;
	}
	
	  
	  
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getDestination() {
		return destination;
	}



	public void setDestination(String destination) {
		this.destination = destination;
	}



	public double getFare() {
		return fare;
	}



	public void setFare(double fare) {
		this.fare = fare;
	}



	public int getTotalseats() {
		return totalseats;
	}



	public void setTotalseats(int totalseats) {
		this.totalseats = totalseats;
	}



	public int getAvailableSeats() {
		return availableSeats;
	}



	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}



	public String getArrivaltime() {
		return arrivaltime;
	}



	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}



	public String getDeparturetime() {
		return departuretime;
	}



	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}



	public String getCompanyname() {
		return companyname;
	}



	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}



	public boolean addFlight(Object obj)
	{
		if(obj instanceof Flight)
		{
			Flight f=(Flight)obj;
			return id.equals(f.id) &&  source.equals(f.source) && destination.equals(f.destination) && fare==f.fare && totalseats==f.totalseats 
			&& availableSeats==f.availableSeats &&  arrivaltime.equals(f.arrivaltime) && departuretime.equals(f.departuretime)&& 
			companyname.equals(f.companyname);	
		}
		return false;	
	}

	

}
