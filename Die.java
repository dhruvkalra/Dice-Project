public class Die{
	private int sides;
	private int value;
	public Die(){
		sides = 6;
		value = (int)(sides * Math.random() + 1);
	}

	public Die(int sides){
		this.sides = sides;
		value = (int)(sides * Math.random() + 1);
	}

	public static int getSides(){
		return sides;
	}
	public static int getValue(){
		return value;
	}
	public static void roll(){
		value = (int)(sides * Math.random() + 1);
	}

	public String toString(){
		return "Number of sides: " + toString(sides) + ", Value: " + toString(value);
	}


}