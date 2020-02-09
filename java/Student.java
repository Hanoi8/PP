public class Student{
		int id;
		String name;
		int score;
		public Student(){
		}
		public Student(int id,String name,int score){
			this.id=id;
			this.name=name;
			this.score=score;
		}
		public void ans(){
			System.out.printf("%s   ...%d点%n",this.name,this.score);
		}
}
