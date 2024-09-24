public class HeroFactory
{

   public static HeroInterface createHero(String raceName, String jobName)   
   {
	  
      if (raceName == "ELF")
      {
    	  if(jobName == "ARCHER")
    	  {
    		  Job Archer = new Archer();
    		  Race Elf = new Elf(Archer);
    		  return Elf;
    	  }
    	  if(jobName == "WARRIOR")
    	  {
    		  Job Warrior = new Warrior();
    		  Race Elf = new Elf(Warrior);
    		  return Elf;
    	  }
    	  if(jobName == "MAGE")
    	  {
    		  Job Mage = new Mage();
    		  Race Elf = new Elf(Mage);
    		  return Elf;
    	  }
      }
      
      if (raceName == "DWARF")
      {
    	  if(jobName == "ARCHER")
    	  {
    		  Job Archer = new Archer();
    		  Race Dwarf = new Dwarf(Archer);
    		  return Dwarf;
    	  }
    	  if(jobName == "WARRIOR")
    	  {
    		  Job Warrior = new Warrior();
    		  Race Dwarf = new Dwarf(Warrior);
    		  return Dwarf;
    	  }
    	  if(jobName == "MAGE")
    	  {
    		  Job Mage = new Mage();
    		  Race Dwarf = new Dwarf(Mage);
    		  return Dwarf;
    	  }
      }
      
      if (raceName == "ROBOT")
      {
    	  if(jobName == "ARCHER")
    	  {
    		  Job Archer = new Archer();
    		  Race Robot = new Robot(Archer);
    		  return Robot;
    	  }
    	  if(jobName == "WARRIOR")
    	  {
    		  Job Warrior = new Warrior();
    		  Race Robot = new Robot(Warrior);
    		  return Robot;
    	  }
    	  if(jobName == "MAGE")
    	  {
    		  Job Mage = new Mage();
    		  Race Robot = new Robot(Mage);
    		  return Robot;
    	  }
      }
	
	return null;
   }

}