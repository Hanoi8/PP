public class NoteBook{
		int page;
		int price;
		Book(){
		}
		Book(int page,int price){
				this.page=page;
				this.price=price;
		}
		void show(){
				System.out.printf("ページ数:%d%n料金:%d%n",this.page,this.price);
		}
