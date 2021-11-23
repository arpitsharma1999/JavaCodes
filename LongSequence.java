import java.util.*;
class LongSequence
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        }
        for(int i=1;i<n;i++)
        {
            arr[i]+=arr[i-1];
        }
        long x=sc.nextLong();
        long ans = n*(x/arr[n-1]);
        x=x%arr[n-1];
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>x)
            {
                ans+=i+1;
                break;
            }
        }
        System.out.println(ans);
        

    }
}