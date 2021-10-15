package zuoye;
import java.util.Scanner;
public class one {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("请输入出生年份:");
		Scanner scan=new Scanner(System.in);
		int year=scan.nextInt();
		for(int i=year;i<=year+100;i++) {
		if((i%4==0&&i%100!=0)||(i%400==0))
			sum++;}
		System.out.println("这个人一生过的闰年数："+sum);
	}
}
