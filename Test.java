package CarRent;
import java.util.Scanner;
public class Test {
    private static Scanner d;
	private static Scanner s;
	private static Scanner n;
	private static Scanner in;
	public static void main(String[]args) {
    	Cars[] car = {new PassengerCar("�µ�A4",500.0,4),new PassengerCar("���Դ�6",400.0,4),
    			new Pickup("Ƥ��ѩ6",450.0,4,2),new PassengerCar("����",800.0,20),new Truck("�ɻ���",400.0,4)
    			,new Truck("��ά��",1000.0,20) };
    	System.out.println("��ӭʹ�ô���⳵ϵͳ");
    	System.out.print("���Ƿ�Ҫ�⳵��1��0��");
    	in = new Scanner(System.in);
    	int m = in.nextInt();
    	if(m==1) {
    		System.out.println("�����⳵�����ͼ����Ŀ��");
    		System.out.println("���\t��������\t���\t\t����");
    		int j = 1;
    		for(Cars currentcar:car) {
    			if(currentcar instanceof PassengerCar) {
    				System.out.println(""+j+"\t"+((PassengerCar)currentcar).getName()+"\t"+
    			((PassengerCar)currentcar).getRentmoney()+"Ԫ/��\t���ˣ�"+((PassengerCar)currentcar).getPeopleCapacity()+"��");
    				j++;
    			}
    			else if(currentcar instanceof Pickup) {
    				System.out.println(""+j+"\t"+((Pickup)currentcar).getName()+"\t"+
    		    			((Pickup)currentcar).getRentmoney()+"Ԫ/��\t���ˣ�"+((Pickup)currentcar).getPeopleCapacity()+
    		    			"�ˣ��ػ���"+((Pickup)currentcar).getCargoCapacity()+"��");

    				j++;
    			}
    			else if(currentcar instanceof Truck) {
    				System.out.println(""+j+"\t"+((Truck)currentcar).getName()+"\t"+
    		    			((Truck)currentcar).getRentmoney()+"Ԫ/��\t�ػ���"+((Truck)currentcar).getCargoCapacity()+"��");
    				j++;
    			}
    		}
    		
    		int num = getNum();//��ȡ�⳵����
    		int []nums = getNums(num);//��ȡ�⳵�б�
    		int days = getDays();//��ȡ�⳵����
    		int sumPeople = 0;
    		int sumWeight = 0;
    		double sumMoney = 0;
    		//displayCheck(num,days,nums);
    		System.out.println("�����˵���");
    		System.out.println("***�����˵ĳ��У�");
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
    		System.out.println("�����ˣ�"+sumPeople+"��");
    		System.out.println("***���ػ��ĳ��У�");
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
    		System.out.println("���ػ���"+sumWeight+"��");
    		System.out.println("***�⳵�ܼ۸�");
    		for(int i=0;i<nums.length;i++) {
    			sumMoney +=car[nums[i]-1].rentmoney;
    		}
    		System.out.println(sumMoney*days);
    		
    		
    	}
    	else {
    		System.out.println("��������ҳ���뷵��");
    		
    	}
    	
    }
 /*   private static void displayCheck(int num, int days, int[] nums) {
		// TODO Auto-generated method stub
    	//int sumMoney = 0;
    	System.out.println("�����˵���");
		System.out.println("***�����˵ĳ��У�");
		for(int i=0;i<nums.length;i++) {
			if(car[i] )
		}
		System.out.println("***���ػ��ĳ��У�");
		System.out.println("***�⳵�ܼ۸�");
		
	}*/
	private static int[] getNums(int num) {
		// TODO Auto-generated method stub
		    int []nums= new int[num];
		    for(int n=0;n<num;n++) {
			System.out.println("�������"+(n+1)+"���������");
			s = new Scanner(System.in);
			nums[n] = s.nextInt();
			if(nums[n]<=0||nums[n]>6)System.out.println("����������������������");
		}
		return nums;
	}
	private static int getDays() {
		// TODO Auto-generated method stub
		System.out.println("�������⳵��������");
		d = new Scanner(System.in);
		
		return d.nextInt();
	}
	public static int getNum() {
    	System.out.println("�������⳵��������");
    	 n = new Scanner(System.in);
    	return n.nextInt();
	}
}
