pack com.sd.turtle;
import ch.aplu.turtle.*;

public class SwirlSquare{

	public static void makeSwirlSquare(int size){
	int bigger=15;
	int turns=20;
	double degree=90.0;
	for(int i=0;i<turns;i++) 
	if (i%2!=0) {
        size+=bigger;
	}
	
	t1.forward(size);
	t1.right(degree);	

	}


	public static void main(String[] args){
	makeSwirlSquare t1=new makeSwirlSquare();
	t1.makeSwirlSquare(5);
	}


}