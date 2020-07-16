package com.bridgeLaz.Addressbook;

public class Addressbook {

		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String state;
		private int zip;
		private long phoneNo;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		public Addressbook(String firstName, String lastName, String address, String city, String state, int zip, long phoneNo) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.city = city;
			this.state = state;
			this.zip = zip;
			this.phoneNo = phoneNo;
		}
		@Override
		public String toString() {
			return "Address [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
					+ ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo + "]";

		}
}
