
public class bap extends bin {
	
	public int id = 2;
	
	public void pop () {
		System.out.println("tart");
	}
	
	public void id () {
		System.out.println(id);
	}
	
	public void soda () {
		System.out.println("pop");
	}
	
	public static void main (String argv[]) {
		bap b = new bap();
		bin c = new bin();
		bin d = new bap();
		//d = c;
		b.pop();
		c.pop();
		d.pop();
		b.id();
		c.id();
		d.id();
		b.soda();
		//c.soda();
		//d.soda();
	}

}
