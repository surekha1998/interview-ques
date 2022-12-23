public class Aubnc
{
    public static void main(String args[])
    {
        int a[]= { 3,6,5,9,1};
        int b[]= { 9,5,7,6,3};
        int c[]= { 10,5,12,13};
        int x[]= new int [a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            x[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            x[i+a.length]= b[i];
        }
        for(int i=0;i<x.length;i++)
        {
            for(int j=i+1;j<x.length;j++)
            {
                if(x[i]==x[j])
                x[j]=' ';
            }   
        }
    for(int i=0;i<x.length;i++)
    {
        for(int j=0;j<c.length;j++)
        {
            if(x[i]==c[j])
            System.out.println(c[j]);
        }
    }
}
}
