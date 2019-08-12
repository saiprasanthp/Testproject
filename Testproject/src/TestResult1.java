import java.util.Arrays;

public class TestResult1 {

	public static void main(String[] args) {
		
		String s1="i am travelling to home";
		char[] a=s1.toCharArray();
		Arrays.sort(a); //
		for(char b:a) {
		System.out.println(b);
		}
		for(int i=0;i<a.length;i++) {
			
			int counter=1;
			for(int j=i+1;j<a.length;j++) {
				
				
				if(a[i]==a[ j]) {
					counter++;
				}else {
					break;
				}
			}
			System.out.println(a[i]+" occurance"+counter);
			i=i+counter-1;
		}
		
		
		
		
		/*char[] l=s1.toCharArray();
		Arrays.sort(l);
		char[] m=new char[20];
		
		int a=0;
		for(int i=0;i<l.length-1;i++) {
		
				
				if(l[i]!=l[i+1]) {
					
					m[a]=l[i];
					a++;
						
			}
				
				m[a]=l[l.length-1];
				
			for(char n:m) {
				System.out.println(n);
			}
		}
*/
	}

}
