import java.util.Scanner;

public class Insertsort {
	
	public static void main(String[] args) {
		System.out.println("请输入几个数并用逗号隔开：");
		  Scanner sc = new Scanner(System.in);
		  String str = sc.next().toString();
		  String[] arr  = str.split(",");
		  int[] a = new int[arr.length];
		  for(int j = 0; j<a.length;j++) {
		   a[j] = Integer.parseInt(arr[j]);
		  }
		insertsort(a);

	}
	public static void insertsort(int a[]) {
		int key=0;
		for(int i=1;i<a.length;i++)
		{
			key=a[i];
			while(i>=1) 
			{
				if(key<a[i-1]) 
				{
					a[i]=a[i-1];
					i--;
				}
				else
					break;
			}
			a[i]=key;
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.printf("%d  ", a[j]);
		}	
	}
}
