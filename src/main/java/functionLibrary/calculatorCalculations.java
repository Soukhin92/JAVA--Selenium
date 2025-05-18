package functionLibrary;

public class calculatorCalculations {

// variables
    // instantiating a variable
    public int a=10;
    public int b;
    public static int c=10;

//method
    public void add(int a, int b){
        int c=a+b;
        System.out.println(c);
    }

    public void add (int a){
        System.out.println("sorry can not add one number");
    }

    public void add (){
        System.out.println("value of b"+b);
    }
    public static void addStatic(){
        System.out.println("inside static method");
        System.out.println("priniting rhe static variable"+ c);
        calculatorCalculations newclass= new calculatorCalculations();
        newclass.b=20;
        newclass.add();
        calculatorCalculations newclass1= new calculatorCalculations();
        newclass1.b=15;
        newclass1.add();


    }

    public static void main(String[] ags){
        System.out.println("inside main method");
        addStatic();

    }
}
