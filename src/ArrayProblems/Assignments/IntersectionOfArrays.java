package ArrayProblems.Assignments;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrays {
    public static void main(String[] args) {

    }
    public int[] intersection(int[] nums1, int[] nums2) {
        int len=nums1.length;
        int re=0;
        int le=nums2.length;
        int arr[] =new int[Math.min(len,le)];
        boolean [] s=new boolean[1000];
        for(int i:nums1){s[i]=true;}
        for(int i:nums2){
            if(s[i]){
                arr[re]=i;
                re++;
                s[i]=false;
            }
        }
        return Arrays.copyOfRange(arr,0,re);
    }
}
