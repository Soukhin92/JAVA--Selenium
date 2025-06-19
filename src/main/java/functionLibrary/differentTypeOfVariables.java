package functionLibrary;

public class differentTypeOfVariables {
    public int instanceVar;
    public static int staticVar;

    public void methodNew(int localVar){
        staticVar++;
        System.out.println(instanceVar);
        System.out.println(localVar);
    }

    public static void methodStatic(){
        staticVar=staticVar+1;
        System.out.println(staticVar);

    }

    public static void main(String[] args) {
        differentTypeOfVariables obj=new differentTypeOfVariables();
        staticVar=10;
        obj.instanceVar=10;
        obj.methodNew(50);
        System.out.println("statcVar"+staticVar);


        differentTypeOfVariables obj1=new differentTypeOfVariables();
        obj1.instanceVar=15;
        obj1.methodNew(55);
        System.out.println("statcVar"+staticVar);



    }






}
