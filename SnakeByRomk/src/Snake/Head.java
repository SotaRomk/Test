package Snake;
//import java.util.Scanner;
import java.util.Date;

public class Head {
	
	public int x,y,speed,length,step=0,color; 
		   boolean stopflag;
		   long nachalo = System.currentTimeMillis();
	int [] telo = new int [100];	
	//public Head() {		// TODO Auto-generated constructor stub			}	
	void Start()
	{ 
		CreateWindow okno = new CreateWindow();
		int temp; String temp1="";
		x=10;y=10;speed=1;stopflag=false;length=3;telo[length-2]=x;telo[length-1]=y;telo[length]=x;telo[length+1]=y;
		
		do {		
		temp=(int) (Math.random() * 4);
		okno.Draw(x, y, step);
		switch 	(temp) {
		case 0: temp1= "up"; break;
		case 1: temp1= "down"; break;
		case 2: temp1= "left"; break;
		case 3: temp1= "right"; break;
		}
		//for (int i=0; i<=10; i++) {this.printcoordinate(); this.mov(temp1);}
		this.mov(temp1);

		} while (!stopflag);
	
		//HeadMoving.move;
	}
	
	void mov(String direction) {
		
	//Scan.next();
		Box box1 = new Box();
		box1.Create();
		step++;
		color=box1.color;
		
		//telo[length]=0;
		recalculate();
		
		switch (direction) {
		case "up": { 
			if (y+1==box1.y) 
			{this.eat();}; 
			y = y + 1;} 
			break;
		case "down": { 
			if (y-1==box1.y) 
			{this.eat();}; 
			y = y - 1 ;} 
			break;
		case "left": { 
			if (x-1==box1.x) 
			{this.eat();}; 
			x = x - 1 ;} 
			break;
		case "right": { 
			if (x+1==box1.x) 
			{this.eat();}; 
			x = x + 1 ;} 
			break;
		}
	
	//if ();
		System.out.print(y+" "+telo[1]+" "+direction+"|"+"("+length+") ");
	//check eating himself
	if (length>=4) {;}
	//check out of game field
	if (x==21 || x == 0 || y == 0 || y == 21) 
		{
		//stopflag=true; 
		this.Stop();
		}

		
	}
	
	void Stop() {
		stopflag=true; 
		System.out.println();
		System.out.println("Stop "+"x: "+x+" y: "+y+" speed: "+speed+" length: "+length+"  "+"step: "+step+"  ");
		System.out.println(System.currentTimeMillis() - nachalo + " миллисекунд");
	}
	
	void eat() {

	length++;	
	
	System.out.println("E A T !!! "+color); 
	
	}
	
	void recalculate() {
		int j=length*2,i=length;
		
		
	do {		
	
		telo[j]=telo[j-2];
		telo[j-1]=telo[j-3];
		j=j-2;
	}	
	
	while (j<=0) ;
	telo[0]=x;telo[1]=y;
	};
	
	void printcoordinate()
	{
		System.out.println("x: "+x+" y: "+y+" speed: "+speed+" length: "+length+"  "+"step: "+step+"  ");
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
