package ���еĵ��ӻ�;

public class MainClass 
{
	public static void main(String[] agrs)
	{
		TV haierTV = new TV();
		haierTV.setChannel(5);
		System.out.println("haierTV��Ƶ����" + haierTV.GetChannel());
		Family zhangsanFamily = new Family();
		zhangsanFamily.buyTV(haierTV);
		System.out.println("zhangsanFamily��ʼ�����ӽ�Ŀ");
		zhangsanFamily.seeTV();
		int m = 2;
		System.out.println("zhangsanFamily�����Ӹ�����" + m +"Ƶ��");
		zhangsanFamily.remoteControl(m);
		System.out.println("haierTV��Ƶ����" + haierTV.GetChannel());
		System.out.println("zhangsanFamily�ٿ����ӽ�Ŀ");
		zhangsanFamily.seeTV();
	}

}
