class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result=new ArrayList<>();
        result.add(intervals[0]);
        for(int i=0;i<intervals.length;i++){
            int[] last=result.get(result.size()-1);
            if(intervals[i][0]<=last[1]){
                last[1]=Math.max(last[1],intervals[i][1]);
            }else{
                result.add(intervals[i]);
            }
        }
        int[][] ans=new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}
