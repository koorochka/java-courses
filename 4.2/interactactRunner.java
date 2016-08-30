import java.util.Scanner;
/**
	Класс для запуска калькулятора. Поддерживает ввод пользователя
*/
public class interactactRunner{

	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			calculator calc = new calculator();
			String exit = "нет";
			while(!exit.equals("да")){
				System.out.println("Вася, введи первое число : ");
				String first = reader.next();
				System.out.println("Вася, введи второе число : ");
				String second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("Произведение : " + first + " * " + second + " = " + calc.getResult());
				calc.clearResult();
				//System.out.println("Вася, ты хочешь закончить? : да/нет ");
				//exit = reader.next();
			}
		} finally{
			reader.close();
		}
	}

}