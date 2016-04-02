public class Multiplication{

	public static void main(String[] args)
	{
		System.out.println("Test Multiplication in my computer by Java platform");
		float result = 0;
		float first = Float.valueOf(args[0]);
		float second = Float.valueOf(args[1]);
		result = first * second;
		System.out.println("Result is: " + first + " * " + second + " = " + result);
	}

}