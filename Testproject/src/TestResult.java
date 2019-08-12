
public class TestResult {

	public static void main(String[] args) {
		String name="bananas";    //bans
		
	char[] k=	name.toCharArray();
	String s="";
	int counter=0;
	
	for(int i=0;i<k.length;i++) {
		
		counter=0;
		for(int j=i+1;j<k.length;j++) {
			
			if(k[i]==k[j]) {
				
				s=s.concat(Character.toString(k[i]));
				break;
				
				
			}else {
				counter++;
			}
			
		}
		if(counter>=1) {
			if(s.contains(Character.toString(k[i]))){
				counter++;
				
				
			}else {
				break;
			}
		}
	}
	System.out.println(s);
	
	
		

	}

}
