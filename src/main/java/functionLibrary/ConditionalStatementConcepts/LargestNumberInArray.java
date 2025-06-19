package functionLibrary.ConditionalStatementConcepts;

public class LargestNumberInArray {
    public static void main(String[] args) {
        int[] intarray=new int[] {-100,1,1111,3,5,8,2,17,100};
        int max=0;
        for(int i=0;i<intarray.length;i++){
            if(max<intarray[i]){
                max=intarray[i];
            }
        }
        System.out.println("highest"+max);

    }
}
