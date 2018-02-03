package Snake;

public class Box {
	
public int x,y,color;	
	
public Box() {};

public void Create() {
	
	  x=(int) (Math.random() * 20) ; 
	  y=(int) (Math.random() * 20) ;
	  color=1+(int) (Math.random() * 8);
};

};

