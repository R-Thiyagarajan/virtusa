import java.util.*;
public class Main{
    static int i=0;
    public static void main(String[]args)
    {
        Scanner st=new Scanner(System.in);
        String s=st.next();
        String t=" ";
        i=s.length();
        i=i-1;
        B ts=new B();
        
        
         t= ts.pal(i,s,t)  ;
        
        
        System.out.println(t);
        
    }
}
class B
{
    
    public String pal(int i,String s,String t)
    {
        if(i>=0){
            
        
        if(s.charAt(i)!='\0')
        {
            t =""+s.charAt(i);
            i--;
            
            
               pal(i,s,t);
              else
              return t;
        }
            else
            return t;
        
    }

}
