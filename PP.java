import java.util.*;
public class PP{
		public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
				while(true){
						System.out.print("国の気温:1...寒い 2...暑い>");
						int weather=sc.nextInt();
						System.out.print("日数:1...5日以内 2...5日以上>");
						int day=sc.nextInt();
						System.out.print("料金:1...20万以内 2...70万以上>");
						int price=sc.nextInt();
						if(weather==1 && day==1 && price==1){
								System.out.println("1.ウラジオストク観光or2.モンゴル遊牧民体験");
								System.out.print("どちらにいきますか>");
								int place=sc.nextInt();
								weather+=1;
								city(weather,day,price,place);
								break;
						}else if(weather==1 && day==1 && price==2){
								System.out.println("1.上海豪遊ツアーor2.中国秘境ツアー");
								System.out.print("どちらにいきますか>");
								int place=sc.nextInt();
								weather+=1;
								city(weather,day,price,place);
								break;
						}else if(weather==1 && day==2 && price==1){
								System.out.println("1.北欧2カ国観光or2.モスクワ観光");
								System.out.print("どちらにいきますか>");
								int place=sc.nextInt();
								weather+=1;
								city(weather,day,price,place);
								break;
						}else if(weather==1 && day==2 && price==2){
								System.out.println("1.カトマンズ、エベレスト付近散策or2.パタゴニア散策");
								System.out.print("どちらにいきますか>");
								int place=sc.nextInt();
								weather+=1;
								city(weather,day,price,place);
								break;
						}else if(weather==2 && day==1 && price==1){
								System.out.println("1.ベトナムの冒険or2.台湾プチ豪遊");
								System.out.print("どちらにいきますか>");
								int place=sc.nextInt();
								city(weather,day,price,place);
								break;
						}else if(weather==2 && day==1 && price==2){
								System.out.println("1.シンガポール豪遊or2.香港、マカオギャンブル旅");
								System.out.print("どちらにいきますか>");
								int place=sc.nextInt();
								city(weather,day,price,place);
								break;
						}else if(weather==2 && day==2 && price==1){
								System.out.println("1.バリ、プチ豪遊or2.タイの島めぐり");
								System.out.print("どちらにいきますか>");
								int place=sc.nextInt();
								city(weather,day,price,place);
								break;
						}else if(weather==2 && day==2 && price==2){
								System.out.println("1.アメリカ西海岸休暇or2.フランス南プロバンス休暇");
								System.out.print("どちらにいきますか>");
								int place=sc.nextInt();
								city(weather,day,price,place);
								break;
						}else{
								System.out.println("入力に間違えがあります");
						}

				}

		}
		static void city(int weather, int day, int price, int place){
				int x=weather+day+price+place;
				if(x>6){
						System.out.println("保険の加入をオススメします");
				}else{
						System.out.println("保険の加入は必要ありません");
				}
		}
}
