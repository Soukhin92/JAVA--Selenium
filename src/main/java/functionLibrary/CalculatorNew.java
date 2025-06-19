package functionLibrary;

public class CalculatorNew {
    int a;
    int b;
    int c;
    public void addition(){
        c=a+b;
        System.out.println(c);
    }
    public void substraction(){
        if(a>b){
            c=a-b;
        }
        else{
            c=b-a;
        }
        System.out.println(c);
    }


    public static void main(String[] args) {
        CalculatorNew obj=new CalculatorNew();
        obj.a=10;
        obj.b=13;
        obj.addition();

        CalculatorNew obj1=new CalculatorNew();
        obj1.a=20;
        obj1.b=22;
        obj1.addition();



    }
}
