
public class Warrior implements Job
{

	public int attack(int DEX, int INT, int STR, int val) 
	{
		return (int) (STR * val + DEX);
	}

	public String getJobName() {
		return "WARRIOR";
	}
}
