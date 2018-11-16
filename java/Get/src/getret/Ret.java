package getret;
//can be accessed only through the methods of their current class. -- for Encapsulation
//variables of a class as private.
//provide public setter and getter methods to modify and view the variables values.
// private variables can't be accessed outside the class


 class Ret {
	// public final static int uni=7;
int age;						//instance
String name;  


public void setAge(int age)    //local          //if same parameter names
{
	//age=agee;				// if different parameter names 
	this.age=age;        //instance variable=local variable  
}

public void setName(String name) {
	this.name=name;
}

int getAge() {
	return age;
}

String getName() {
	return name;
}

public void in(String name,int age)
{
	setName(name);
	setAge(age);
}
	public static void main(String[] args) {
		Ret ret1=new Ret();
//		ret1.name="Thiru";		//calling through variable
//		ret1.age=20;
	
		ret1.setName("Thiru");
		ret1.setAge(20);					//calling through methods
		
//int age= ret1.getAge();
//String name=ret1.getName();
//System.out.println(age);
//System.out.println(name);

		//(or)
		
System.out.println(ret1.getName());
System.out.println(ret1.getAge());
//System.out.println(ret1.uni);

	}

}
