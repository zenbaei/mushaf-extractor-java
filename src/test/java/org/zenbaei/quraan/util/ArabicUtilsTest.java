package org.zenbaei.quraan.util;

import org.junit.Test;

public class ArabicUtilsTest {


	@Test
	public void testNormalizeEnhanced() {
		 final String test = "وَاللَّهُ أَعْلَمُ بِمَا يُوعُونَ";
	     System.out.println(ArabicUtils.normalizeEnhanced(test));
	}
}