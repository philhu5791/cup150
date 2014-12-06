package cup150;
import java.util.LinkedList;

public class c3_7 {
	LinkedList<Dog> dogs;
	LinkedList<Cat> cats;
	int order;
	
	public c3_7(){
		dogs=new LinkedList<Dog>();
		cats=new LinkedList<Cat>();
		order=0;
	}
	
	public void enqueue(Animal a){
		order++;
		a.order=order;
		if(a instanceof Dog){		
			dogs.add((Dog)a);
		}else{
			cats.add((Cat)a);
		}
	}
	
	public Animal dequeque(){
		if(cats.peek().order<dogs.peek().order){
			//cat is older
			return cats.poll();
		}else{
			return dogs.poll();
		}
		
	}
	
	public Dog dequequeDog(){
		return dogs.poll();
	}
	
	public Cat dequequeCat(){
		return cats.poll();
	}	

}
