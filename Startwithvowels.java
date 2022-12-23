public class Startwithvowels
{
    public static void main(String args[])
    {
        String s=" Dravid is writing a novel about the wildlife of america";
        String a[]=s.split(" ");
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i].startsWith("a")||a[i].startsWith("e")||a[i].startsWith("i")||a[i].startsWith("o")||a[i].startsWith("u"))
            {
                count=count+1;
            }
        }
        System.out.println("given sentence "+count+" words starts with vowels");
}
} 

