/**
	Класс реализует калькулятор
  */
public class calculator{
	/**
		Результат вычисления
	*/
	private int result;

	/**
		Суммируем аргументы
		@param params Аргументы суммирования
	*/
	public void add(int ... params)
	{
		this.result = params[0] * params[1];
	}

	/**
		Получить результат
		@return результат вычисления
	*/
	public int getResult(){
		return this.result;
	}

	/**
		Очистить результат вычисления
	*/
	public void clearResult()
	{
		this.result = 0;
	}
}