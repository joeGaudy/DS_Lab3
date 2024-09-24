
public class Mage implements Job
{

	public int attack(int DEX, int INT, int STR, int val) 
	{
		return (int) (DEX + INT * val);
	}

	public String getJobName() {
		return "MAGE";
	}

}
