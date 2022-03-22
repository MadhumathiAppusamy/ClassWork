package composition;

public class Address {
   private int dno;
   private String street;
   private int pincode;
public Address() {
	super();
}
public Address(int dno, String street, int pincode) {
	super();
	this.dno = dno;
	this.street = street;
	this.pincode = pincode;
}

public int getDno() {
	return dno;
}
public void setDno(int dno) {
	this.dno = dno;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [dno=" + dno + ", street=" + street + ", pincode=" + pincode + "]";
}

}
