import java.util.*;
public class hello3{
	public static void main(String[]args){
		int a=new Scanner(System.in).nextInt();
		int[] data=new int[a];
			for(int i=0;i<data.length;i++){
				System.out.print((i+1)+"人目：");
				data[i]=new Scanner(System.in).nextInt();
			}
				hello(data);
	}
	static void hello (int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i];j++){
			System.out.print("*");
			}
			System.out.println("");
		}
		}
	
}
