package cup150;

public class Animal{
	public String name;
	public int order;
	Animal(String n){
		name=n;
	}
	
	public String toString(){
		return name+" "+order;
	}
}