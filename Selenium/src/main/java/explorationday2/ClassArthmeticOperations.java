package explorationday2;

public class ClassArthmeticOperations {
int a,b;
public void Add()
{
	int sum=a+b;
	System.out.println("Addition Value is "+sum);
	}
public void Sub()
{
	int Sub=a-b;
	System.out.println("Subtracation Value is "+Sub);
	}
public void Mul()
{
	int Mul=a*b;
	System.out.println("Multiplication Value is "+Mul);
	}
public void Div()
{
	int Div=a/b;
	System.out.println("Division Value is "+Div);
	}
public void Mod()
{
	int Mod=a/b;
	System.out.println("Mod Value is "+Mod);
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	ClassArthmeticOperations AO =new ClassArthmeticOperations();
//	AO.Add(10,20);
}
}