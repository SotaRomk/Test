package Snake;
import javax.swing.JFrame;

public class Start {

	public Start() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		System.out.println("Start");

		Head zmey = new Head();
		//CreateWindow okno = new CreateWindow();
		//okno.Draw(1, 1);
		zmey.printcoordinate();
		zmey.Start();
		//zmey.printcoordinate();
		//zmey.Stop();
		System.out.println(zmey.getClass().getName()); 
	}

}
