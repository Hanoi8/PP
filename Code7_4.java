import java.util.*;
public class Code7_4{
	public static void main(String[] args){
		Dog dg=new Dog("kaawachi","pagu",26);
		dg.ShowProfile();

	}
}
class Dog{
	String type;
	String name;
	int age;
	Dog(String type,String nm,int age){
		this.name=nm;
		this.age=age;
		this.type=type;
	}
	public void ShowProfile(){
		System.out.printf("名前は%s犬種の%s(%d)です%n",this.type,this.name,this.age);
}
}
