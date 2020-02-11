import java.util.*;
public class Code7_2{
	public static void main(String[] args){
		Dog dg=new Dog("pagu",26);
		dg.ShowProfile();

	}
}
class Dog{
	String name;
	int age;
	Dog(String nm,int age){
		this.name=nm;
		this.age=age;
	}
	public void ShowProfile(){
		System.out.printf("名前%s(%d)です%n",this.name,this.age);
}
}
