package sampleaddress;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;



public class Contact{

	Scanner sc = new Scanner(System.in);
	ArrayList<PersonInformation> Contactlist = new ArrayList<PersonInformation>();
	PersonInformation personInfo = new PersonInformation(null, null, null, null, null, null, null, null);

	//add contact method
	public void addContact() {
		createContact();
	}
	
	public void editContact() {
		System.out.println("Enter the first name of person to edit contact");
		String editName = sc.next();
		boolean edited = false;
		
		for (int i = 0; i < Contactlist.size(); i++) {
			String name = Contactlist.get(i).getFirstName();
			if (name.equals(editName)) {
				createContact();
				edited = true;
				break;
			}
		}
		if (!edited) {
			System.out.println("Invalid input");
		}
	}
	

	//creating contact
	public void createContact() {

		System.out.println("Enter First Name : ");
		String firstName = sc.next();

		System.out.println("Enter Last Name : ");
		String lastName = sc.next();

		System.out.println("Enter Address : ");
		String address = sc.next();

		System.out.println("Enter City : ");
		String city = sc.next();

		System.out.println("Enter State : ");
		String state = sc.next();

		System.out.println("Enter Zip : ");
		String zip = sc.next();

		System.out.println("Enter Mobile Number : ");
		String phoneNumber = sc.next();

		System.out.println("Enter Email : ");
		String email = sc.next();

		personInfo = new PersonInformation(firstName, lastName, address, city, state, zip, phoneNumber, email);

		Contactlist.add(personInfo);
		printContact();
	}

	//print contact details
	public void printContact() {
		System.out.println("Contact Details");
		System.out.println("Name 	      : "  + personInfo.getFirstName()+ " " + personInfo.getLastName() + "\n"
				+ "Address       : "  + personInfo.getAddress() + "\n"
				+ "City          : "  + personInfo.getCity() + "\n"
				+ "State         : "  + personInfo.getState() + "\n"
				+ "Zip       : "  + personInfo.getZip() + "\n"
				+ "MobileNumber  : "  + personInfo.getPhoneNumber() + "\n"
				+ "EmailId       : "  + personInfo.getEmail() + "\n" );
	}

}
