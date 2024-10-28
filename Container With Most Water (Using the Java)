import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int Maxarea=0;
        while(left<right){
            int currentHeight=Math.min(height[left],height[right]);
            int width=right-left;
            int area=currentHeight*width;
            Maxarea=Math.max(Maxarea,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }

        }
        return Maxarea;
        
    }
}
