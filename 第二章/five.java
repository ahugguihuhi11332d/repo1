package zuoye;
import java.util.Scanner;
public class five {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入要储存的个数");
		int n=input.nextInt();
		double[]numbers=new double[n];
		double sum=0;
		System.out.println("请输入要存储的数字");
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=input.nextDouble();
			sum+=numbers[i];
		}
		double avg=sum/n;
		System.out.println("平均值为："+avg);
		System.out.println("大于平均值"+avg+"的元素有：");
		for(int i=0;i<n;i++) {
			if(numbers[i]>avg) {
				System.out.println(numbers[i]);
			}
		}

	}

}
