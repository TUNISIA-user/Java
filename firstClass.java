
// © 2025 Gaith. All rights reserved.
// Source: https://github.com/TUNISIA-usery/firstClass.java
















// this is is important thing in java you should know

        HashMap<Integer, Integer> store = new HashMap<>();   // this like set in python  or js 
        ArrayList<Integer> Array = new ArrayList<>();        // this is like normal list in pyhton or js like this []
        ArrayList<Object> myList = new ArrayList<>();  // this is how define an object in java   this like js =>    const app  ={  name : "ghaith",age:33} 
        ArrayList<Person> ListOfPerson = new ArrayList<>();  // this is list of object the simualtion this in js or python is  like this    [ {}  , {} , {}]
        class Person  {
            String name;                                    //  this in pyhton like this  class Person():  
             int age ;                                                                   //   def __init(self,name,age)
                                                                                             //   self.name = name , self.age = age 
          Person(String name,int age){                                                        
             this.name = name;
              this.age  = age;

          }    
    
   
        }  

//  and instance of this like if you wanna to send object in ArrayList should be  define the object and then do this
//  mylist.aadd(new Person("ghaith",33));
// and this gonna working like =>><<


// methode java for items in top 
// so we have this like for test item (key,value) in the HashMap we Map.containsKey()  or containsvalue() 
// if you wanna do insertion in sidet to their methode called set()  how this working so this => Map.set(key,value)



// for the Array  you have methode like append in pyhton its Array.add( <value> if this was class like this add the value new Person(and here pass your @params));


// in the object Object   like the bfore  should be do Array.add("ghaiht)  :Array.add(22);Array.add("software enginner");


// and the last one its Array type Person    and this prettey easy you can sipmly do this Array.add(new Person("ghaith",33)) ;  

// and in the end i wanna shoow all peopl somehting if   in your mind  you wanna do sort in  table you can  use built in function but this if their exisit this built in function
 // so i suggested to  create your owen methode for do sort and you methode for do  dispaly  cauz the System.out.println(<value>)  its very hard to paste it each tim do i wanna this
// so  firsteval we gonna start how do sort so use bubble sort its east but the truc here
// do var type person like this Person  temp = ListOfpeople.get(i) and i assume i index 0
// and then ListOfpeople.set(i,listOfpeople.get(i+1))
// and then ListOfpeople.set(i+1,aux)
so this in python fucking funny  its like this 
        a = 3
        n = 4
        // just you do tis
        a,n = n,a 
        // or method algorithms you can do just this
        temp =a
        a = n
        n = temp;

// know i would talk about create are function print what you want of the data
// you should do th is static  <T> void(T value ) {
 System.out.println(value);

} 




// this is for object and array  smart ways

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

