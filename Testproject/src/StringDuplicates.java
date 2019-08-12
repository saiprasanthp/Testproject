import java.util.Arrays;

//string duplicates
public class StringDuplicates {

	public static void main(String[] args) {
		
		
		String s="my class is a term";//yclier
		char[] k=s.toCharArray();
		Arrays.sort(k);
		char[] mm=new char[30];
		int h=0;
		for(int i=0;i<k.length-1;i++) {
			if(k[i]!=k[i+1]) {
				mm[h]=k[i];
				h++;	
			}	
		}
		mm[h]=k[k.length-1];
		for(char w:mm) {
			System.out.println(w);
		}
	}
}