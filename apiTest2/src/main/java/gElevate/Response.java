package gElevate;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
	private List<Results> results;
	private String status;

	public List<Results> getResults() {
		return results;
	}

	public String getStatus() {
		return status;
	}

	public void setResults(List<Results> results) {
		this.results = results;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Response{" +
				"elevation='" + results.get(0).getElevation() + '\'' +
				", status=" + status +
				'}';
	}
}
