package functionLibrary.ConditionalStatementConcepts;

public class Duplicate {
    public static void main(String[] args) {
        String name = "automation";
        String onlyDup = "";
        char[] chararray = name.toCharArray();
        for (int i = 0; i < chararray.length-1; i++) {
            int count = 1;
            for (int j = i + 1; j < chararray.length; j++) {
                if (String.valueOf(chararray[i]).equalsIgnoreCase(String.valueOf(chararray[j]))) {
                    count += count;
                } else
                    continue;
                }
            if(!onlyDup.toUpperCase().contains(String.valueOf(chararray[i]))){
                onlyDup=onlyDup+String.valueOf(chararray[i]);
                System.out.println(String.valueOf(chararray[i])+"times:"+count);
            }

            }

        }


}

