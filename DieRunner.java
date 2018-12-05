public class DieRunner{
	public static void main(String[] args){
		Die x = new Die(6);
		Die y = new Die(6);

		int counter = 0;
		while(x.getValue()!=1 || y.getValue()!=1){
			counter ++;
			x.roll();
			y.roll();
			System.out.println("Run: " + counter);
			System.out.println("Die 1: " +x);
			System.out.println("Die 2: " +y);
			System.out.println();

		}
		System.out.println("Number of tries to get snake eyes: " + counter);

		int a=1;
		while(a>0){
			Die die = new Die((int)(Math.random()*23)+2);
		}
	}
}