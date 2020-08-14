package com.clc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProcessorController {
	@RequestMapping("/process")
	public ModelAndView getFoods(HttpServletRequest req, HttpServletResponse res) {
		String fullname = req.getParameter("fullname");
		String email = req.getParameter("email");
		String address = req.getParameter("address");

		ModelAndView mv = new ModelAndView();
		mv.setViewName("foods.jsp");
		return mv;

	}

	@RequestMapping(value = "/proceed", method = RequestMethod.POST)
	public ModelAndView modelView(HttpServletRequest req, HttpServletResponse res) {
		String[] foods = req.getParameterValues("foodstuff");
		ModelAndView mv = new ModelAndView();
		int totalPrice = 0;
		String foodstuff = "";
		for(int i=0; i<foods.length; i ++) {
			String[] key = foods[i].split(":");
			String foodType = key[0];
			int price = Integer.parseInt(key[1]);
			totalPrice = totalPrice + price;
			foodstuff = foodstuff + ", " + foodType;
			System.out.println(foodType + " " + price);
			
		}
		String output = "Total for " + foodstuff + " is: Kes " + totalPrice;
		System.out.println(output);
		mv.addObject("out", output);
		mv.setViewName("checkout.jsp");
		return mv;
		
	}
	@RequestMapping(value="/pdf")
	public void printPdf() {
		PrintPdf p = new PrintPdf();
		p.printPdfDoc();
	}

	/*
	 * @RequestMapping(value = "/proceed", method = RequestMethod.POST) public
	 * ModelAndView functionList(@RequestParam("foodstuff") String[] foodstuff)
	 * throws Exception { ModelAndView mv = new ModelAndView(); for(int i=0;
	 * i<foodstuff.length; i++) { System.out.println(foodstuff[i]); }
	 * 
	 * mv.addObject("food", foodstuff); mv.setViewName("checkout.jsp");
	 * 
	 * return mv; }
	 */

}
