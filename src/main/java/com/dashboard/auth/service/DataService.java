package com.dashboard.auth.service;

import java.io.IOException;
import java.util.List;

import com.dashboard.auth.model.Location;

public interface DataService {
	
	public List<Location> getLocations() throws IOException, InterruptedException;

}
