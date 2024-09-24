
public abstract class Race implements HeroInterface
{
	private Job job;
	
	public Race(Job job) {
		this.job = job;
	}

	@Override
	public int attack(int val) {
		return job.attack(getDEX(), getINT(), getSTR(), val);
	}

	@Override
	public int getSTR() {
		return 20;
	}

	@Override
	public int getDEX() {
		return 20;
	}

	@Override
	public int getINT() {
		return 20;
	}

	@Override
	public abstract String getRaceName();

	@Override
	public String getJobName() {
		return job.getJobName();
	}

}
