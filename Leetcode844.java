public class Leetcode844 {
    public boolean backspaceCompare(String s, String t) 
    {
        Stack<String> st = new Stack<String>();
        Stack<String>st1 = new Stack<String>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
            {
                st.push(s.charAt(i)+"");
            }else if(s.charAt(i)=='#')
            {
                if(st.empty()==true)
                {
                    continue;
                }else{
                st.pop();
                }
            }
        }
        
          for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)!='#')
            {
                st1.push(t.charAt(i)+"");
            }else if(t.charAt(i)=='#')
            {
                if(st1.empty()==true)
                {
                    continue;
                }else{
                st1.pop();
                }
            }
        }
        if(st.equals(st1))
        {
            return true;
        }
        return false;
        
    }
    
}
