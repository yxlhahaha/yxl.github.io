package CarRent;

public class Pickup extends Cars {
	   //private int peopleCapacity;
	   //private int cargoCapacity;
	   public Pickup(String name,double rentmoney,int peopleCapacity,int cargoCapacity) {
		   this.name =name;
		   this.rentmoney = rentmoney;
		   this.peopleCapacity = peopleCapacity;
		   this.cargoCapacity = cargoCapacity;
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
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	   
}
