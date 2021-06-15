package com.dashboard.auth.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dashboard.auth.model.Location;
import com.dashboard.auth.service.DataService;

@Controller
public class GraphController {
	
	@Autowired
	DataService dataService;

	@GetMapping("/barChart")
	public String barChart(Model model) throws IOException, InterruptedException {
		HashMap<String, Integer> map = new LinkedHashMap<>();
//		map.put("babu", 20);
//		map.put("ashok", 40);
//		map.put("anitha", 10);
//		map.put("lavanya", 80);
//		map.put("jill", 30);
		model.addAttribute("keySet", map.keySet());
		model.addAttribute("values", map.values());

		List<Location> locations = dataService.getLocations();
		for (Location location : locations) {
			map.put(location.getState(), location.getDeaths());

		}
		model.addAttribute("keySet", map.keySet());
		model.addAttribute("values", map.values());
		return "barChart";

	}

}
