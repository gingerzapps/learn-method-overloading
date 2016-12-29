

/*
 * Method overloading is when you create multiple methods using the same name
 * while using different parameters (this is how they are differentiated
 * 
 * See the code below for an example 
 */


public class MethodOverload {
	public static void main(String[] args){
		add("This is a", "string");	//add(String, String) is called
		add(3, 5);					//add(int, int) is called
	}
	
	
	//this method adds strings together (concatenates them)
	static void add(String str1, String str2){
		String result = str1 + str2;
		System.out.println("The new string is: " + result);
	}
	
	//while this method adds integers together
	static void add(int int1, int int2){
		int result = int1 + int2;
		System.out.println("The new number is: " + result);
	}
}
