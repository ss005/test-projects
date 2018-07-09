import java.util.ArrayList;
import java.util.List;

public class Temp {
	
	class Inner {
		@Override
		public String toString() {
			return super.toString();
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Object> arraylist = new ArrayList<>();
		arraylist.add("Hello") ;
		
		System.out.println(Temp.Inner.class);
		int i = 0 ;
		Temp temp = new Temp();
		System.out.println(Temp.class);
		
	}

}
