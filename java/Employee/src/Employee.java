
// static variable

class Department {

  
   public static int salary;
  
   public static final String DEPARTMENT = "Development ";
   
 }
 public class Employee{

   public static void main(String args[]) {
	   Department.salary=10000;
     
      System.out.println(Department.DEPARTMENT + "average salary:" + Department.salary);
   }
}