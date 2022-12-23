public class Duplicatepara
{
    public static void main(String args[])
    {
        String s="Paragraph is useful when we want to explain or clarify something,such as an object, a person,a concept, or a situation. When we illustrate, we show how something is as we point out when we illustrate with examples,we give instances that show or prove to the readers. So they can see for themselves how something is as we claim it to be.";
        String x[]=s.split(" ");
        for(int i=0;i<x.length;i++)
        {
            int count=0;
            for(int j=i+1;j<x.length;j++)
            {
                if(x[i].equals(x[j]))
                {
                    count=count+1;
                }
            }
        System.out.println(x[i]+"had" +count+ " duplictaes");
        }
    }
}
            
