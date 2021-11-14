interface LocalVar
{
	int local(int a, int b);
}

public class VarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var c="ram";// In java 11 we dont need to mention primitives before a variable
		var d= 56;	//Instead var keyword is used for type inference
		
		LocalVar varLambda=(var a, var b)->a*b*a; // var keyword can used inside lambda
		//LocalVar varLambda2=(int a, var b)->a+b; // if we are using var keyword for one value inside bracket then we have to mention var for all the values inside the bracket
	}

}
