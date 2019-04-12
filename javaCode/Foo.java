import java.util.ArrayList;

public class Foo {

	public ArrayList bins = new ArrayList<bin>();
	
	
	public void Doo () {
		
		for(int i = 0; i < bins.size();i++ ){
			
			((bin) bins.get(i)).pop();
				
		}
	}
}
