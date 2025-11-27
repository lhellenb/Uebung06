package h1;

public class H1_main {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {4,3,2,1};
		System.out.println(isMirrorArray(a,b));
	}
	
	public static boolean isMirrorArray(int[] a,int[] b) {
		if(a.length != b.length) {
			return false;
		}
		
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]!=b[a.length-1-i]) {
				return false;
			}
		}	
	return true;
	}
	
}
