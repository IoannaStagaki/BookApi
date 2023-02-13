package models;

public class ErrorResponse {
	private ApiError error;

	public ApiError getError() {
		return error;
	}

	public void setError(ApiError error) {
		this.error = error;
	}
}
