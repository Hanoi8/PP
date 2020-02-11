import java.util.*;
public class Code7_3{
	public static void main(String[] args){
		Dog dg=new Dog("pagu",26);
		dg.ShowProfile();
		Dog dg2=new Dog("takeda",30);
		dg2.ShowProfile();

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
