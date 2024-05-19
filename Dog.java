// The file in which we are calling the fields and Constructor method from. 
// Remember you can create multiple Constructor Methods only if you have different parameters.
public class Dog {
    int age;
    String name;
    
    
    public Dog(String name , int age) {
        // this is able to set the fields name and age as the same value as the parameters name and age.
        this.name = name;
        this.age = age;
        
    }
}
