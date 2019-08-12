import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		/*ArrayList<Integer> al=new ArrayList<Integer>();

		al.add(2);
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(4);
		al.add(6);
		al.add(2);
		int[] k=new int[al.size()];

		for(int i=0;i<al.size();i++) {

		int l	=al.get(i);
		k[i]=l;
		}

		for(int l:k) {
			System.out.println(l);
		}

		Arrays.sort(k);

		for(int i=0;i<k.length;i++) {

			int counter=1;
			for(int j=i+1;j<k.length;j++) {


				if(k[i]==k[j]) {
					counter++;
				}else {
					break;
				}
			}
			System.out.println(k[i]+"counter"+counter);
			i=i+counter-1;
		}

	}*/
		/*String s1="sai";
		String s2="ais";
		char[] k=	s1.toCharArray();  //sais
		char[] m=	s2.toCharArray();  //ais
		String name="";
		int counter=1;
		for(int i=0;i<k.length;i++) {
			
			
			for(int d=0;d<m.length;d++) {
					
					if(k[i]==m[d]) {
					
						name=name.concat(Character.toString(k[i]));
						break;
					}
					
				}
			}
		
		System.out.println(name);
		
		if(name.equals(s1)) {
			
			System.out.println("true");
			
		}*/
		
		
		
		
		
		
		
		
		String name1="saiiiss";     //sai
		String name2="";
		int counter=0;
		char[] mm=name1.toCharArray();
		
		for(int i=0;i<mm.length;i++) {
			
			for(int j=i+1;j<mm.length;j++) {
			
			if(name2.contains(Character.toString(mm[i]))) {
				counter++;
			}
			else {
				if(mm[i]==mm[j]) {
					
					
					name2=name2.concat(Character.toString(mm[i]));
					break;
				}else {
					
					String a=Character.toString(mm[i]);
					int d=name1.indexOf(a);
					String q=name1.substring(d);
					if(a.contains(q)) {
						name2.concat(a);
					}else {
						name2.concat(a);
					}
				}
			}
				
			}
			
			}
		System.out.println(name2);
			
			
		}






	}



















