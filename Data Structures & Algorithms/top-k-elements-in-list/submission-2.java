class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int maxfreq = 0;
        for(int i =0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])>maxfreq){
                maxfreq = mp.get(nums[i]);
            }
        }
       
        int[] res = new int[k];
        List<Integer> myList = new ArrayList<>();
        while(myList.size()<k && maxfreq>0){
            for(int i =0;i<nums.length;i++){
                if(mp.get(nums[i])==maxfreq && !myList.contains(nums[i]) && myList.size()<k){
                        myList.add(nums[i]);
                }
                if(myList.size()==k){
                    break;
                }
            }
            maxfreq--;
        }
        int t =0;
       for(int it: myList){
        res[t] = myList.get(t);
        t++;
       }
       
        return res;
    }
}
