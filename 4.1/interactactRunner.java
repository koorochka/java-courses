import java.util.Scanner;
/**
	����� ��� ������� ������������. ������������ ���� ������������
*/
public class interactactRunner{

	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			calculator calc = new calculator();
			String exit = "���";
			while(!exit.equals("��")){
				System.out.println("����, ����� ������ ����� : ");
				String first = reader.next();
				System.out.println("����, ����� ������ ����� : ");
				String second = reader.next();
				calc.add(Integer.valueOf(first), Integer.valueOf(second));
				System.out.println("������������ : " + first + " * " + second + " = " + calc.getResult());
				calc.clearResult();
				//System.out.println("����, �� ������ ���������? : ��/��� ");
				//exit = reader.next();
			}
		} finally{
			reader.close();
		}
	}

}