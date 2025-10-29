package com.selenium.service;

import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService{
	
	private final String APP_FORMULA = "FLAME";
	
	

	@Override
	public String calculateLove(String username, String crushname) {
		
		int wordsCount = (username+crushname).length();
		//int wordsCount = (username+crushname).toCharArray().length;

				
		int formulaCount = APP_FORMULA.length();
		//int formulaCount = APP_FORMULA.toCharArray().length;
		
		int remainder = wordsCount % formulaCount ;
		
		char c = APP_FORMULA.charAt(remainder);
		
	   String result = whatsBetweenthem(c);	
	   
	   
	   
	   return result ;
	}

	@Override
	public String whatsBetweenthem(char c) {
		
		String result = null ;
		
		if(c == 'F' ) {
			result = LoveCalcConstants.F_MEANING;
		}else if(c == 'L') {
			
			result = LoveCalcConstants.L_MEANING;
		}else if(c == 'A') {
			
			result = LoveCalcConstants.A_MEANING;
		}else if(c == 'M') {
			
			result = LoveCalcConstants.M_MEANING;
		}else if(c == 'E') {
			
			result = LoveCalcConstants.E_MEANING;
		}
		return result;
	 }

	
}
