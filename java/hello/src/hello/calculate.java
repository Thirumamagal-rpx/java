package hello;

class call{   //inheritance
	 int Z;

	public void addition(int x, int y) {
		
			Z= x+y;
			System.out.println("addition:"+Z);
		// TODO Auto-generated constructor stub
	}
	
	public void division(int x,int y) {
			Z=x/y;
			System.out.println("division:"+Z);
	
	}
}

 class calculate extends call     //inheritance
	{
				public void mult(int x, int y) {
		super.addition(x, y);	// overriding
			
		Z=x*y;
		System.out.println("multiplication:"+Z);
				}
		
				public void division(int x,int y) {  
					Z=5/2;
					System.out.println("division of:"+Z); //polymorphism
						
				}
				
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		int y=20;
		
calculate result = new calculate();
result.division(x,y);
result.mult(x,y);

	}
	}
