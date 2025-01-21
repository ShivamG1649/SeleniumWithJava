
class A {
  int a ;
  String name_of_a ;

  public void display_a(){
      System.out.println("I am in A's display method");
  }

}
// class B extends class B , means B can access all members of clas A
class B extends A

{
 int b ;
 String Name_of_b;

 public void display_b(){

     System.out.println("I am in display B method");
 }

}

  public class InheritanceDemo {

    // Name of class  reference = new nameOfClass();
    // object of class b
      // object is userDefined or non -primitive data type

//      B objb = new B();
//      objb.

      public static void main(String[] args) {
          B objb = new B();
          objb.b=10;
          objb.Name_of_b="ABC";
          objb.display_a();
      }

}
