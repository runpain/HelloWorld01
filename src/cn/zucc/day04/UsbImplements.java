package cn.zucc.day04;

public class UsbImplements  implements Usb  ,OK{
	public void service() {
			System.out.println("����USB�ӿڣ���ʼ�������ݡ�");
	}
	public void service1() {
		System.out.println("����USB�ӿڡ�");
}
	@Override
	public void service3() {
		// TODO Auto-generated method stub
		System.out.println("����OK�ӿڡ�");
	}
}
