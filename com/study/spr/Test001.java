/**
 * 
 */
package com.study.spr;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author L
 *
 * @version 2017��3��29��
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDconfig.class)
public class Test001 {

	@Autowired
	CompactDisc cd;
	@Test
	public void cdnoEmpty(){
		assertNotNull(cd);
		
	}
	
}
