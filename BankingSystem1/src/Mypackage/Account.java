package Mypackage;

public class Account {
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String firstName;
	private String userName;
	private String lastName;
	private String age;
	private String address;
	private String mobileNumber;
    private String emailId;
	private String dateOfBirth;
	private long accountNumber;
	private double minbalance;
	private static double balance;
	
	
	private  long pin;
	public  long getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getMinbalance() {
		return minbalance;
	}
	public void setMinbalance(double minbalance) {
		if(minbalance < 0 )
			throw new IllegalArgumentException("Balnce should not be less than zero");
		else this.minbalance = minbalance;
	}
	public static  double getBalance() {
		return balance;
	}
	public static  void setBalnce(double bal) {	
		if(balance < 0) {
			System.out.println("balance sholud not be less than zero..");
		}
		balance = balance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public Account(String id,String firstName, String userName, String lastName, String age, String address,
			String mobileNumber, String emailId, String dateOfBirth,double balance) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
		this.firstName = firstName;
		this.userName = userName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.dateOfBirth = dateOfBirth;
		this.balance=balance;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName.equals(null) && firstName.trim().equals(" "))
			throw new IllegalArgumentException("firstName should not be null or empty");
		else this.firstName = firstName;
	}
	public String getUsername() {
		return userName;
	}
	public void setUsername(String username) {
		if(username.contains(null) && username.trim().equals(" "))
			throw new IllegalArgumentException("username should not be null or empty");
		else userName = username;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName.contains(null) && lastName.trim().equals(" "))
			throw new IllegalArgumentException("username should not be null or empty");
		else this.lastName = lastName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address.contains(null) && address.trim().equals(" "))
			throw new IllegalArgumentException("address should not be null or empty");
		else this.address = address;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		if(mobileNumber.length() !=10)
			throw new IllegalArgumentException("invalid mobile numnber");
		else this.mobileNumber = mobileNumber;
	}
	public String getEMailID() {
		return emailId;
	}
	public void setEMailID(String eMailID) {
		if(eMailID.contains(null) && eMailID.trim().equals(" "))
			throw new IllegalArgumentException("eMailID should not be null or empty");
		else this.emailId = eMailID;
	}
	public String getDateofbirth() {
		return dateOfBirth;
	}
	public void setDateofbirth(String dateofbirth) {
		if(dateofbirth.contains(null) || dateofbirth.trim().equals(" ")) {
			System.out.println("dateofbirth should not be null or empty");
		}
		else this.dateOfBirth = dateofbirth;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", firstName=" + firstName + ", userName=" + userName + ", lastName=" + lastName
				+ ", age=" + age + ", address=" + address + ", mobileNumber=" + mobileNumber + ", emailId=" + emailId
				+ ", dateOfBirth=" + dateOfBirth + ", accountNumber=" + accountNumber + ", minbalance=" + minbalance
				+ ", balance=" + balance + ", pin=" + pin + "]";
	}
	
}
