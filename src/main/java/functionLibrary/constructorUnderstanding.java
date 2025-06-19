package functionLibrary;

//Create a class Counter with a static variable count that increments every time an object is created.
// Print total count of objects created.
public class constructorUnderstanding {
    String name;
    public void constructorUnderstandingmethod(){
        System.out.println(name);
    }
    constructorUnderstanding(){
        this("Find Your Career");
        System.out.println("default constructor");
    }

    constructorUnderstanding(String newString){
        System.out.println("parameterised constructor");
    }
}

class callingClassNew{
    public static void main(String[] args) {
        constructorUnderstanding obj=new constructorUnderstanding("Find Your Career");
        constructorUnderstanding obj1=new constructorUnderstanding();

//        obj.name = "Kaustav";
//        obj.constructorUnderstandingmethod();

    }
}

