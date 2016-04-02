/**
  * Class realize calculator
  */
public class Calculator {
	/**
	  * Состояния объекта передаются
	  * через поля
	  */ 
	private int result;

	/**
	  * Суммируем аргументы
	  * @paramm params - аргументы суммирования
	  */
	public void sum(int ... params){
		for(Integer param : params){
			this.result += param;
		}
	}

	/**
	  * Get Result
	  * @return результат вычисления
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