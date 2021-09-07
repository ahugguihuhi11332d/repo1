package zuoye;

public class four {
	public static void main(String[] args) {
		char  letters[]={'a','b','c','c','m','s','a','t','b','c'};
		int count[]=new int[26];
		for(int i=0;i<letters.length;i++) {
			count[letters[i]-'a']++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]>0)
				System.out.println((char)(i+'a')+":"+count[i]);
		}
	}
}
