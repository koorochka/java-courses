import java.util.Scanner;
/**
  * Класс для запуска калькулятора
  * Поддерживает ввод полльзователя
  * Выбор операции
  * Имеет возможность Очищать предыдущий результат или использовать его в следующих операциях
  */

public class InteractRannerNeo{

	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		try{
			Calculator calc = new Calculator();
			String exit = "no";
			String result = "no";
			String first = "0";
			String operation = "1";
			while(!exit.equals("yes")){
				if(!result.equals("yes")){
					System.out.println("Enter your first argument");
					first = reader.next();
				}
				else{
					System.out.println("The first argument is: " + first);
				}
				System.out.println("Enter your second argument");
				String second = reader.next();
				System.out.println("Choose operation:");
				System.out.println("1: +");
				System.out.println("2: -");
				System.out.println("3: *");
				System.out.println("4: /");
				operation = reader.next();
				if(operation.equals("+"))
				{
					System.out.println("Operation is +");
					calc.sum(Integer.valueOf(first), Integer.valueOf(second));
				}
				if(operation.equals("-"))
				{
					System.out.println("Operation is -");
					calc.deduct(Integer.valueOf(first), Integer.valueOf(second));
				}
				if(operation.equals("*"))
				{

					System.out.println("Operation is *");
					calc.lev(Integer.valueOf(first), Integer.valueOf(second));
				}
				if(operation.equals("/"))
				{

					System.out.println("Operation is /");
					calc.del(Integer.valueOf(first), Integer.valueOf(second));
				}
				System.out.println(first + " " + operation + " " + second + " = " + calc.getResult());
				System.out.println("Use this result in next calculation (yes/no)");
				result = reader.next();
				if(!result.equals("yes")){
					System.out.println("Do you want to cansel work with this programm? (yes / no)");
					exit = reader.next();
				}
				else{
					first = String.valueOf(calc.getResult());
				}
				calc.cleanResult();
			}
		} finally{
			reader.close();
		}
	}

}