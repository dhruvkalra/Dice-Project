import java.util.ArrayList;
public class DiceHolder{

	private ArrayList<Die> holder;


	public int addDie(Die die){
		if(holder.size()<6){
			holder.add(die);
			return 1;
			}
		else{
			return -1;
			}
		}

	public String toString(){
		String s="";
		for(int i=0;i<holder.size();i++){
			s+=holder.get(i)+"\n";
			}
		}


}