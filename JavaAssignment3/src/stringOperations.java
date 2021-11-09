
public class stringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Java String pool refers to collection of String which are stored in heap memory";
		System.out.println("Lower case: "+str.toLowerCase());
		System.out.println("Upper case: "+str.toUpperCase());
		System.out.println("Replace all 'a' with '$': "+str.replace('a','$'));
		if(str.contains("collection"))
		{
			System.out.println("The string contains the word 'collection'");
		}
		else
		{
			System.out.println("The string doesn't contains the word 'collection'");
		}
		if(str.equals("java string pool refers to collection of string which are stored in heap memory"))
		{
			System.out.println("The given string matches with the original string");
		}
		else if(str.equalsIgnoreCase("java string pool refers to collection of string which are stored in heap memory"))
		{
			System.out.println("The given string equals with the original string");
		}
		
				
	}

}
