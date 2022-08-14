package Practice;



public class ThisSuper {
	 int x=100;
	
	public  void thisSuper() {
		int x=200;
	System.out.println(this.x+":"+x);	
		
	}
	public static void main(String[] args) {
		new ThisSuper().thisSuper();
	}

}
