import java.util.*;
public class hello5{
	public static void main(String[]args){
		int a=new Scanner(System.in).nextInt();
		int[] data=new int[a];
			for(int i=0;i<data.length;i++){
				System.out.print((i+1)+"人目：");
				data[i]=new Scanner(System.in).nextInt();
				
		}	
				hello(data);
	}
	static void hello (int[] array){
		for(int i=0;i<array.length/2;i++){
			int temp=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp;
		}
			for(int j=0;j<array.length;j++){
			System.out.println((j+1)+"人目："+array[j]);
				}
		}
	
}
