package zuoye;
import java.util.Scanner;
public class three {

	public static void main(String[] args) {
		System.out.println("请输入两个正整数");
		System.out.print("第一个正整数：");
		Scanner scanner=new Scanner(System.in);
		String one=scanner.nextLine();
		int a=Integer.valueOf(one);
		System.out.print("第二个整数：");
		String two=scanner.nextLine();
		int b=Integer.valueOf(two);
		int temp;
		if(a<b) {
			temp=b;
			b=a;
			a=temp;
		}
		while(b!=0) {
			temp=a%b;
		a=b;
		b=temp;
		}
		System.out.println("最大公因数："+a);
	}

}
