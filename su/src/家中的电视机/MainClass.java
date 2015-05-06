package 家中的电视机;

public class MainClass 
{
	public static void main(String[] agrs)
	{
		TV haierTV = new TV();
		haierTV.setChannel(5);
		System.out.println("haierTV的频道是" + haierTV.GetChannel());
		Family zhangsanFamily = new Family();
		zhangsanFamily.buyTV(haierTV);
		System.out.println("zhangsanFamily开始看电视节目");
		zhangsanFamily.seeTV();
		int m = 2;
		System.out.println("zhangsanFamily将电视更换到" + m +"频道");
		zhangsanFamily.remoteControl(m);
		System.out.println("haierTV的频道是" + haierTV.GetChannel());
		System.out.println("zhangsanFamily再看电视节目");
		zhangsanFamily.seeTV();
	}

}
