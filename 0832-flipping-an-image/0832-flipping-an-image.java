class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            rev(image[i]);
        }
        for(int i=0;i<image.length;i++){
            comp(image[i]);
        }
     return image;
    }
    public static void rev(int arr[]){
        int st=0;
        int end=arr.length-1;
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public static void comp(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]^=1;
        }
    }
}