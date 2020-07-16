package com.bridgeLaz.Addressbook;

import java.util.*;

public class AddressBookEntries {

	public static void main(String[] args) {
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		int zip;
		long phoneNo;
		int opreator;
		int count=0;
		Scanner sc= new Scanner(System.in);
		Addressbook add[]=new Addressbook[10];
		while(true) {
			System.out.println("operations are \n1.add address \n2.update address \n3.delete address \n4.search address \n5.view all \n6.exit");
			System.out.println("enter your choice");
			opreator=sc.nextInt();
			switch(opreator) {
			case 1:
				System.out.println("lets add new address entry");
				System.out.println("enter the no of entries to be done");
				int num=sc.nextInt();
				for(int i=0;i<num;i++) {
					System.out.println("enter the first name");
					firstName=sc.next();
					System.out.println("enter the last name");
					lastName=sc.next();
					System.out.println("enter the one word address location ");
					address=sc.next();
					System.out.println("enter the city name");
					city=sc.next();
					System.out.println("enter the State");
					state=sc.next();
					System.out.println("enter the zip code");
					zip=sc.nextInt();
					System.out.println("enter the phone number");
					phoneNo=sc.nextLong();
					add[count]=new Addressbook(firstName,lastName,address,city,state,zip,phoneNo);
					count++;
				}
				System.out.println("succesfully added");
				break;
			case 2:
				System.out.println("update book");
				System.out.println("enter the pone number of the entery you want to edit");
				phoneNo=sc.nextLong();
				for(int i=0;i<count;i++) {
				if(add[i]!=null && add[i].getPhoneNo()==phoneNo) {
					System.out.println("enter the first name");
					firstName=sc.next();
					add[i].setFirstName(firstName);
					System.out.println("enter the last name");
					lastName=sc.next();
					add[i].setLastName(lastName);
					System.out.println("enter the one word address location ");
					address=sc.next();
					add[i].setAddress(address);
					System.out.println("enter the city name");
					city=sc.next();
					add[i].setCity(city);
					System.out.println("enter the State");
					state=sc.next();
					add[i].setState(state);
					System.out.println("enter the zip code");
					zip=sc.nextInt();
					add[i].setZip(zip);
					System.out.println("enter the phone number");
					phoneNo=sc.nextLong();
					add[i].setPhoneNo(phoneNo);
				}
			}
				System.out.println("update done");
				break;
			case 3:
				System.out.println("delete");
				System.out.println("enter the phone number that you want to delete");
				phoneNo=sc.nextLong();
				for(int i=0;i<count;i++) {
					if(add[i]!=null && add[i].getPhoneNo()==phoneNo) {
						add[i]=null;
					}
				}
				System.out.println("done with deletion of the entry");
				break;
			case 4:
				System.out.println("search");
				System.out.println("enter the phone number that you want to search");
				phoneNo=sc.nextLong();
				for(int i=0;i<count;i++) {
					if(add[i]!=null && add[i].getPhoneNo()==phoneNo) {
						System.out.println(add[i]);
					}
				}
				break;
				
			case 5:
				System.out.println("all entries");
				for(int i=0;i<count;i++) {
						System.out.println(add[i]);	
				}
				break;
			case 6:
				System.exit(0);
			}
			
			sc.close();
		}
		
		
	}
}
