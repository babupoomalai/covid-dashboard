package com.dashboard.auth.model;

import java.util.Date;

public class Location {

	private String state;
	private long confirmed;
	private long recovered;
	private int deaths;
	private long active;
	private Date lastUpdated;

	public long getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(long confirmed) {
		this.confirmed = confirmed;
	}

	public long getRecovered() {
		return recovered;
	}

	public void setRecovered(long recovered) {
		this.recovered = recovered;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public long getActive() {
		return active;
	}

	public void setActive(long active) {
		this.active = active;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Location [state=" + state + ", confirmed=" + confirmed + ", recovered=" + recovered + ", deaths="
				+ deaths + ", active=" + active + ", lastUpdated=" + lastUpdated + "]";
	}

}
