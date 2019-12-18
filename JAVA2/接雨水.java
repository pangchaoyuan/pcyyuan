class Solution {
    public int trap(int[] height) {
        int a = 0;
        int water = 0;
        int b =0;
         for(int i =0;i<height.length;i++){
             int maxleft = height[i];
             int maxright = height[i];
             for(int j=i;j>0;j--){
                a= height[j-1] > height[j]? height[j-1]:height[j];
                if (a>maxleft) maxleft = a;
             }for(int j =i+1;j<height.length;j++){
                 b = height[j]>height[j-1]? height[j]:height[j-1];
                 if(b>maxright) maxright = b;
             }

             int max = maxleft>maxright?maxleft:maxright;
             int min = maxleft<maxright?maxleft:maxright;
             if(max==height[i]||min == height[i]){
                 water = water;
             }else{
              water+= (min-height[i]);
             } 
             
         }
         return water;
    }
}