package entity;

public class InternetUser {
	private String name;
	private String userId;
	private long mobileNumber;
	private String city;
	private InternetPlan internetPlan;
	public InternetUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InternetUser(String name, String userId, long mobileNumber, String city, InternetPlan internetPlan) {
		super();
		this.name = name;
		this.userId = userId;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.internetPlan = internetPlan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public InternetPlan getInternetPlan() {
		return internetPlan;
	}
	public void setInternetPlan(InternetPlan internetPlan) {
		this.internetPlan = internetPlan;
	}
	@Override
	public String toString() {
		return "InternetUser [name=" + name + ", userId=" + userId + ", mobileNumber=" + mobileNumber + ", city=" + city
				+ ", internetPlan=" + internetPlan + "]";
	}
	

}
