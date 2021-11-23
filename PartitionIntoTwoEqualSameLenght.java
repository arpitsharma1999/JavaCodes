import java.util.*;
public class PartitionIntoTwoEqualSameLenght
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        System.out.print(countWays(arr, 0,0,n/2, 0,sum ));

    }
    static int countWays(int [] arr, int i,int j ,int n ,int tsum,int sum)
    {
        if(j==n && tsum==sum)
            return 1;
        if(tsum>sum || j>n || i==arr.length)
            return 0;
        return countWays(arr,i+1,j+1,n,tsum+arr[j],sum)+countWays(arr,i+1,j,n,tsum,sum);
    }
}
//1,2,3,2,1,-2,3,4