import java.util.*;
public class StudentApp{
		public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
				System.out.print("生徒は何人>");
				int studentNum=sc.nextInt();sc.nextLine();
				Student[] students=new Student[studentNum];
				for(int i=0;i<studentNum;i++){
						System.out.print((i+1)+"人目の名前>");
						String name=sc.nextLine();
						System.out.print((i+1)+"人目の点数>");
						int score=sc.nextInt();sc.nextLine();
						Student student=new Student(i+1,name,score);
						students[i]=student;
				}
				while(true){
						System.out.print("操作を入力:1...登録順に一覧,2...点数降順に一覧,3...終了>");
						int inputNum=sc.nextInt();
						switch(inmputNum){
								case 1:
										for(int i=0;i<studentNum;i++){
												students[i].ans();
										}
								case 2:
										
								case 3:
										break;
						}
				}
		}
		public static sortSudents(Student[]data,String key){
			String[] sort=new [data.length];
			for(int i=0;i<data.length;i++){
				sort[i]=data[i];
			}
		}
}
}
