
// this is is important thing in java you should know

        HashMap<Integer, Integer> store = new HashMap<>();   // this like set in python  or js 
        ArrayList<Integer> Array = new ArrayList<>();        // this is like normal list in pyhton or js like this []
        ArrayList<Object> myList = new ArrayList<>();  // this is how define an object in java   this like js =>    const app  ={  name : "ghaith",age:33} 
        ArrayList<Person> ListOfPerson = new ArrayList<>();  // this is list of object the simualtion this in js or python is  like this    [ {}  , {} , {}]
        class Person  {
            String name;                                    //  this in pyhton like this  class Person():  
             int age ;                                                                     def __init(self,name,age)
                                                                                               self.name = name , self.age = age 
          Person(String name,int age){                                                        
             this.name = name;
              this.age  = age;

          }    
    
   
        }  

//  and instance of this like if you wanna to send object in ArrayList should be  define the object and then do this
//  mylist.aadd(new Person("ghaith",33));
// and this gonna working like =>><<
















import java.util.HashMap;
import java.util.ArrayList;



 class Person{
    int age;
    String name;
    boolean active;
    
    Person(int age,String name,boolean active){
      this.age = age;
      this.name  = name;
      this.active = active;
    } 
     
    } 
       
       
       
public class Main {
 
  
   
   
    static <T> void print(T redux){
        System.out.println(redux);
        
         
    } 
    
  
  
  
  
  static void Fn(ArrayList <Person> objectr){
     
       for(Person loop: objectr){
         System.out.println(loop.name+" "+loop.age+" "+loop.active);
        
        } 
         
    } 


    static void go(ArrayList <Person> r ){
       System.out.println("person after sort");
        System.out.println(r);
       boolean  test = true;
       while (test) {
       test = false;
         for(int i =0;i<r.size()-1;i++){
         if(r.get(i).age >r.get(i+1).age) {
           Person aux = r.get(i);
           r.set(i,r.get(i+1));
           r.set(i+1,aux);
           test = true;
          
             }
          
          }  
       
        }   
       
       System.out.println("person before sort");
       System.out.println(r);
     
     }
     
     
   static void fn( ArrayList <Person> ListOfPerson){
    
       
       for(Person index :ListOfPerson){
          
           System.out.println(index.name+" "+index.age+" "+index.active);
          } 
          
    }    
   
  
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 4};

       // this coocked HashMap
        HashMap<Integer, Integer> store = new HashMap<>();
        ArrayList<Integer> Array = new ArrayList<>();
        ArrayList<Object> myList = new ArrayList<>();
        ArrayList<Person> ListOfPerson = new ArrayList<>();

        for (int Numberv : array) {
            Array.add(Numberv);
            if (store.containsKey(Numberv)) {
                store.put(Numberv, store.get(Numberv) + 1);
            } else {
                store.put(Numberv, 1);
            }
        }

        System.out.println("HashMap: " + store);
        System.out.println("Before sort: " + Array);
      

        boolean test = true;
           while (test) {
          test = false;
          for (int i = 0; i < Array.size() - 1; i++) {
              if (Array.get(i) > Array.get(i + 1)) {
                  int aux = Array.get(i);
                  Array.set(i, Array.get(i + 1));
                  Array.set(i + 1, aux);
                  test = true;
              }
          }
      }

        myList.add(10);             // Integer
        myList.add("Gaith");        // String
        myList.add(true);           // Boolean
        myList.add(3.14);           // Double


        System.out.println("After sort: " + Array);
        
        
        System.out.println("After myList: " + myList);
     
         // ADD ARRAY OF LIST
         ListOfPerson.add(new Person(43,"ghaith",true));
         ListOfPerson.add(new Person(10,"wajih",false));
         ListOfPerson.add(new Person(34,"hassen",true));
         fn(ListOfPerson); // this is name of the classes
         go(ListOfPerson);
         Fn(ListOfPerson);
         print(ListOfPerson);
        
    }
}




















import java.util.Arrays;

static void say(Object value) {
    if (value instanceof Object[]) {
        System.out.println(Arrays.deepToString((Object[]) value));
    } else if (value instanceof int[]) {
        System.out.println(Arrays.toString((int[]) value));
    } else {
        System.out.println(value);
    }
}

