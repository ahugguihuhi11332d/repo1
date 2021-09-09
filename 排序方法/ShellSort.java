package zuoye;

public class ShellSort {
	public static void sort(int a[]) {
		for(int step=a.length/2;step>0;step/=2) {
			for(int i=step;i<a.length;i++) {
				int value=a[i];
				int j;
				for(j=i-step;j>=0&&a[j]>value;j-=step) {
					a[j+step]=a[j];
				}
				a[j+step]=value;
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {48,5,89,80,81,23,45,16,2};
		sort(a);
		for(int i:a) {
			System.out.print(i+"\t");
		}
	}
	}