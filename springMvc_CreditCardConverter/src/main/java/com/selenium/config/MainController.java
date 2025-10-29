package com.selenium.config;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selenium.dto.BillDto;
import com.selenium.dto.CreditCard;
import com.selenium.editor.UpperCaseEditor;

import jakarta.validation.Valid;

@Controller
public class MainController {

	@RequestMapping("/bill")
	public String login(@ModelAttribute("billDto") BillDto billDto) {

		
		CreditCard object = new CreditCard();
		object.setFirstFourDigit(1111);
		object.setSecondFourDigit(1111);
		object.setThirdFourDigit(1111);
		object.setLastFourDigit(1111);
		
		billDto.setCreditCard(object);
		
		return "bill";
	}

	@PostMapping("/process-bill")
	public String processLogin(@Valid @ModelAttribute("billDto") BillDto billDto , BindingResult bindingResult) {

		System.out.println(billDto.getCurrency());
		
		
			return "billInfo";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		// normally , spring convert String to Date in the form of month/day/year
		// here we allow the user to enter different format dd-MM-yyyy
		
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true);
		binder.registerCustomEditor(Date.class, "date", dateEditor);
		
		//normally spring convert String to BigDecimal in the form of 66666.888 --> accept ONLY dot
		// allow user to use comma too
		CustomNumberEditor numberEditor = new CustomNumberEditor(BigDecimal.class, new DecimalFormat("##,###.##"), true);
		binder.registerCustomEditor(BigDecimal.class, "amount", numberEditor);
		
		
		// convert the currency input to upper case to be acceptable
		UpperCaseEditor upperCaseEditor = new UpperCaseEditor();
		binder.registerCustomEditor(Currency.class, "currency", upperCaseEditor);
	}

	

	
}
