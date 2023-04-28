import java.util.Scanner;

public class SelectSort {
	public static void main(String[] args) {
		System.out.println("请输入几个数并用逗号隔开：");
		  Scanner sc = new Scanner(System.in);
		  String str = sc.next().toString();
		  String[] arr  = str.split(",");
		  int[] a = new int[arr.length];
		  for(int j = 0; j<a.length;j++) {
		   a[j] = Integer.parseInt(arr[j]);
		  }
		  selectSort(a);
	}
	public static void selectSort(int a[]) 
	{
		for(int i=0;i<a.length-1;i++)      //外层循环遍历排序的趟数
		{
			int index=i;                   //初始化index=i，原因是让每趟的无序数组中的第一个元素等于index
			for(int j=i+1;j<a.length;j++)  //内层循环用来找出后续无序数组中值最小的下标
			{
				if(a[index]>a[j]) 
				{
					index=j;            //利用索引下标来指向选择出每一趟排序时后面所有数中最小的下标。
					                    //而后本次循环过后再进行交换，不会影响原数组中其他数的位置
				}
			}
			if(index!=i)                //判断index是否等于i的目的是：如果index=i，原两个数之间是有序的，无需交换
			{
				int key=a[index];
				a[index]=a[i];
				a[i]=key;
			}
		}
		for(int m=0;m<a.length;m++)
		{
			System.out.printf("%d ", a[m]);
		}
	}
}
