package Encapsulation.object;

public class DogApp {
public static void main(String[] args) {
	Dog obj=new Dog("jhoney","white",8,"nature");
	System.out.println(obj.getname()+" "+obj.getcolor()+" "+obj.getage()+" "+obj.getbreed()+" ");
}
}
