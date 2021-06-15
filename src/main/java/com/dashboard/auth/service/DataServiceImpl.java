package com.dashboard.auth.service;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import com.dashboard.auth.model.Location;

@Service
public class DataServiceImpl implements DataService {

	private static final String COVID_API_URL = "https://api.covid19india.org/";
	private static final String COVID_GET_STATES = COVID_API_URL + "csv/latest/state_wise.csv";

	@Override
	public List<Location> getLocations() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(COVID_GET_STATES)).build();
		HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
		StringReader csvBodyReader = new StringReader(httpResponse.body());
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);

		List<Location> locationStats = new ArrayList<>();
		for (CSVRecord record : records) {
			Location locationStat = new Location();
			locationStat.setState(record.get("State"));
			locationStat.setActive(Long.parseLong(record.get("Active")));
			locationStat.setDeaths(Integer.parseInt(record.get("Deaths")));
			locationStats.add(locationStat);
		}
		return locationStats;
	}

}
