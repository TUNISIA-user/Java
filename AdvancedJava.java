 class Person{
    int age;
    String name;
    boolean active;
    
    Person(int age,String name,boolean active){
      this.age = age;
      this.name  = name;
      this.active = active;
    } 
   
        @Override
    public String toString() {
        return name+" "+" "+age+" "+active;
    }
     
    } 


    // @Override this methode make the real  value not the adrees
