
public class Archer implements Job
{
	
	public int attack(int DEX, int INT, int STR, int val) 
	{
		return (int) (DEX * 1.5 * val);
	}

	public String getJobName() {
		return "ARCHER";
	}
	
}
