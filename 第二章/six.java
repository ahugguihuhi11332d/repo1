package zuoye;

public class six {

	public static void main(String[] args){
		int arr[]=new int[20];
		for(int i=0;i<arr.length;i++) {
			int num=(int)(Math.random()*(459-77)+77);
			arr[i]=num;
			System.out.print(arr[i]+" ");
		}
		int max=0,sum=0,aver=0;
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
			sum=sum+arr[i];
		}
		aver=sum/arr.length;
		System.out.println("最大值是"+max);
		System.out.println("最小值是"+min);
		System.out.println("和是"+sum);
		System.out.println("平均值是"+aver);
	}
			
		}
			

	


