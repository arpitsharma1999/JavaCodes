import java.util.*;
class Main
{
  public static void main(String arg[])
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
    System.out.println(getDiffInMxMn(arr));
  }
  static int getDiffInMxMn(int arr[])
  {
    int n=arr.length;
    int itm[]=new int[n+1];
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    int maxid=-1;
    for(int i=0;i<n;i++)
    {
        itm[arr[i]]++;
    }
    int pfxMax[]=new int[n+1];
    
    
    pfxMax[n]=itm[n];
    for(int i=n-1;i>=1;i--)
    {
        pfxMax[i]=Math.max(pfxMax[i+1],itm[i]);
    }
    

    int ans=0;
    for(int i=n-1;i>=1;i--)
    {
       
        if(pfxMax[i+1]>itm[i]  && pfxMax[i+1]!=0 && itm[i]!=0)
            ans=Math.max(pfxMax[i+1]-itm[i],ans);
    }
    return ans;

    }
}




/*
 static char getAlpha(int id )
  {
      if(id<=26)
        return (char)(id+'A'-1);
      return getAlpha(sumOfDigit(id));
  }
  static int sumOfDigit(int id)
  {
      int sum=0;
      while(id!=0)
      {
          sum+=id%10;
          id/=10;
      }
      return sum;
  }*/