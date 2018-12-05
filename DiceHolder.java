import java.util.ArrayList;
public class DiceHolder{
	public DiceHolder{
		holder = new ArrayList<>();
	}
	public void shake(){
		for(int i=0;i<holder.size();i++){
			holder.set(i, ((int)(Math.random()*6)+1));
		}
	}
}