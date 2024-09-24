import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HeroFactoryTest {

	@Test
	void testElf() {
		HeroInterface Elf = HeroFactory.createHero("ELF", "ARCHER");
		assertEquals(25, Elf.getDEX());
		assertEquals(20, Elf.getINT());
		assertEquals(20, Elf.getSTR());
		
		assertEquals("ELF", Elf.getRaceName());
		assertEquals("ARCHER", Elf.getJobName());
		
		assertEquals(75, Elf.attack(2));
		
		assertNull(HeroFactory.createHero("Elf", "Archer"));
		assertNull(HeroFactory.createHero("ELF", "Archer"));
		assertNull(HeroFactory.createHero("Elf", "ARCHER"));
		
		HeroInterface Elf2 = HeroFactory.createHero("ELF", "WARRIOR");
		HeroInterface Elf3 = HeroFactory.createHero("ELF", "MAGE");
		
		assertEquals("WARRIOR", Elf2.getJobName());
		assertEquals("MAGE", Elf3.getJobName());
	}
	
	@Test
	void testDwarf() {
		HeroInterface Dwarf = HeroFactory.createHero("DWARF", "WARRIOR");
		assertEquals(20, Dwarf.getDEX());
		assertEquals(20, Dwarf.getINT());
		assertEquals(25, Dwarf.getSTR());
		
		assertEquals("DWARF", Dwarf.getRaceName());
		assertEquals("WARRIOR", Dwarf.getJobName());
		
		assertEquals(70, Dwarf.attack(2));
		
		assertNull(HeroFactory.createHero("Dwarf", "Warrior"));
		assertNull(HeroFactory.createHero("DWARF", "Warrior"));
		assertNull(HeroFactory.createHero("Dwarf", "WARRIOR"));
		
		HeroInterface Dwarf2 = HeroFactory.createHero("DWARF", "ARCHER");
		HeroInterface Dwarf3 = HeroFactory.createHero("DWARF", "MAGE");
		
		assertEquals("ARCHER", Dwarf2.getJobName());
		assertEquals("MAGE", Dwarf3.getJobName());
	}
	
	@Test
	void testRobot() {
		HeroInterface Robot = HeroFactory.createHero("ROBOT", "MAGE");
		assertEquals(20, Robot.getDEX());
		assertEquals(25, Robot.getINT());
		assertEquals(20, Robot.getSTR());
		
		assertEquals("ROBOT", Robot.getRaceName());
		assertEquals("MAGE", Robot.getJobName());
		
		assertEquals(70, Robot.attack(2));
		
		assertNull(HeroFactory.createHero("Robot", "Mage"));
		assertNull(HeroFactory.createHero("ROBOT", "Mage"));
		assertNull(HeroFactory.createHero("Robot", "MAGE"));
		
		HeroInterface Robot2 = HeroFactory.createHero("ROBOT", "ARCHER");
		HeroInterface Robot3 = HeroFactory.createHero("ROBOT", "WARRIOR");
		
		assertEquals("ARCHER", Robot2.getJobName());
		assertEquals("WARRIOR", Robot3.getJobName());
	}

}
