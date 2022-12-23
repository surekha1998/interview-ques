public class Removeduplicates
{
    public static void main(String args[])
    {
        String s="ZAARKRAPPRASS";
        String y="";
        char c[]=new char[s.length()];
        for(int i=0;i<c.length;i++)
        {   
            c[i]=s.charAt(i);
        }
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {   
                    c[j]=' ';
                }
            }
        }
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=' ')
            y=y+c[i];
        }
        System.out.println(y);
    }
}
