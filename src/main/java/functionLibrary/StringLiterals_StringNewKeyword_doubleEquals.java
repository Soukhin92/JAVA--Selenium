package functionLibrary;

public class StringLiterals_StringNewKeyword_doubleEquals {

    char[] ch={'j','a','v','a','t','p','o','i','n','t'};
    String s=new String(ch);

    public static void main(String[] args) {
        //String Literal
        String name="Kaustav";// This creates a new object in String Constant pool and returns a refernce of the String object
        String name1="Kaustav";// Chceks Str constant pool and  returns a reference of the String object which is the same reference as above
        String name3="Soukhin";
        System.out.println("comparing strings create with Str literals give: "+(name==name1));

        String newName=new String("Kaustav");// Here we create new object of string everytime
        String newName1=new String("Kaustav");// Here we create new object of string everytime
        System.out.println("comparing string created with new keyword gives: "+(newName==newName1));

        //comparing string object and anothere string object
        System.out.println("comparing string created with new keyword and a string created with literal: "+(name==newName));



        name.toUpperCase();
        System.out.println(name);
        String name4=name.toUpperCase();
        name=name.toUpperCase();
        System.out.println(name4);
        System.out.println(name);
    }



}
