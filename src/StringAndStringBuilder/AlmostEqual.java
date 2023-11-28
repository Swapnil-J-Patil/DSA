package StringAndStringBuilder;

public class AlmostEqual {
    public static void main(String[] args) {
        String s1 = "bank", s2 = "kanb";
        System.out.println(areAlmostEqual(s1,s2));
    }
    public static boolean areAlmostEqual(String s1, String s2) {
        int count = 0;
        int temp1[] = new int[26];
        int temp2[] = new int[26];

        for(int i=0; i<s1.length(); i++){
            int a1 = s1.charAt(i)-'a';
            int a2 = s2.charAt(i)-'a';          //here we got the integer value of character

            temp1[a1]++;                //here the array values at index a1 and a2 will be 1 e.g(0 0 0 1 0 0)
            temp2[a2]++;
        }
        for(int i=0; i<temp1.length; i++){
            if(temp1[i]!=temp2[i])
                return false;           //here we will compare whether 1 is present at same index or not
                                        //this will check whether words have same letters or not
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i))
                count++;                //here we will increase the counter if same values are not there

            if(count>2)
                return false;           //if counter exceeds 2 then more swaps will be required hence return false
        }
        return true;
    }
}
