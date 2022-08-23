package Mypackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class AccountOperation {
	
	
	static Map<String ,Account> map = new HashMap<String,Account>();
	
	
	static int count= 1;
	public void createCustomerAccount(String id,String firstName,String userName,String lastName,String age,String address,String mobileNumber,String emailId,String dateOfBirth,double balance) {
		
		System.out.println("Customer Details............");
		System.out.println("Id           :"+id);
		System.out.println("FirstName 	 : "+firstName);
		System.out.println("Username  	 : "+userName);
		System.out.println("LastName  	 : "+userName);
		System.out.println("Age       	 : "+age);
		System.out.println("Address   	 : "+address);
		System.out.println("MobileNumber 	: "+mobileNumber);
		System.out.println("EMailID		 : "+emailId);
		System.out.println("Dateofbirth  	: "+dateOfBirth);
		System.out.println(count++ +" "+"Account creted");
		
		long pin = (long) (Math.random()*10000);
		System.out.println("Pin generated is :"+pin);
		long accNumber = (long)(Math.random()*1000000000);
		System.out.println("Account Number :"+accNumber);
		double bal=0;
		Account a1 = new Account(id,firstName,userName,lastName,age,address,mobileNumber,emailId,dateOfBirth,bal);
		map.put(id, a1);
		System.out.println(map);
		}
	public  void addMoney(String id,double amount) {
		
		for(Map.Entry<String, Account> entry : map.entrySet())
		{
			String newid=entry.getKey();
			System.out.println(newid);
			Account acc=entry.getValue();
			System.out.println(acc);
			if(newid.equals(id))
			{
				double bal =acc.getBalance()+amount;
				System.out.println("Amount "+amount+" credited ....Total balance : "+bal);
				acc.setBalnce(bal);
				System.out.println(acc.getBalance());
			}
		}
	}
	
	public static void withDrawMoney(String id,double amount) {
		
		
		for(Entry<String, Account> entry : map.entrySet())
		{
			if(entry.getKey().equals(id))
			{
				double bal = Account.getBalance()-amount;
				System.out.println("Amount "+amount+" withdraw successfully ");
				Account.setBalnce(bal);
			}
		}
	}
	/*public static void closeAccount(String userName, long pin) {
		Iterator it = L1.iterator();	
		while (it.hasNext()) {
			Account ele = (Account) it.next();
			if(ele.getUsername().equals(userName) && ele.getPin() == pin) {
				it.remove();
			}
		}
		System.out.println("The  account of "+userName+" got successfully deactivated...");	
	}*/
	
	
	public static void viewBalance(String id,String username,long pin) {
		
		for(Entry<String, Account> entry : map.entrySet())
		{
			if(entry.getKey().equals(id) || entry.getValue().equals(username))
			{
				System.out.println("Current balance"+Account.getBalance());
			}
		}
		}
	
	public static void withdrawMoney(String id,String username,long pin,double amount) {
		
		for(Entry<String, Account> entry : map.entrySet())
		{
			if(entry.getKey().equals(id) || entry.getValue().equals(username))
			{
				double bal = Account.getBalance()-amount;
				System.out.println("Amount "+amount+" withdraw....Total balance : "+bal);
		
			}
		}
	}
}

