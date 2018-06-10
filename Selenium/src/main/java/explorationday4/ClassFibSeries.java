package explorationday4;
import java.util.Scanner;
public class ClassFibSeries {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=1,a = 0, b = 0, c = 1;
		Scanner S=new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = S.nextInt();
		for(int i=0;i<=n;i++) {
			 
		a=b;
		b=c;
		c=a+b;
		System.out.println("Please enter the number"+c);
			
		}
	}

}
