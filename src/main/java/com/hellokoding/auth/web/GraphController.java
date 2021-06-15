package com.hellokoding.auth.web;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GraphController {

	@GetMapping("/barChart")
	public String barChart(Model model) {
		HashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("babu", 20);
		map.put("ashok", 40);
		map.put("anitha", 10);
		map.put("lavanya", 80);
		map.put("jill", 30);
		model.addAttribute("keySet", map.keySet());
		model.addAttribute("values", map.values());
		return "barChart";

	}

}
