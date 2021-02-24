package entity;

public class ParkingTicket {
	private String vehiclenumber;
	private String entrytime;
	
	
	public ParkingTicket() {
		super();
		entrytime="";
		// TODO Auto-generated constructor stub
	}
	/*public ParkingTicket(String vehiclenumber, String entrytime) {
		super();
		this.vehiclenumber = vehiclenumber;
		this.entrytime = entrytime;
	}*/
	public String getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}
	public String getEntrytime() {
		return entrytime;
	}
	public void setEntrytime(String entrytime) {
		this.entrytime = entrytime;
	}
	@Override
	public String toString() {
		return "ParkingTicket [vehiclenumber=" + vehiclenumber + ", entrytime=" + entrytime + "]";
	}
	

}
