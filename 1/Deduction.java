public class Deduction{
	
	public static void main(String[] args)
	{
		System.out.println("Deduction sample");
		float result = 0;
		float first = Float.valueOf(args[0]);
		float second = Float.valueOf(args[1]);
		result = first - second;
		System.out.println(first + " - " + second + " = " + result);
	}

}