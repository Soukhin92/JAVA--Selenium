package functionLibrary;

//Create a class Counter with a static variable count that increments every time an object is created.
// Print total count of objects created.
public class staticVarInstanceVariable {
    static int counterVariable=0;
    public int instanceVar=20;

    //default constructor
    staticVarInstanceVariable(){
        System.out.println("inside default/main constructor");
        instanceVar=instanceVar+1;
        System.out.println("instanceVar value from constructor"+ instanceVar);
        counterVariable=counterVariable+1;
        System.out.println("counterVariable value from constructor"+ counterVariable);

    }

    public static void main(String[] args) {
        staticVarInstanceVariable object1= new staticVarInstanceVariable();
        staticVarInstanceVariable object2= new staticVarInstanceVariable();
    }

//    Result:
//    inside default/main constructor
//    instanceVar value from constructor21
//    counterVariable value from constructor1
//    inside default/main constructor
//    instanceVar value from constructor21
//    counterVariable value from constructor2




}
