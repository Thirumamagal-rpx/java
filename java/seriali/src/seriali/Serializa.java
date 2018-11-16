package seriali;

import java.io.*;



class Emp implements Serializable {
	
	private static final long serialVersionUID = 8961458351021091593L;
	
transient int a;
     private static int b;
    String name;
    int age;
 
    // Default constructor


@SuppressWarnings("static-access")
public Emp(String name, int age, int a, int b)
    {
        this.name = name;
        this.age = age;
        this.a = a;
        this.b=b;
    }
//@Override
//public String toString() {
//  return "Person [id=" + id + ", name=" + name + "]";    arrays
//}

public static int getB() {
	return b;
}

public static void setB(int b) {
	Emp.b = b;
}
}
 
public class Serializa {

public static void printdata(Emp object1)
    {
 
        System.out.println("name = " + object1.name);
        System.out.println("age = " + object1.age);
        System.out.println("a = " + object1.a);
        System.out.println("b = " + Emp.getB());
    }
 


public static void main(String[] args)
    {
        Emp object= new Emp("ab", 20, 2, 1000);
        String filename = "file.txt";
// Person[] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob")};
//        
//   ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));     //arrays
       
        //// Serialization
        try {
 
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream
                                           (filename);
            ObjectOutputStream out = new ObjectOutputStream
                                           (file);
 
            // Method for serialization of object
            out.writeObject(object);
//            // Write entire array
//            os.writeObject(people);
//            
//            // Write arraylist
//            os.writeObject(peopleList);
//            
//            // Write objects one by one					//arrays
//            os.writeInt(peopleList.size());
//            
//            for(Person person: peopleList) {
//                os.writeObject(person);
//            }
            out.close();
            file.close();
 
            System.out.println("Object has been serialized\n"
                              + "Data before Deserialization.");
            printdata(object);
 
            // value of static variable changed
            Emp.setB(2000);
        }
 
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
 
        object = null;
 
        // Deserialization
        try {
 
            // Reading the object from a file
            FileInputStream file = new FileInputStream
                                         (filename);
            ObjectInputStream in = new ObjectInputStream
                                         (file);
 
            // Method for deserialization of object
            object = (Emp)in.readObject();
 
            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                                + "Data after Deserialization.");
            printdata(object);
 
            ////// System.out.println("z = " + object1.z);
//            // Read entire array
//            Person[] people = (Person[])os.readObject();
//            
//            // Read entire arraylist
//            @SuppressWarnings("unchecked")
//            ArrayList<Person> peopleList = (ArrayList<Person>)os.readObject();
//            
//            for(Person person: people) {
//                System.out.println(person);
//            }
//            
//            for(Person person: peopleList) {
//                System.out.println(person);						//arrays
//            }
//            
//            // Read objects one by one.
//            int num = os.readInt();
//            
//            for(int i=0; i<num; i++) {
//                Person person = (Person)os.readObject();
//                System.out.println(person);
//            }
        }
 
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
 
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                                " is caught");
        }
    }
}