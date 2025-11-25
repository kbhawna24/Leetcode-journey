class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> output = new ArrayList<>();
        List<Integer> input = new ArrayList<>();
        for(int l: arr)
        input.add(l);
        int start_idx = binarySearch(arr,x);
        System.out.println(start_idx);
        
        int i = start_idx - 1;
        int j = start_idx;
        
        
        while(k>0){
            if(i<0)
            j++;
            else if(j>=arr.length)
            i--;
            
            else if(Math.abs(arr[i] - x) <= Math.abs(arr[j]-x) )
                i--;
            else
            j++;

            k--;
            
        }
    
        output = input.subList(i+1,j);

        return output;
        
    }
    public int binarySearch(int[] arr, int x){
        int l = 0;
        int r = arr.length - 1;
        while(l<=r){
            int m = (l+r)/2;
            if (arr[m] == x)
            return m;
            else if(arr[m] > x)
            r = m-1;
            else
            l = m + 1;
        }
        return l;
    }
}