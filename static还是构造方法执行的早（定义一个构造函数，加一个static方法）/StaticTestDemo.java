package test;

public class StaticTestDemo {
	static {
		System.out.println("加载类时我就执行了，比main方法还早。");
	}

	public static void main(String[] args) {
		System.out.println("main方法执行了。");

	}

}
