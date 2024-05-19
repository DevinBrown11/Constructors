//Constructors - Coding with John

//Constructors - type of method used to create new objects.
// For Example: Dog myDog1 = new Dog(); - This is calling a Dog Constructor method to create a new Dog object.
//When creating a class, Java creats a default Constructor otherwise known as a Default no args Constructor.
//Constructors take in no arguments that is why why there is nothing in the parenthesis.
// If you try to print "myDog.name" you will get "null" because the default constructor doesn't set any of the fields on an object.
// Constructor Method will always be the class name. Ex: public Dog() {} - this is what Java gave us, empty Dog object.
// no return types in a contructor.
// Can customize Constructor methods to add values to the objects fields.
//Can set Parameters on Constructor Methods.
// To refer to the field on the object and not the parameter type "this.name = name" so Java knows you don't mean the parameter because it automatically thinks that.
//int age and String name is what you call field on the object.
//Can create Constructors that take more than one parameter.
//Instead of having 2 seperate Constructor methods. You can make 1 with 2 parameters set.
// Inorder to run default no args constructor, you must include it in the program. For ex: public Dog() {}
// If we provide a Constructor ourselves then Java won't provide the no args constructor.

//Can have more than one Constructor, but have to have different types of Parameters.
// For example: You can't have a String as your parameter for different Constructor Methods, it has to be another type.
//To prevent making a new Constructor set the default Constructor to private.




//1. Now set parameters for the constructor method and set both field on the object and parameters to same value so you can store the value in the Parameter from the main method.
public class Constructors {
  public static void main(String[] args) {
    Dog myDog = new Dog("Devin",4);
    System.out.println(myDog.name + " " + myDog.age);
  }
}

//2. Create a Constuctor method that can take more than one parameter and print from main method with a string in between.
public class Constructors {
 public static void main(String[] args) {
   Dog myDog = new Dog("Devin",4);
   System.out.println(myDog);
  }
}
