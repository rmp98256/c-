package emailapp;
import java.security.SecureRandom;
import java.util.Scanner;

public class Email {
private String firstname ;
private String lastname;
private String password;
private String department ;
private int mailboxCapacity=500;
private int defaltpasswordlenth=10;
private String alternativeEmail;
private String companyname="globallogic.com";
private String email;


//Constructor to receive the first name and last name 
public Email(String firstname, String lastname) {
	//super();
	this.firstname = firstname;
	this.lastname = lastname;
	
	
	//call the method asking for department and  and return department 
	this.department=setDapartment();
	
	//call method to generate password
	this.password=generateRandomPassword(defaltpasswordlenth);
	System.out.println("Your Password:"+password);
	
	//combine to generate email 
	this.email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+companyname;
	
}

//Ask for the department 
   private String setDapartment()
{
	System.out.println("New worker :"+firstname+" "+lastname+"\nDepartment code:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for None\nEnter the department:");
	Scanner sc = new Scanner(System.in);
	int depChoice=sc.nextInt();
	if(depChoice==1)      return "sales";
	else if(depChoice==2) return "dev";
	else if(depChoice==3) return "acct";
	else                  return "";
}

//Generate the random password 
	private String generateRandomPassword(int len)
	{
		// ASCII range - alphanumeric (0-9, a-z, A-Z)
		 String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		//SecureRandom random = new SecureRandom();
		char[] randpassword= new char[len];

		// each iteration of loop choose a character randomly from the given ASCII range
		// and append it to StringBuilder instance

		for (int i = 0; i < len; i++) {
			;
			randpassword[i]=chars.charAt((int)(Math.random()*chars.length()));
		}
		

		return new String(randpassword);
	}

	


//Set the mailbox capacity;
public void setmailboxCapacity(int capacity)
{
	this.mailboxCapacity=capacity;
}

//Set the alternative Email
public void setalternateMail(String newmail)
{
	this.alternativeEmail=newmail;
}

//change the password 
public void setnewpassword(String newpassword) {
	this.password=newpassword;
}
public int getmailboxCapacity()
{
	return mailboxCapacity;
}
public String getalternateMail()
{
	return alternativeEmail;
}
public String showInfo()
{
	return "Display Name:"+firstname+" "+lastname+
			"\nCompany Email:"+email+
			"\nMailboxCapacity:"+mailboxCapacity;
}
}
