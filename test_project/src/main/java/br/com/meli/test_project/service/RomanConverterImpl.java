package br.com.meli.test_project.service;

import org.springframework.stereotype.Service;

import br.com.meli.test_project.exceptions.OutOfRangeException;

@Service
public class RomanConverterImpl implements IRomanConverter{

	private String unity[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
	private String dezen[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
	
	@Override
	public String convertToRoman(Integer number) {
		// TODO Auto-generated method stub
		if (number <= 0 || number >= 100) {
			throw new OutOfRangeException("Invalid value "+number);
		}
		return dezen[number/10]+unity[number%10];
	}

}
