import java.util.Arrays;

public class STRINGPRACTICEQ4 {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        //converting strings to lower case for simplicity
        str1 = str1.toLowercase();
        str2 = str2.toLowerCase();

        //check if the lengths are same or not
        if(str1.length() == str2.length()){
            //convert strings into character arrays
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the character array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            boolean result = Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println(str1 + "and" + str2 + "are anagrams of each other.");
            }
            else{
                System.out.println(str1 + "and" + str2 + "are not anagrams of each other.");
            }
            }
            else{
                //when lengths are not equal
                System.out.println(str1+ "and" + str2 + "are not anagrams of each other");
        }
    }
}
