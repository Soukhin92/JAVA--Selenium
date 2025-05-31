package functionLibrary;

//Create a class Counter with a static variable count that increments every time an object is created.
// Print total count of objects created.
public class constructorOverloading {
    String name;
    int instanceVar;

    constructorOverloading(){
        System.out.println("default constructor");
        String name="Find Your Career";
        this.name="online class";
        System.out.println(name);
        System.out.println(this.name);
    }

    constructorOverloading(String newString, String newstring2){
        System.out.println("parameterised constructor with 2 string args");
    }

    constructorOverloading(int b, int a){
        System.out.println("parameterised constructor with 2 integer args");
    }
    constructorOverloading(Integer b){
        System.out.println("parameterised constructor with 1 integer arg");
        instanceVar=b;
    }
    constructorOverloading(String newString){
        this();
        System.out.println("parameterised constructor with 1 string arg");
        System.out.println("name"+name);
        System.out.println(newString);
    }
}

class callingClassNew2{
    public static void main(String[] args) {
        constructorOverloading obj1=new constructorOverloading();
    constructorOverloading obj=new constructorOverloading("Find Your Career");

    }
}

