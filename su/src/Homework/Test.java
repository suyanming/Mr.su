package Homework;

public class Test 
{
	public static void main(String[] args)
	{
		CPU cpu = new CPU();
		HardDisk HD = new HardDisk();
		cpu.setSpeed(2000);
		HD.setAmount(200);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();
	}

}
class CPU
{
	int speed;
	int getSpeed()
	{
		return speed;
	}
	void setSpeed(int speed)
	{
		this.speed = speed;
	}
}
class HardDisk
{
	int amount;
	int getAmount()
	{
		return amount;
	}
	void setAmount(int amount)
	{
		this.amount = amount;
	}
}
class PC
{
	CPU cpu;
	HardDisk HD;
	void setCPU(CPU cpu)
	{
		this.cpu = cpu;
	}
	void setHardDisk(HardDisk HD)
	{
		this.HD = HD;
	}
	void show()
	{
		System.out.println("CPUÀŸ∂»"+cpu.getSpeed());
		System.out.println("”≤≈Ã»›¡ø"+HD.getAmount());
	}
}
