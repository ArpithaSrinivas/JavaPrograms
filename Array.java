import java.util.Scanner;

public class ArrayExample {
	public static void main (String[] args) {
		
	   double[] pricesofshirt =new double[6];
	   
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the price of each T shirt");
	
		pricesofshirt[0]=in.nextDouble();
		pricesofshirt[1]=in.nextDouble();
		pricesofshirt[2]=in.nextDouble();
		pricesofshirt[3]=in.nextDouble();
		pricesofshirt[4]=in.nextDouble();
		pricesofshirt[5]=in.nextDouble();
		
		double total= pricesofshirt[0]+pricesofshirt[1]+pricesofshirt[2]+pricesofshirt[3]+pricesofshirt[4]+pricesofshirt[5];
		System.out.printf("total price of Tshirt is: $%5.2f ", total);
			
		
	}

}