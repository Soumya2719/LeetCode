class Solution {
    public int[] findEvenNumbers(int[] digits) {
        
      HashSet<Integer> list=new HashSet<>();

      for(int i=0;i<digits.length;i++){
        for(int j=0;j<digits.length;j++){
            for(int k=0;k<digits.length;k++){
                if(i!=j && i!=k && j!=k){
                      int temp=Integer.parseInt(number(digits[i],digits[j],digits[k]));
                      if(temp%2==0 && temp>99){
                        list.add(temp);
                      }
                }
            }
        }
      }
      int arr[]=new int[list.size()];
      int l=0;
       for(int i:list){
          arr[l++]=i;
       }
      Arrays.sort(arr);
      return arr;
    }
    public static String number(int a,int b,int c){
        String temp=""+a+b+c;
        return temp;
    }
}