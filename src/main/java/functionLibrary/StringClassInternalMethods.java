package functionLibrary;

public class StringClassInternalMethods {

    char[] ch={'j','a','v','a','t','p','o','i','n','t'};
    String s=new String(ch);

    public static void main(String[] args) {
        //String Literal
        String fname = "Java";// This creates a new object in String Constant pool and returns a refernce of the String object
        String lname = "Class";
        System.out.println("using + symbol"+fname+" "+ lname);
        fname.concat(lname);
        System.out.println("using concat method"+ fname.concat(lname));
        fname.toUpperCase();//print string in uppercase, toLowerCase()



        String newstr=new String("Hello");
        String newstr1=new String("Hello");
        newstr=newstr.intern();//intern is used to make strings created with new keyword to also follow string contsnt pools validation
        newstr1=newstr1.intern();
        System.out.println(newstr==newstr1);

        String sentence="My name is Java";
        String word="JAVA";
        String word1="Java";
        System.out.println(word.equalsIgnoreCase(word1));
        System.out.println(sentence.contains(word1));
    }



}
