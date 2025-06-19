package functionLibrary;

public class RohitJavaClass1 {
    public int age;
    public String name;
    public void employment(int a, int b){
        int c=a+b;
        System.out.println("addition"+c);

    }

    public static void main(String[] args){
        RohitJavaClass1 rjc1= new RohitJavaClass1();
        RohitJavaClass1 rjc2= new RohitJavaClass1();
        rjc2.employment(2,3);

    }

}
