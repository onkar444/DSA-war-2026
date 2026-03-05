/*Longest Consecutive sequence in array*
public class Solution{
  public static void main(String args[]){
      int nums = {1,2,6,7,8};
      if(nums.length==0){
         println("No Sequence");
         return;
      }  

      var set  = new HashSet<Integer>();
      for(int i : nums){
        set.add(i);
      }

      int longestSeq = 0;
      for(int i : set){
          if(!set.contains(i-1){
            int curr = i;
            int seq = 1;

            while(set.contains(curr+1){
              curr++;
              seq++;
            }
          }

        longestSeq=Math.max(longestSeq,seq);
      }

      prinltn("Longest::"+longestSeq);
  }
}
