package CarRent;
import java.util.Scanner;
public class Test {
    private static Scanner d;
	private static Scanner s;
	private static Scanner n;
	private static Scanner in;
	public static void main(String[]args) {
    	Cars[] car = {new PassengerCar("奥迪A4",500.0,4),new PassengerCar("马自达6",400.0,4),
    			new Pickup("皮卡雪6",450.0,4,2),new PassengerCar("金龙",800.0,20),new Truck("松花江",400.0,4)
    			,new Truck("依维柯",1000.0,20) };
    	System.out.println("欢迎使用答答租车系统");
    	System.out.print("您是否要租车，1是0否：");
    	in = new Scanner(System.in);
    	int m = in.nextInt();
    	if(m==1) {
    		System.out.println("您可租车的类型及其价目表：");
    		System.out.println("序号\t汽车名称\t租金\t\t容量");
    		int j = 1;
    		for(Cars currentcar:car) {
    			if(currentcar instanceof PassengerCar) {
    				System.out.println(""+j+"\t"+((PassengerCar)currentcar).getName()+"\t"+
    			((PassengerCar)currentcar).getRentmoney()+"元/天\t载人："+((PassengerCar)currentcar).getPeopleCapacity()+"人");
    				j++;
    			}
    			else if(currentcar instanceof Pickup) {
    				System.out.println(""+j+"\t"+((Pickup)currentcar).getName()+"\t"+
    		    			((Pickup)currentcar).getRentmoney()+"元/天\t载人："+((Pickup)currentcar).getPeopleCapacity()+
    		    			"人，载货："+((Pickup)currentcar).getCargoCapacity()+"吨");

    				j++;
    			}
    			else if(currentcar instanceof Truck) {
    				System.out.println(""+j+"\t"+((Truck)currentcar).getName()+"\t"+
    		    			((Truck)currentcar).getRentmoney()+"元/天\t载货："+((Truck)currentcar).getCargoCapacity()+"吨");
    				j++;
    			}
    		}
    		
    		int num = getNum();//获取租车数量
    		int []nums = getNums(num);//获取租车列表
    		int days = getDays();//获取租车天数
    		int sumPeople = 0;
    		int sumWeight = 0;
    		double sumMoney = 0;
    		//displayCheck(num,days,nums);
    		System.out.println("您的账单：");
    		System.out.println("***可载人的车有：");
    		for(int i=0;i<nums.length;i++) {
    			if(car[nums[i]-1] instanceof PassengerCar) {
    				System.out.print(car[nums[i]-1].name+"\t");
    				sumPeople +=car[nums[i]-1].peopleCapacity;
    			}
    			else if(car[nums[i]-1] instanceof Pickup ) {
    				System.out.print(car[nums[i]-1].name+"\t");
    				sumPeople +=car[nums[i]-1].peopleCapacity;
    			}
    			
    		}
    		System.out.println("共载人："+sumPeople+"人");
    		System.out.println("***可载货的车有：");
    		for(int i=0;i<nums.length;i++) {
    			if(car[nums[i]-1] instanceof Pickup) {
    				System.out.print(car[nums[i]-1].name+"\t");
    				sumWeight +=car[nums[i]-1].cargoCapacity;
    			}
    			else if(car[nums[i]-1] instanceof Truck) {
    				System.out.print(car[nums[i]-1].name+"\t");
    				sumWeight +=car[nums[i]-1].cargoCapacity;
    			}
    			
    		}
    		System.out.println("共载货："+sumWeight+"吨");
    		System.out.println("***租车总价格：");
    		for(int i=0;i<nums.length;i++) {
    			sumMoney +=car[nums[i]-1].rentmoney;
    		}
    		System.out.println(sumMoney*days);
    		
    		
    	}
    	else {
    		System.out.println("您进错网页，请返回");
    		
    	}
    	
    }
 /*   private static void displayCheck(int num, int days, int[] nums) {
		// TODO Auto-generated method stub
    	//int sumMoney = 0;
    	System.out.println("您的账单：");
		System.out.println("***可载人的车有：");
		for(int i=0;i<nums.length;i++) {
			if(car[i] )
		}
		System.out.println("***可载货的车有：");
		System.out.println("***租车总价格：");
		
	}*/
	private static int[] getNums(int num) {
		// TODO Auto-generated method stub
		    int []nums= new int[num];
		    for(int n=0;n<num;n++) {
			System.out.println("请输入第"+(n+1)+"辆车的序号");
			s = new Scanner(System.in);
			nums[n] = s.nextInt();
			if(nums[n]<=0||nums[n]>6)System.out.println("输入数据有误，请重新输入");
		}
		return nums;
	}
	private static int getDays() {
		// TODO Auto-generated method stub
		System.out.println("请输入租车的天数：");
		d = new Scanner(System.in);
		
		return d.nextInt();
	}
	public static int getNum() {
    	System.out.println("请输入租车的数量：");
    	 n = new Scanner(System.in);
    	return n.nextInt();
	}
}
