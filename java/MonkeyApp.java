import java.util.*;
public class MonkeyApp{
		public static void main(String[] args){
				Monkey ningen=new Monkey();
				Scanner sc=new Scanner(System.in);
				System.out.print("おさるの名前を決めてください:>");
				String name=sc.nextLine();
				System.out.print("おさるの年を決めてください:>");
				int x =sc.nextInt();
				ningen.name=name;
				ningen.num=x;
				while(true){
						System.out.print("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
						int y=sc.nextInt();
						if(y==1){
								ningen.hello();
						}else if(y==2){
								ningen.taki();
						}else if(y==3){
								ningen.saka();
						}else{
								ningen.end();
								break;
						}
				}
		}
}
