import java.util.*;
public class hello{
	public static void main(String[]args){
		hello("M");
		String S=new Scanner(System.in).nextLine();
		int n=new Scanner(System.in).nextInt();
		hello(S,n);
		int ans=x(n);
		System.out.println("実行結果は"+ans+"です");
	}
	static void hello (String M){
		for(int i=0;i<5;i++){
			System.out.println("hello");
		}
	}
	static void hello (String S, int n){
		for(int i=0;i<n;i++){
			System.out.println(S);
		}
	}
	static int x(int n){
	if(n==0){
		return 0;
	}else if(n<0){
		return -1;
	}else{
		return 1;
	}
	}
}
