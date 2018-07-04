package com.sf.util;

import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {
	
	/**
	 * @Test：将一个普通的方法修饰为测试方法
	 * 		@Test(expected=XXXX.class) 	预期抛出XXXX异常
	 * 		@Test(timeout=2000)			超时时间（毫秒）	
	 * @BeforeClass：在所有方法执行前被执行，必须被static修饰，只会执行一次
	 * @AfterClass：在所有方法执行后执行，必须被static修饰，只会执行一次
	 * @Before：在每个@Test方法执行前都会执行一次
	 * @After：在每个@Test方法执行后都会执行一次
	 * @Ignore：所修饰的测试方法会被测试执行器忽略
	 * @RunWith：可以更改测试运行器 org.junit.runner.Runner
	 */
	
	
	@Test(expected=ArithmeticException.class)
	public void testDivide() {
		assertEquals(3, Calculate.divide(3, 0));
	}
	
	@Ignore("..原因")
	@Test(timeout=2000)	//毫秒
	public void testWhile() {
		while (true) {
			System.out.println("run forever...");
		}
	}
	
}
