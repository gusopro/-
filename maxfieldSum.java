import java.util.Scanner;

public class maxfieldSum {
	public static void main(String[] args) {
		System.out.println("请输入一组数，中间用逗号隔开：");
		  Scanner sc = new Scanner(System.in);
		  String str = sc.next().toString();
		  String[] arr  = str.split(",");
		  int[] a = new int[arr.length];
		  for(int j = 0; j<a.length;j++) {
		   a[j] = Integer.parseInt(arr[j]);
		  }
			System.out.print(maxZd(a));	
	}
	public static int maxZd(int a[]) 
	{
		int b[]=new int[100] ;
		int ans=0;
		b[0]=ans=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(b[i-1]>0)
				b[i]=b[i-1]+a[i];
			else b[i]=a[i];
			if(ans<b[i])
				ans=b[i];
		}
		return ans;
	}
}
