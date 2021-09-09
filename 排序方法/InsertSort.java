package zuoye;

public class InsertSort {
	public static void sort(int a[]) {
		int j=0;
		int temp=0;
		for(int i=1;i<a.length;i++) {
			temp=a[i];
			for(j=i-1;j>=0;j--) {
				if(a[j]>temp) {
					a[j+1]=a[j];
				}
				else {
					break;
				}
			}
			a[j+1]=temp;
		}
	}

	public static void main(String[] args) {
		int[] b=new int[] {48,5,89,80,81,23,45,16,2};
		sort(b);
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+"  ");
	}
}
