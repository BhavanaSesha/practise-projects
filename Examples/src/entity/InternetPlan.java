package entity;



public class InternetPlan implements Comparable<InternetPlan>{
	private String planName;
	private String speed;
	private String downloadLimit;
	private int price;
	public InternetPlan() {
		super();
	}
	public InternetPlan(String planName, String speed, String downloadLimit, int price) {
		super();
		this.planName = planName;
		this.speed = speed;
		this.downloadLimit = downloadLimit;
		this.price = price;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public String getDownloadLimit() {
		return downloadLimit;
	}
	public void setDownloadLimit(String downloadLimit) {
		this.downloadLimit = downloadLimit;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "InternetPlan [planName=" + planName + ", speed=" + speed + ", downloadLimit=" + downloadLimit
				+ ", price=" + price + "]";
	}
	@Override
	public int compareTo(InternetPlan internetPlan1) {
		if(internetPlan1.getPrice()>this.getPrice())
			return 1;
		else if(internetPlan1.getPrice()<this.getPrice())
			return -1;
		else
			return 0;
	}
	
	

}
