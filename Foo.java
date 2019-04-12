import java.util.ArrayList;

public class Foo {

	public ArrayList bins = new ArrayList<Bin>();
	
	
	public void Doo () {
		
		for(int i = 0; i < bins.size();i++ ){
			
			((Bin) bins.get(i)).Pop();
				
		}
	}
}
