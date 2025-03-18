package br.com.meli.test_project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.meli.test_project.exceptions.OutOfRangeException;
import br.com.meli.test_project.service.IRomanConverter;

@SpringBootTest
public class ServiceTests {
	@Autowired
	private IRomanConverter converter;
	
	
	@ParameterizedTest
	@CsvSource({"1,I", "2,II", "3,III", "4,IV", "5,V", "6,VI"})
	public void shouldConvertSingleNumber(String arabicNumber, String romanNumber) {
		assertEquals(
				converter.convertToRoman(Integer.parseInt(arabicNumber)), romanNumber);
	}
	
	@Test
	public void shouldConvertTwoDigitNumber()	{
		assertEquals(converter.convertToRoman(10), "X");
	}
	
	@Test
	public void shouldThrowExceptionIfLessOrEqualZero() {
		assertThrows(OutOfRangeException.class, () -> {
			converter.convertToRoman(0);
		});
	}
	
	@Test
	public void shouldThrowExceptionIfGreaterOrEqualHundred() {
		assertThrows(OutOfRangeException.class, () ->{
			converter.convertToRoman(100);
		});
	}
}
