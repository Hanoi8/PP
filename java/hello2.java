import java.util.*;
public class hello2{
	public static void main(String[]args){
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		int ans=hello(a,b);
		System.out.println("ランダムの値は"+ans+"です");
	}
	static void hello (String M){
		for(int i=0;i<5;i++){
			System.out.println("hello");
		}
	}
	static int hello (int a, int b){
		int x=new Random().nextInt(b+(a+1))+a;
		return x;
		}
	
}
