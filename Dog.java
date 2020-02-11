import java.util.*;
public class Dog{
	public static void main(String[] args){
		Dogs dg=new Dogs("pagu");
		dg.ShowProfile();

	}
}
class Dogs{
	String name;
	Dogs(String nm){
		this.name=nm;
	}
	public void ShowProfile(){
		System.out.println("名前は、"+this.name+"です");
	}
	
}
