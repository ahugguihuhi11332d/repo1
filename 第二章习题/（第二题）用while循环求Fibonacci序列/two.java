package zuoye;

public class two {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		int count=1;
		System.out.print("1 1 ");
		while(count<=28) {
			int temp=a;
			a=b;
			b+=temp;
		System.out.print(b+" ");
		count++;
		}
	}

}
