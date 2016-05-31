package org.zenbaei.quraan.utils;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class NumberUtilsTest {
	
	@Test
	public void testConvertArabicToEnglishNumber() throws UnsupportedEncodingException{
		String first = "١";
		String second = "١٢";
		String third = "٦١٥";
		int one = NumberUtils.convertFromArabicToEnglish(first);
		int twelve = NumberUtils.convertFromArabicToEnglish(second);
		int sixHundredFifteen = NumberUtils.convertFromArabicToEnglish(third);
		
		assertEquals(1, one);
		assertEquals(12, twelve);
		assertEquals(615, sixHundredFifteen);
	}

}

