package cn.zucc.day04;

public class UsbImplements  implements Usb  ,OK{
	public void service() {
			System.out.println("连接USB接口，开始传输数据。");
	}
	public void service1() {
		System.out.println("连接USB接口。");
}
	@Override
	public void service3() {
		// TODO Auto-generated method stub
		System.out.println("连接OK接口。");
	}
}
