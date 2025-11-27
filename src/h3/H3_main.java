package h3;

public class H3_main {
	public static void main(String[] args) {
		int[] a= {1,2,2,3,3,4};
		int[] b= {2,2,3,3,4,1};
		System.out.println(compareArraysVal(a,b));	
		
	}
	
	public static boolean compareArraysVal(int[]a, int[]b) {
		if(a.length != b.length) {
			return false;
		}
		
		
		int[] Anzahl1 = new int [a.length];
		int[] Anzahl2 = new int [b.length];
	
		for(int i=0;i<=a.length-1;i++) {
			int Anzahla=0;
			int Anzahlb=0;
			for(int j=0;j<=a.length-1;j++) {
				if(a[i]==a[j]){
				Anzahla++; }
				
				if(a[i]==b[j]) {
				Anzahlb++; }
			}
		Anzahl1[i]=Anzahla;
		Anzahl2[i]=Anzahlb;
		
		if(Anzahl1[i] != Anzahl2[i]) {
			return false;
		}
		}
		
		return true;
	}
	

}
