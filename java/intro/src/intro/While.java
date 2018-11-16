package intro;
//646570   // while loop
public class While {
public static void main(String[] args) {
	 long startTime = System.nanoTime();
	int value=0;
//	boolean bool=value<5;
//	System.out.println(bool);
//	long endTime = System.nanoTime();
//	System.out.println("Difference : " + (endTime - startTime));
//}
//}

while(value<10){

value=value+1;

long endTime = System.nanoTime();
System.out.println(value);
System.out.println("Difference : " + (endTime - startTime));

}
}
}
