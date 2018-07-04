package com.sf.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 描述：使用测试套件，一次测试多个类，建一个空类
 * 		添加注解@RunWith(Suite.class)，使用Suite测试套件运行
 * 		添加注解@Suite.SuiteClasses(value={XXX.class,XXX.class,XXX.class})，引入要测试的类组成的数组
 * @author 80002888
 */
@RunWith(Suite.class)
@Suite.SuiteClasses(value={TaskTest1.class,TaskTest2.class,TaskTest3.class})	
public class SuiteTest {
	
}
