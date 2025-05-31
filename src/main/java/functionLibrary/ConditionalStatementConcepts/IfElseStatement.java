package functionLibrary.ConditionalStatementConcepts;

//understanding local/instance variable difference and usng this keyword
public class IfElseStatement {

    public void conditionalStatement(String name){
        if(name.equalsIgnoreCase("Soukhin")){
            System.out.println("Mentor");
        }
        else if(name.equalsIgnoreCase("Kaustav")){
            System.out.println("student");
        }
        else{
            System.out.println("student");
        }
    }


    public static void main(String[] args){
        IfElseStatement obj=new IfElseStatement();
        obj.conditionalStatement("Soukhin");
        obj.conditionalStatement("Kaustav");
    }


}
