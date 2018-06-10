package explorationday1;

public class ClassLearningEscapeCharacters{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Firstname="Asima";
		String Middlename="Urooj";
		String Lastname="Jamsheed";
				
	System.out.println("My name is\n"+Firstname+Middlename+Lastname);	//New line 
	System.out.println("\n");
	System.out.println("Middle Name is\t"+Middlename );	//tab
	System.out.println("\t");
	System.out.println("Last name is :  \b"+Lastname );//back space
	System.out.println("\b");
	System.out.println("My name is \r"+Firstname+Middlename );//Carriage return
	System.out.println("\r");
	System.out.println("My name is\f"+Firstname+Middlename+Lastname); //Space	
	System.out.println("Last name is \""+Lastname );//DoubleQuotes
	System.out.println("First name is \'"+Firstname );	//Single Quotes
	System.out.println("First & Middle name is \\"+Firstname +Middlename );	//backslash
					
	}

}
