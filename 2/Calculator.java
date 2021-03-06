/**
  * Class realize calculator
  */
public class Calculator {
	/**
	  * ��������� ������� ����������
	  * ����� ����
	  */ 
	private int result;

	/**
	  * ��������� ���������
	  * @paramm params - ��������� ������������
	  */
	public void sum(int ... params){
		for(Integer param : params){
			this.result += param;
		}
	}

	/**
	  * Get Result
	  * @return ��������� ����������
	  */
	public int getResult(){
		return this.result;
	}

	/**
	  * Clear result
	  */
	public void cleanResult(){
		this.result = 0;
	}
}