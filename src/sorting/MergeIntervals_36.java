package sorting;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals_36 {

    static Solution s;

    public static void main(String[] args) {
        s = new Solution();
        int[][] sol = s.merge( new int[][]{ {1,3}, {2,6}, {8,10}, {15,18} } );
        System.out.println(Arrays.deepToString(sol));
    }

    static class Solution {
        public int[][] merge(int[][] intervals) {
            //sort by start time
            //cycle thru all, if j[start] < i[end] ->merge

            Arrays.sort(intervals, (a, b) ->
                    Integer.compare(a[0], b[0]));
            LinkedList<int[]> merged =
                    new LinkedList<>();
            for(int[] interval : intervals){
                if(merged.isEmpty()||merged.getLast()[1]<interval[0]){
                    merged.add(interval);
                }
                else{
                    merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
                }
            }
            return merged.toArray(new int[merged.size()][]);


        }
    }
}
