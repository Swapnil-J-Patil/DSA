package StackAndQueue;

import java.util.Stack;
//84. Largest Rectangle in Histogram
public class LargestRectangleArea {
    public static void main(String[] args) {
    int[] arr={2,1,5,6,2,3};
    }
    class Solution {
        public int largestRectangleArea(int[] height) {
            if (height == null || height.length == 0) {
                return 0;
            }
            int[] lessFromLeft = new int[height.length]; // idx of the first bar the left that is lower than current
            int[] lessFromRight = new int[height.length]; // idx of the first bar the right that is lower than current
            lessFromRight[height.length - 1] = height.length;
            lessFromLeft[0] = -1;

            for (int i = 1; i < height.length; i++) {
                int p = i - 1;

                while (p >= 0 && height[p] >= height[i]) {
                    p = lessFromLeft[p];
                }
                lessFromLeft[i] = p;
            }

            for (int i = height.length - 2; i >= 0; i--) {
                int p = i + 1;

                while (p < height.length && height[p] >= height[i]) {
                    p = lessFromRight[p];
                }
                lessFromRight[i] = p;
            }

            int maxArea = 0;
            for (int i = 0; i < height.length; i++) {
                maxArea = Math.max(maxArea, height[i] * (lessFromRight[i] - lessFromLeft[i] - 1));
            }

            return maxArea;
        }
    }
    public static int largestRectangleArea(int[] heights) {

        Stack<Integer> stack=new Stack<>();
        int max=0;

        stack.push(0);

        for (int i = 0; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i]<heights[stack.peek()])
            {
                max=getMax(heights,stack,max,i);
            }
            stack.push(i);
        }

        int i= heights.length;
        while (!stack.isEmpty())
        {
            max=getMax(heights,stack,max,i);
        }
        return max;
    }

    private static int getMax(int[] heights, Stack<Integer> stack, int max, int i) {

        int area;
        int popped=stack.pop();

        if(stack.isEmpty())
        {
            area=heights[popped] *i;
        }
        else
        {
            area=heights[popped] * (i -1 - stack.peek());
        }
        return Math.max(max,area);
    }
}
