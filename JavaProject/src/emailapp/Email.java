package emailapp;

import java.util.Scanner;

import com.sun.jdi.event.ThreadDeathEvent;

public class Email {

	private String firstName;
	private String lastName;
	private String department;
	private String password;
	private String changePassword;
	private String alternateEmail;
	public String email;
	private int mailBoxCapacity = 500;

	// constructor
	public Email(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
		System.out.println("email created" + firstname + " " + lastname);

		this.department = setDepartment();
		System.out.println("department :" + department);

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the length of the password");

		int leng = sc.nextInt();
		this.password = setPassword(leng);
		System.out.println("password is :" + this.password);
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + "company.com";
		System.out.println(email);

		// System.out.println(firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+"company.com");

	}

	// ask for department
	private String setDepartment() {
		System.out.print("Enter the depertment name");
		Scanner in = new Scanner(System.in);
		String  deptChoise = in.next();
		
		switch (deptChoise) {
		case "sales":
			return "sales";
			
		case "development" :
			return "development";
			
		case "accounting" :
			return "accounting";
			
		case "none":
		return "none";
	

		default:
			throw new IllegalArgumentException("Unexpected value: " + deptChoise);
		}
		
		
		
	}
	
	
	
	/**private String setDepartment() {

		System.out.print(
				"depertmentCode\n1 for sales\n2 for development\n3 for accounting\n0 for none\nEnter the depertment code");
		Scanner in = new Scanner(System.in);
		int deptChoise = in.nextInt();
		if (deptChoise == 1) {
			return "sales";
		} else if (deptChoise == 2) {
			return "development";
		} else if (deptChoise == 3) {
			return "accounting";
		} else {
			return "none";
		}
	}**/

	// ask for password and put the length of the password
	private String setPassword(int length) {

		String passwordSet = "qwertyuiopasdfghjklzxcvbnm1256789@%&";

		char password[] = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);

		}
		return new String(password);

	}

	// set method for mailboxcapacity
	public void setmMilBoxCapacity(int mail) {
		this.mailBoxCapacity = mail;
	}

	// set method for alternate email
	public void setAlternateEmail(String e) {
		this.alternateEmail = e;
	}

	public void setChangePassword(String Password) {
		this.password = password;

	}

	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;

	}

	public String getChangePassword() {
		return password;
	}

	public void displayInfo() {
		System.out.println("name:" + firstName + " " + lastName + "\n" + "email:" + email + "\n" + "mailBoxCapacity:"
				+ mailBoxCapacity);
	}

}
