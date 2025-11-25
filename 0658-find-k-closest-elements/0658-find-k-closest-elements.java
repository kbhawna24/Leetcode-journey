class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> list = new ArrayList<>();
        for(int i: arr)
        list.add(i);
        Collections.sort(list, (a,b) -> {
            int distA = Math.abs(a - x);
            int distB = Math.abs(b - x);

            if (distA == distB) {
                return a - b;
            }
            return distA - distB;

        });
        
        List<Integer> result = new ArrayList<>(list.subList(0, k));
        Collections.sort(result);
        return result;
    }
}