
public class Substring
{
    public static void main(String args[])
    {
        String str1="Hello how are you how";
        String str2="how";
        int x=str1.length();
        int count=0;
        int first=str1.indexOf(str2);
        int y=str2.length();
        for(int i=0;i<y;i++)
        {
            for(int j=0;j<x;j++)
            {
            if(str2.charAt(i)==str1.charAt(j)&&str2.charAt(i+1)==str1.charAt(j+1))
             {
                count++;
             }
            }
        }
        System.out.println("Count="+count);
    }
}
    