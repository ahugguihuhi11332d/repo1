package zuoye;

public class Bank {
	public static void main(String[] args) {
		Account zhangSan=new Account("001","张三",1000);
		Account lisi=new Account("002","李四",1000);
		zhangSan.deposite(2000);
		lisi.withdraw(500);
		zhangSan.changeMoney(lisi,300);
		System.out.println("张三的余额是："+zhangSan.getBalance());
		System.out.println("李四的余额是："+lisi.getBalance());
	}
}
