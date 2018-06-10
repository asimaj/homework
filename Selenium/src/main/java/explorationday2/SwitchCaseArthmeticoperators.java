package explorationday2;

public class SwitchCaseArthmeticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2=20;
		String operations="Modulus";
		switch(operations)
		{

		case "ADD" :
			System.out.println(num1+num2);
			break;

		case "Sub":
			System.out.println(num1-num2);
			break;

		case "Multiply":
			System.out.println(num1*num2);
			break;
		case "Division":
			System.out.println(num1/num2);
			break;
		case "Modulus":
			System.out.println(num1%num2);
			break;

		}
	}

}

