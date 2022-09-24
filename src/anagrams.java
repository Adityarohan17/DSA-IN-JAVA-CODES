import java.util.Arrays;

public class anagrams {
    public static void main(String args[]){
       
        String str1 = "race";
        String str2 = "care";

        // convert into lowercase //
        str1 =str1.toLowerCase();
        str2 = str2.toLowerCase();

        // check if the length is same or not //
        if(str1.length() == str2.length()){
            char[] str1charArray = str1.toCharArray();
            char[] str2charAraay = str2.toCharArray();
             Arrays.sort(str1charArray);
             Arrays.sort(str2charAraay);

             boolean result = Arrays.equals(str1charArray, str2charAraay);
             if(result){
                System.out.println(str1 + " and " + str2 + " are anagram ");

             }
             else{
                System.out.println(str1 + " and " + str2 + " not anagram " );
             }
            }
             else{
                System.out.println(str1 +" and " +str2+"not anagram");

             }

        }


    }
    

