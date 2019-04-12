public class Bar extends Foo{
	
	public Bar (){
		
	}
	
	public void Doo() {
		for(int i = 0;i < super.bins.size();i = i + 3) {
			
			((Bin) bins.get(i)).Pop();
			
		}
		for(int i = 1;i < super.bins.size();i = i + 3) {
			
			((Bin) bins.get(i)).Pop();
			
		}
		for(int i = 2;i < super.bins.size();i = i + 3) {
			
			((Bin) bins.get(i)).Pop();
			
		}	
	}
}
