package gElevate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
	private double elevation;
	private Location location;
	private double resolution;

	public double getElevation() {
		return elevation;
	}

	public Location getLocation() {
		return location;
	}

	public double getResolution() {
		return resolution;
	}

	public void setElevation(double elevation) {
		this.elevation = elevation;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public void setResolution(double resolution) {
		this.resolution = resolution;
	}
}
