public class Separate{

	public static void main(String[] args)
	{
		System.out.println("Test Separate function on my computer throw java");
		float result = 0;
		float first = Float.valueOf(args[0]);
		float second = Float.valueOf(args[1]);
		result = first / second;

		System.out.println("Result: " + first + " / " + second + " = " + result);
	}

}