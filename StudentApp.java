package Encapsulation.object;

public class StudentApp {
public static void main(String[] args) {
	
	Student obj=new Student(1,"pram",100,"male");
	System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getMarks()+" "+obj.getGender());
}
}
