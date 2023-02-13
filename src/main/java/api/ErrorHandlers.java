package api;

import java.net.http.HttpResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import models.ApiError;
import models.ErrorResponse;

public class ErrorHandlers {
	public static ErrorResponse HandleApiError(HttpResponse<String> response)
			throws JsonMappingException, JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		ErrorResponse errorResponse = new ErrorResponse();
		if (response.statusCode() == 404) {
			errorResponse.setError(new ApiError("404", "Κωδικός σφάλματος 404. Κάτι πήγε στραβά!"));
		} else {
			errorResponse = objectMapper.readValue(response.body(), ErrorResponse.class);

		}
		return errorResponse;
	}
}
