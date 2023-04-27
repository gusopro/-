import java.util.Scanner;

public class NumberTa {
	public static void main(String[] args) {
		maxAdd();
	}
	public static void maxAdd() {
		int a[][][]=new int[50][50][4];
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入数塔的层数：");
		n=sc.nextInt();
		System.out.println("请输入此数塔：");
		for(i=1;i<=n;i++) 
		{
			for(j=1;j<=i;j++)
			{
				a[i][j][1]=sc.nextInt();
				a[i][j][2]=a[i][j][1];
				a[i][j][3]=1;
			}
		}
		for(i=n-1;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				if(a[i+1][j][2]>a[i+1][j+1][2]) 
				{
					a[i][j][2]=a[i][j][2]+a[i+1][j][2];
					a[i][j][3]=0;
				}
				else 
				{
					a[i][j][2]=a[i][j][2]+a[i+1][j+1][2];
					a[i][j][3]=1;
				}
			}
		}
		System.out.print("此数塔从顶到底路径最大和为：");
		System.out.println(a[1][1][2]);
		j=1;
		System.out.print("此数塔从顶到底路径最大和所走过的路径为：");
		for(i=1;i<=n-1;i++) 
		{
			System.out.printf("%d-->",a[i][j][1]);
			j=j+a[i][j][3];
		}
		System.out.println(a[n][j][1]);
	}
}
