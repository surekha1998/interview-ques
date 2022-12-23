public class Secondmax
{
    public static void main(String args[])
    {        
        int a[]={8,9,5,6,7,3,2,1};
        for(int i=0;i<a.length;i++)
        {
            int temp=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {   
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
System.out.println("second max element" +a[a.length-2]);
}
}
            
