import java.util.*;
class BaseK
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        long a=sc.nextInt();
        long b=sc.nextInt();
        long dA=0;
        int i=0;
        while(a!=0)
        {
            dA+= (a%10)*(long)Math.pow(k,i++);
            a/=10;
        }
        i=0;
        long dB=0;
        while(b!=0)
        {
            dB+=(b%10)*(long)Math.pow(k,i++);
            b/=10;
        }
        System.out.println(dA*dB);
    }
}




public int addingCost(int input1, int[] input2, int input3)
{
    int ans=0;
    Queue<Integer> pq= new PriorityQueue<>();
    for(int i:input2)
    {
        pq.add(i);
    }
    while(pq.size()!=1)
    {
        int t1=pq.remove();
        int t2=pq.remove();
        ans+=(t1+t2)*input3;
        pq.add(t1+t2);
    }
    return ans;
}



int marathon(int input1, int input2,int input3[])
{

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for(int i=0;i<input2;i++)
    {
        pq.add(input3[i]);
    }
    for(int i=input2;i<input1;i++)
    {
        if(pq.peek()<input3[i])
        {
            pq.remove();
            pq.add(input3[i]);
        }
    }
    int ans=0;
    while(!pq.isEmpty())
        ans+=pq.remove();
    return ans;

}




int maxMarks(int input1, int input2[])
{

    Arrays.sort(input2);
    int ans=input2[0];
    int pre=ans;
    for(int i=1;<input1;i++)
    {
        if(pre>=input2[i])
        {
            ans+=(pre+1);
            pre++;
        }
        else
        {
            pre=input2[i];
            ans+=input2[i];
        }
    }
    return ans;




}