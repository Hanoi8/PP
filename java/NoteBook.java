public class NoteBook extends Book{
		String note="";
		Scanner sc=new Scanner(System.in);
		NoteBook(){
		}
		NoteBook(int page,int price){
			this.page=page;
			this.price=price;
		}
		@Override
		void show(){
				System.out.printf("ページ数:%d%n料金:%d%n",this.page,this.price);
		}
		public void writeBook(){
			System.out.print("書き込む内容を入力してください>");
			this.
		}

