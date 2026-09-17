// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {

//         HashMap<Integer, Integer>map=new HashMap<>();

//         for(int num :nums){
//             map.put(num,map.getOrDefault(num,0)+1);
//         }

//         List<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
//         list.sort((a,b)->b.getValue()-a.getValue());
        
//         int[]result=new int[k];
//         for(int i=0;i<k;i++){
//             result[i]=list.get(i).getKey();
//         }
//         return result;
//     }
// }

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        //This is for building Minheap based on frequency
        PriorityQueue<Integer> pq =
            new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        // Keep only k elements
        for (int num : map.keySet()) {
            pq.add(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Build answer
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        return result;
    }
}