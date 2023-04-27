import java.util.Scanner;
public class QuickSortTest {
	public static void main(String[] args) {
		System.out.println("请输入几个数并用逗号隔开：");
		  Scanner sc = new Scanner(System.in);
		  String str = sc.next().toString();
		  String[] arr  = str.split(",");
		  int[] a = new int[arr.length];
		  for(int j = 0; j<a.length;j++) {
		   a[j] = Integer.parseInt(arr[j]);
		  }
		  QuickSort(a,0,a.length-1);
		  System.out.println("升序排序的序列如下所示：");
		  for(int p=0;p<a.length;p++){
			  System.out.print(a[p]+" ");
		  }
	}
	public static void QuickSort(int a[],int low,int high) {
		int point=a[low];
		int begin=low;
		int end=high;
		while(low<high) {
			while(low<high && a[high]>=point) {
				high--;
			}
			a[low]=a[high];
			while(low<high && a[low]<=point) {
				low++;
			}
			a[high]=a[low];
			a[low]=point;
			int point1=low;
			QuickSort(a,begin,point1-1);
			QuickSort(a,point1+1,end);
		}
	}
}
