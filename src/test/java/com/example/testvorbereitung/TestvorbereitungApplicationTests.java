package com.example.testvorbereitung;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestvorbereitungApplicationTests {
	Implementation ut=new Implementation();

	@Test
	public void inchesToCentimeter() {
		var result=ut.inchesToCentimeter(1);
		var expected=2.54;
		assertEquals(expected,result);
	}

}
