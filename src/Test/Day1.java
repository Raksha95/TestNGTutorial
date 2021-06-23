package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

	@BeforeTest
	public void first() {

		System.out.println("I will execute first !!");
	}

	@Test
	public void demo() {

		System.out.println("Hello!!");
	}

	@Test

	public void addition() {

		System.out.println(2 + 3 + 100);
	}
}
