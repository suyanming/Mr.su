package 家中的电视机;

public class Family 
{
	TV homeTV;
	void buyTV(TV tv)
	{
		homeTV = tv;
	}
	void remoteControl(int m)
	{
		homeTV.setChannel(m);
	}
	void seeTV()
	{
		homeTV.showProgram();
	}
}
