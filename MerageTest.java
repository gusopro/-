import java.util.Scanner;
public class MerageTest {
	public static void main(String[] args) {
		System.out.println("请输入几个数并用逗号隔开：");
		  Scanner sc = new Scanner(System.in);
		  String str = sc.next().toString();
		  String[] arr  = str.split(",");
		  int[] a = new int[arr.length];
		  for(int j = 0; j<a.length;j++) {
		   a[j] = Integer.parseInt(arr[j]);
		  }
		  mergesort(a,a.length);
	}
	public static void merage(int a[],int temp[],int left,int mid,int right) 
	{
		int lp=left;
		int rp=mid+1;
		int p=left;
		while(lp<=mid && rp<=right)
		{
			if(a[lp]<=a[rp])
				temp[p++]=a[lp++];
			else
				temp[p++]=a[rp++];
		}
		while(lp<=mid)
			temp[p++]=a[lp++];
		while(rp<=right)
			temp[p++]=a[rp++];
		while(left<=right)
		{
			a[left]=temp[left];
			left++;	
		}
	}
	public static void msort(int a[],int temp[],int left,int right) 
	{
		if(left<right) 
		{
			int mid=(left+right)/2;
			msort(a,temp,left,mid);
			msort(a,temp,mid+1,right);
			merage(a,temp,left,mid,right);
		}
	}
	public static void mergesort(int a[],int n) 
	{
		int [] temp=new int[n];
		msort(a,temp,0,n-1);
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%d ",a[i]);
		}
	}
}
