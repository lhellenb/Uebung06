package p3;

public class P3_main {
	public static void main(String[] args) {
		int[] a= {1,2,3,-4};
		methode(a);
		System.out.println(methode(a));
	}
	public static int methode(int[] a) {
		
		if(a.length<2) {
			return -1;
		}
		int max=-1;
		int[] b = new int[a.length];
		for (int f=0;f<=a.length-1;f++) {
			b[f]=Math.abs(a[f]);
		}
		
		
		int k=a.length-1;
		for (int i=0;i<=k;i++) {
			for (int j=0;j<=k;j++) {
				if (a[j]>a[i]) {
					max=a[j];
				}	
			}
		} return max;
	}
}
