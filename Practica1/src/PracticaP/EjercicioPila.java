package PracticaP;
import java.util.LinkedList;
import java.util.Queue;
public class EjercicioPila {

	public static void main(String[] args) {
	 Queue<Integer> Qu= new LinkedList <>();
	 
	 	for(int i=0;i<10;i++) {
	 		Qu.add(i);
	 	}
	 	
	 		System.out.print(Qu.toString()); //muestra el Queue
	 		Qu.remove(); 
	 		System.out.println();
	 		System.out.print(Qu.toString());	//muestra el Queue despues de borrar el primero
	 		Qu.remove(9);
	 		System.out.println();
	 		System.out.print(Qu.toString());
	 		System.out.println();
	 		System.out.println(Qu.size());
	 		
	 	
	 
	}

}
