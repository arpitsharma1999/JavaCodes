import java.util.*;
class FGoperation
{
    public static void main(String arg[])
    {
        int m=998244353;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        long dp[]= new long[10];
        dp[arr[0]]=1;
        for(int i=1;i<n;i++)
        {
            //System.out.println(i);
            long tmp[]=new long[10];
            for(int j=0;j<10;j++)
            {
                
                if(dp[j]>0)
                {
                    int t=(j*arr[i])%10;
                    tmp[t] = ((tmp[t]%m) +(dp[j]%m))%m;
                    //System.out.println(t+"    "+(j+arr[i])%10);
                    t=(j+arr[i])%10;
                    tmp[t] = ((tmp[t]%m) +(dp[j]%m))%m;
                }
            }
            dp=tmp;
        }
        for(int i=0;i<10;i++)
            System.out.println(dp[i]);
    }
}