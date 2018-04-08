package CarRent;

public class Truck extends Cars {
	  // private int cargoCapacity;
	   public Truck(String name,double rentmoney,int cargoCapacity) {
		   this.name =name;
		   this.rentmoney = rentmoney;
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
	public int getCargoCapacity() {
		return cargoCapacity;
	}
	public void setCargoCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}
	   
}
