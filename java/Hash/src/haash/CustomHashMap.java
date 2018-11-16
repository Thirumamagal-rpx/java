package haash;
//TreeMap
//HashMap

import java.util.Map;
import java.util.TreeMap;

class Book {    
int id;    
String name,author,publisher;    
int quantity;    
public Book(int id, String name, String author,  int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.quantity = quantity;    
}  }  

 class CustomHashMap {  
	 	
public static void main(String[] args) {    //, Object TreeMap
    //Creating map of Books    
   // Map<Integer,Book> map=new HashMap<Integer,Book>();   
   Map<Integer,Book> tmap=new TreeMap<Integer,Book>(); 

    //Creating Books    
    Book b1=new Book(101,"Data Communications & Networking","Forouzan",4);    
    Book b2=new Book(102,"Data Communications & Networking","Forouzan",4);    
    Book b3=new Book(103,"Operating System","Galvin",6);    
    //Adding Books to map   
//    map.put(1,b3);  
//    map.put(2,b2);  
//    map.put(3,b1);  
   tmap.put(3,b3);  
    tmap.put(2,b2);  
    tmap.put(1,b1); 
    //Traversing map  
    for(Map.Entry<Integer, Book> entry:tmap.entrySet()){    
        int key=entry.getKey();  
        Book b=entry.getValue();  
        System.out.println(key+" Details:");  
        System.out.println(b.id+" "+b.name+" "+b.author+" : "+b.quantity);   
    }    
}    
}    