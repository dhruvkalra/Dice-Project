public class Die{
	private  int sides;
	private  int value;
	public Die(){
		sides = 6;
		value = (int)(sides * Math.random() + 1);
	}

	public Die(int sides){
		this.sides = sides;
		value = (int)(sides * Math.random() + 1);
	}

	public  int getSides(){
		return sides;
	}
	public  int getValue(){
		return value;
	}
	public  void roll(){
		value = (int)(sides * Math.random() + 1);
	}

	public String toString(){
		return "Number of sides: " + (sides) + ", Value: " + (value);
	}


}