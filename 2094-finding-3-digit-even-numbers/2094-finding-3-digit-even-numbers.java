class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<digits.length;i++){
            if(hm.containsKey(digits[i])){
                int temp=hm.get(digits[i]);
                hm.put(digits[i],temp+1);
            }
            else{
                hm.put(digits[i],1);
            }
        }

        for(int i=100;i<1000;i+=2){
            int a=i/100;
            int b=(i/10)%10;
            int c=i%10;
            if(hm.containsKey(a) && hm.get(a)>0){
                  hm.put(a,hm.get(a)-1);
                   if(hm.containsKey(b) && hm.get(b)>0){
                       hm.put(b,hm.get(b)-1);
                        if(hm.containsKey(c) && hm.get(c)>0){
                            hm.put(c,hm.get(c)-1);
                            list.add(i);
                            hm.put(c,hm.get(c)+1);
                        }
                         hm.put(b,hm.get(b)+1);
                   }
                    hm.put(a,hm.get(a)+1);
            }
        }
   int arr[]=new int[list.size()];
       for(int i=0;i<arr.length;i++){
           arr[i]=list.get(i);
       }
       Arrays.sort(arr);
       return arr;
    }
}