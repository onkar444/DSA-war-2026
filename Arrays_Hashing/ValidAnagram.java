public class ValidAnagram{
  public static void main(String args[]){
    String s = "anagram";
    String t = "nagaram";

    int arr[] = new int[26];
    for(int i=0;i<s.length();i++){
        arr[s.charAt(i)-'a']++;
        arr[t.charAt(i)-'a']--;
    }

    for(int i = 0;i<arr.length;i++){
      if(arr[i]!=0){
        System.out.println("Not Anagrams");
      }
    }

            System.out.println("Anagrams");
  }
}
