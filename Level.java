public class Level{
	
	public static void main(String[] args)
	{
		System.out.println("Up programm paramrter to Level");
		int param = Integer.valueOf(args[0]);
		int result = param * param;
		System.out.println("Result is: " + param + " * " + param + " = " + result);
	}

}