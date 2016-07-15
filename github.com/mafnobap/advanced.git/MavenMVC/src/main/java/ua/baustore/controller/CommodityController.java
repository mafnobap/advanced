package ua.baustore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.baustore.servicImpl.CommodityServiceImpl;
import ua.baustore.service.entity.Commodity;

@Controller
public class CommodityController {
	
	@Autowired
	private CommodityServiceImpl commodityServiceImpl;
	
	
	//fggfhfghgfhghjghjhj
	
	@RequestMapping("/")
	
	public String home(){
		
		return "home";
	}
	
	@RequestMapping(value="/show", method=RequestMethod.GET)
	
	public String show(Model model){
		List<Commodity> commodity = new ArrayList<Commodity>();
		
		commodity.add(new Commodity("PIVO",10));
		commodity.add(new Commodity("MASLO",20));
		
		model.addAttribute("Commodity", commodity);
		return "show";
		
	}
	
	@RequestMapping(value="/addCommodity", method=RequestMethod.POST)
	public String saveCommodity(@RequestParam String nameCommodity){
		
		commodityServiceImpl.save(new Commodity(nameCommodity,10));
		
		return "redirect:/show";
		
	}
	
	
	

}
