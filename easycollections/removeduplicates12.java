public class Solution {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String s=scan.nextLine();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
       for(int i=0;i<s.length();i++)  { 
            set.add(s.charAt(i)); 
       }
        for(Character ch : set)   
            System.out.print(ch);   
    }
}
