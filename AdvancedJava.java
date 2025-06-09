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
// statict type for java this mean exmple all people studnet in school let say harvad 
// ok  and in this school have Type <Person > read in this school so  each <Person> diffrent in auhtor <Person> LIKE <name,age,smart,...>
public class Student {
    static String schoolName = "Tunis High School"; // متغير ثابت

    String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    void printInfo() {
        System.out.println("Name: " + studentName);
        System.out.println("School: " + schoolName); // نستخدم مباشرة static variable
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ahmed");
        Student s2 = new Student("Fatma");

        s1.printInfo();
        s2.printInfo();

        // يمكن الوصول مباشرة لمتغير static بدون كائن
        System.out.println(Student.schoolName);
    }
}
