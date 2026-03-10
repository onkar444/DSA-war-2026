class LongestSubstringWithUniqueCharacters{
  public static void main(String args[]){
    String s = "abcabcbb";
    int maxLen=0;
    int left = 0;
    var set = new HashSet<Character>();
    for(int right = 0;right<s.length();right++){
      while(set.contains(s.charAt(right)){
        set.remove(s.charAt(left);
        left++;
      }
      set.add(s.charAt(right));
      maxLen=Math.max(maxLen, right-left+1);
    }

    System.out.println("MaxLen::"+maxLen);
  }
}
