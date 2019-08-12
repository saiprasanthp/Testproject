
public class TestStrings {

	public static void main(String[] args) {
		String name="MorniMong";
	char[] k=	name.toCharArray();
	int counter = 0;
	
	for(int i=0;i<k.length;i++) {	
		for(int j=i+1;j<k.length;j++) {
			
			 counter=1;
			if(k[i]==k[j]) {
				counter++;
				break;
			}
		}
		if(counter==1) {
			System.out.println(k[i]);
			break;
			
		}
	}
	
	
	for(int i=k.length;i>0;i--) {
		
		System.out.println(k[i-1]);
	}

	}
}
