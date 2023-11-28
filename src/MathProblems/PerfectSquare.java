package MathProblems;

public class PerfectSquare {
    public static void main(String[] args) {

    }
    public static boolean isPerfectSquare(int num) {
        long start=2 , end=num;
        if(num==1) return true;
        while(start<end){
            long mid = start+(end-start)/2;
            if((mid*mid)==num)
                return true;

            else if((mid*mid)>num)
                end=mid;
            else
                start=mid+1;
        }
        return false;
    }
}
