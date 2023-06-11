package com.example.testvorbereitung;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TestvorbereitungApplicationTests {

	Implementation sut = new Implementation();
	@Test
	public void testYardToMeter() {
		var result = sut.YardToMeter(1);
		var expected = 0.914;
		var delta = 0.001;
		assertEquals(expected, result, delta);
	}
  @Test
	public void inchesToCentimeter() {
		var result=sut.inchesToCentimeter(1);
		var expected=2.54;
		assertEquals(expected,result);
	}

}
