package functionLibrary;

//understanding local/instance variable difference and usng this keyword
public class localVariable {
    String name;

    public void localVariableunderstanding(String name){
        System.out.println("inside method");
        System.out.println(name);
        System.out.println(this.name);
    }

}

class callingClassNew1{
    public static void main(String[] args) {
        localVariable obj=new localVariable();
        obj.name="Kaustav";
        obj.localVariableunderstanding("Soukhin");


    }
}

//result:
// inside method
//Soukhin
//Kaustav