// Access modifiers
/*

in java , access modifiers are keywords that define the visibility
and accessibility of classes , methods , and variables. They define
where class members ( properties and methods ) can be accessed
1)
   keyword : public
   visibility : from any class in any package
   usage : when we want our members to access universally.

2) Private
   keyword: Private
   visibility: only inside the class level

3) Protected
   keyword : protected
   visibility: members is protected can be accessed within the same package.

4) Default : (package -private)

    keyword: No modifier for default
    visibility: If no access modifier is specified , the member is accessible only
    with in classes in the same package.
    or we can say that it is package private concept.
 */

/*
   // non access modifiers

   in java , non access modifiers are keywords that provide additional functionality to
   classes , methods and variables. unlike access modifiers ( such as
   public / private / protected / default )

  1) Static key word ( Non access modifiers )
     keyword: static
     usage : it belongs to the class , means there it not need to create an object to
     access the static members , with the help of class name only we can access the static members directly.

  2) final non access modifier:
      keyword : final
      Usage:    prevents further modification of a variable, methods or classes.
             1) if a variable is final , means we can not change its value
             2) If a method is final
  3) Abstract

    keyword : Abstract
    USage : used to declare a class that can not be instantiated and may contain
    abstract methods ( methods without a body that must be implemented in subclasses)

 behaviour change : if a class is Abstract then we can not create an object of that class
 or we can not instantiate that class

 */

package accessModifierDemo;

public class A
{
     static int a ;
     int age_a;
     final public int age_d =10;

    final public void displayAgeA(){

        System.out.println("I am in display_Age A");
    }

    public static void main(String[] args) {

         A obja = new A();
         A.a=10;

         // pi = 22/7;





    }
}
