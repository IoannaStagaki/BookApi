package api;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.text.MessageFormat;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.Bookshelve;
import models.ErrorResponse;
import models.Item;
import models.UserBookshelves;
import models.Volumes;

public class ApiCalls {

	private String apiKey = "AIzaSyA02mardc5vqd2FPf3a8WuyC5xdhiheeu4";

	public ApiCalls() {

	}

	public Volumes GetVolumes(String searchTerm, String searchParameter, String specificSearch)
			throws IOException, InterruptedException {
		ObjectMapper objectMapper = new ObjectMapper();
		HttpClient client = HttpClient.newHttpClient();

		String newTerm = URLEncoder.encode(searchTerm, StandardCharsets.UTF_8.toString());
		String basicUrl = "https://www.googleapis.com/books/v1/volumes?q=";
		String uri = MessageFormat.format("{0}{1}", basicUrl, newTerm);
		boolean searchParameterIsEmpty = searchParameter.equals("");
		boolean searchParameterIsNull = searchParameter.equals(null);
		if (!searchParameterIsEmpty && !searchParameterIsNull) {
			uri = MessageFormat.format("{0}+{1}:{2}&key={3}", uri, searchParameter, specificSearch, this.apiKey);
		}

		HttpRequest request = HttpRequest.newBuilder(URI.create(uri)).build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			ErrorResponse errorResponse = ErrorHandlers.HandleApiError(response);
			throw new IOException(errorResponse.getError().getMessage());
		}
		Volumes volumes = objectMapper.readValue(response.body(), Volumes.class);
		return volumes;
	}

	public Item GetVolumeInfo(String volumeId) throws IOException, InterruptedException {
		ObjectMapper objectMapper = new ObjectMapper();
		HttpClient client = HttpClient.newHttpClient();

		String bacicUrl = "https://www.googleapis.com/books/v1/volumes/" + volumeId;
		String uri = MessageFormat.format("{0}?key={1}", bacicUrl, this.apiKey);

		HttpRequest request = HttpRequest.newBuilder(URI.create(uri)).build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			ErrorResponse errorResponse = ErrorHandlers.HandleApiError(response);
			throw new IOException(errorResponse.getError().getMessage());
		}
		Item item = objectMapper.readValue(response.body(), Item.class);
		return item;
	}

	public UserBookshelves GetUserBookshelves(String userId) throws IOException, InterruptedException {
		ObjectMapper objectMapper = new ObjectMapper();
		HttpClient client = HttpClient.newHttpClient();

		String uri = MessageFormat.format("https://www.googleapis.com/books/v1/users/{0}/bookshelves", userId);
		HttpRequest request = HttpRequest.newBuilder(URI.create(uri)).build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			ErrorResponse errorResponse = ErrorHandlers.HandleApiError(response);
			throw new IOException(errorResponse.getError().getMessage());
		}

		UserBookshelves ubs = objectMapper.readValue(response.body(), UserBookshelves.class);
		return ubs;
	}

	public Bookshelve GetUserBookshelveInfo(String userId, String bookshelveId)
			throws IOException, InterruptedException {
		ObjectMapper objectMapper = new ObjectMapper();
		HttpClient client = HttpClient.newHttpClient();

		String uri = MessageFormat.format("https://www.googleapis.com/books/v1/users/{0}/bookshelves/{1}", userId,
				bookshelveId);
		HttpRequest request = HttpRequest.newBuilder(URI.create(uri)).build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			ErrorResponse errorResponse = ErrorHandlers.HandleApiError(response);
			throw new IOException(errorResponse.getError().getMessage());
		}
		Bookshelve bks = objectMapper.readValue(response.body(), Bookshelve.class);
		return bks;
	}

	public Volumes GetUserBookshelveVolumes(String userId, String bookshelveId)
			throws IOException, InterruptedException {
		ObjectMapper objectMapper = new ObjectMapper();
		HttpClient client = HttpClient.newHttpClient();

		String uri = MessageFormat.format("https://www.googleapis.com/books/v1/users/{0}/bookshelves/{1}/volumes",
				userId, bookshelveId);
		System.out.println(uri);
		HttpRequest request = HttpRequest.newBuilder(URI.create(uri)).build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			ErrorResponse errorResponse = ErrorHandlers.HandleApiError(response);
			throw new IOException(errorResponse.getError().getMessage());
		}
		Volumes vlms = objectMapper.readValue(response.body(), Volumes.class);
		return vlms;
	}
}

