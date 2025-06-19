import functionLibrary.constructorUnderstanding;

public class ConstructorAndParameterisedConstructor {
    String username;
    int password;
    static boolean genuine;


    ConstructorAndParameterisedConstructor(){

    }

    ConstructorAndParameterisedConstructor(String username){
        this(12345);
        if(username.equalsIgnoreCase("Rohit")){
            this.username="mentee";
        }
        else if(username.equalsIgnoreCase("Soukhin")){
            this.username="mentor";
        }

    }

    ConstructorAndParameterisedConstructor(int password){
       this.password=password;
    }

    public static void main(String[] args) {
        ConstructorAndParameterisedConstructor thisconcept=new ConstructorAndParameterisedConstructor("Rohit");
        if(thisconcept.username.equalsIgnoreCase("mentee")&& thisconcept.password==12345){
            genuine=true;
        }
       System.out.println("genuine"+genuine);
        ConstructorAndParameterisedConstructor thisconcept1=new ConstructorAndParameterisedConstructor("Soukhin");
        if(thisconcept1.username.equalsIgnoreCase("mentor")&& thisconcept.password==12345){
           System.out.println(genuine);
        }




    }




}
