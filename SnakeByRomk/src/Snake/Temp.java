package Snake;

public class Temp {

	public Temp() {
		// TODO Auto-generated constructor stub
	}
	
	void waiting(int delay)
	{
		try { 
	        Thread.sleep(delay); // Замораживает весь поток на 10 секунд
	     } catch (Exception e) { 
	         System.out.println("Получили исключение!"); 
	     }	
	}
}
