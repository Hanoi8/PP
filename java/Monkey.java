public class Monkey{
		String name;
		int num;
		void hello(){
				System.out.printf("Hello%s(%d)です。nice to meet u!!!%n",this.name,this.num);
		}
		void taki(){
				System.out.printf("%sは上手に竹馬に乗った！！%n",this.name);
		}
		void saka(){
				System.out.printf("%sはひょいと逆立ちした！！！%n",this.name);
		}
		void end(){
				System.out.println("私はあなたに指図されたくありません...アプリケーションを終了します。");
		}
}
