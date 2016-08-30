/**
	����� ��������� �����������
  */
public class calculator{
	/**
		��������� ����������
	*/
	private int result;

	/**
		��������� ���������
		@param params ��������� ������������
	*/
	public void add(int ... params)
	{
		this.result = params[0] * params[1];
	}

	/**
		�������� ���������
		@return ��������� ����������
	*/
	public int getResult(){
		return this.result;
	}

	/**
		�������� ��������� ����������
	*/
	public void clearResult()
	{
		this.result = 0;
	}
}