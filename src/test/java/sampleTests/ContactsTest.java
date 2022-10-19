package sampleTests;

import org.testng.annotations.Test;

public class ContactsTest {
	
	@Test
	public void createConTest()
	{
		System.out.println("contact created");
	}
	@Test
	public void modifyContactTest()
	{
		System.out.println("contact modifyed");
	}
	@Test
	public void deletTest()
	{
		System.out.println("contact deleted");
	}

}
