public class Leetcode844 {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length();
        int n1 = t.length();
        
        
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        int j = -1;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '#' && j>=0){
               sb.deleteCharAt(j);
                j--;
            } else if(s.charAt(i) != '#'){
                sb.append(s.charAt(i));
                j++;
            }
        }
        System.out.println(sb.toString());
        int k = -1;
        for(int i=0;i<n1;i++){
        
            if(t.charAt(i) == '#'  && k>=0){
               sb1.deleteCharAt(k);
                k--;
            } else if(t.charAt(i) != '#'){
                sb1.append(t.charAt(i));
                k++;
            }
        }
         System.out.println(sb1.toString());
        
        
        if(sb.toString().equals(sb1.toString())){
            return true;
        }
        return false;
    }
    
}
