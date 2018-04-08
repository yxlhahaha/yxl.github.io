package CarRent;

public class PassengerCar extends Cars {
  // private int peopleCapacity;
   public PassengerCar(String name,double rentmoney,int peopleCapacity) {
	   this.name =name;
	   this.rentmoney = rentmoney;
	   this.peopleCapacity = peopleCapacity;
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getRentmoney() {
	return rentmoney;
}
public void setRentmoney(double rentmoney) {
	this.rentmoney = rentmoney;
}
public int getPeopleCapacity() {
	return peopleCapacity;
}
public void setPeopleCapacity(int peopleCapacity) {
	this.peopleCapacity = peopleCapacity;
}

}
