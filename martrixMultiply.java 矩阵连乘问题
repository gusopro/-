import java.util.Scanner;

public class martrixMultiply {
	 public static void main(String[] args) {
		 System.out.println("请输入一个矩阵链，中间用逗号隔开：");
		  Scanner sc = new Scanner(System.in);
		  String str = sc.next().toString();
		  String[] arr  = str.split(",");
		  int[] a = new int[arr.length];
		  for(int j = 0; j<a.length;j++) {
		   a[j] = Integer.parseInt(arr[j]);
		  }
	     matrixMultiply(a);
	 }
	 
	//矩阵连乘
	 public static void matrixMultiply(int[] p) {
	        int len = p.length;
	        int[][] m = new int[len][len];
	        int[][] s = new int[len][len];
	        matrixChain(p, len-1, m,s);
	        System.out.println("最优乘法次数：" + m[1][len - 1]);
	        System.out.println("划分规则为：");
	        traceBack(s, 1, len - 1);
	    }

	 //创建最优计算量次序表以及断点k
	 public static void matrixChain(int p[],int n,int m[][],int s[][]) 
	 {
		 for(int i=1;i<=n;i++) 
		 {
			 m[i][i]=0;
		 }
		 for(int r=2;r<=n;r++) 
		 {
			 for(int i=1;i<=n-r+1;i++)
			 {
				 int j=i+r-1;
				 m[i][j]=m[i+1][j]+p[i-1]*p[i]*p[j];
				 s[i][j]=i;
				 for(int k=i+1;k<j;k++)
				 {
					 int t=m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j];
					 if(t<m[i][j]) 
					 {
						 m[i][j]=t;
						 s[i][j]=k;
					 }
				 }
			 }
		 }
	 }
	 //计算断点为s[i][j]时的矩阵加括号方式
	 public static void traceBack(int[][] s, int i, int j) {
	        if(i == j) return;
	        traceBack(s, i, s[i][j]);
	        traceBack(s, s[i][j] + 1, j);
	        System.out.println("Multiply A(" + i + "," + s[i][j] + ")and A(" + (s[i][j] + 1) + "," + j + ")");
	    }
}
