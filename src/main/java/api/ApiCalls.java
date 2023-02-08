package api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.text.MessageFormat;

import com.fasterxml.jackson.databind.ObjectMapper;

import models.Bookshelve;
import models.Item;
import models.UserBookshelves;
import models.Volumes;

public class ApiCalls {

	private String apiKey = "AIzaSyA02mardc5vqd2FPf3a8WuyC5xdhiheeu4";
	private ObjectMapper objectMapper;
	private HttpClient client;

	public ApiCalls() {
		this.objectMapper = new ObjectMapper();
		this.client = HttpClient.newHttpClient();
	}

	public Volumes GetVolumes(String searchTerm, String searchParameter, String specificSearch)
			throws IOException, InterruptedException {

		System.out.println("Search whith specific criteria");
		String newTerm = searchTerm.replace("\s", "+").trim();
		String basicUrl = "https://www.googleapis.com/books/v1/volumes?q=";
		String uri = MessageFormat.format("{0}{1}", basicUrl, newTerm);
		if (searchParameter != null || searchParameter != "") {
			uri = MessageFormat.format("{0}+{1}:{2}&key={3}", uri, searchParameter, specificSearch, this.apiKey);
		}

		var request = HttpRequest.newBuilder(URI.create(uri)).build();
		var response = client.send(request, BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			throw new IOException("Something went wrong!");
		}
		Volumes volumes = objectMapper.readValue(response.body(), Volumes.class);
		return volumes;
	}

	public Item GetVolumeInfo(String volumeId) throws IOException, InterruptedException {

		System.out.println("Search for more information about each volume");
		String bacicUrl = "https://www.googleapis.com/books/v1/volumes/";
		String uri = MessageFormat.format("{0}?key={1}", bacicUrl, this.apiKey);

		var request = HttpRequest.newBuilder(URI.create(uri)).build();
		var response = client.send(request, BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			throw new IOException("Something went wrong!");
		}
		Item item = objectMapper.readValue(response.body(), Item.class);
		return item;
	}
	// https://www.googleapis.com/books/v1/users/102701940585560677579/bookshelves&key=AIzaSyA02mardc5vqd2FPf3a8WuyC5xdhiheeu4

	public UserBookshelves GetUserBookshelves(String userId) throws IOException, InterruptedException {

		System.out.println("Search list of public shelves other user");
		String uri = MessageFormat.format("https://www.googleapis.com/books/v1/users/{0}/bookshelves", userId);
		var request = HttpRequest.newBuilder(URI.create(uri)).build();
		var response = client.send(request, BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			throw new IOException("Something went wrong!");
		}

		UserBookshelves ubs = objectMapper.readValue(response.body(), UserBookshelves.class);
		return ubs;
	}

	public Bookshelve GetUserBookshelveInfo(String userId, int bookshelveId) throws IOException, InterruptedException {

		System.out.println("Search more information about each public shelf");
		String uri = MessageFormat.format("https://www.googleapis.com/books/v1/users/{0}/bookshelves/{1}", userId,
				bookshelveId);
		var request = HttpRequest.newBuilder(URI.create(uri)).build();
		var response = client.send(request, BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			throw new IOException("Something went wrong!");
		}
		Bookshelve bks = objectMapper.readValue(response.body(), Bookshelve.class);
		return bks;
	}

	public Volumes GetUserBookshelveVolumes(String userId, String bookshelveId)
			throws IOException, InterruptedException {

		System.out.println("Search the contents of another user's public shelf");
		String uri = MessageFormat.format("https://www.googleapis.com/books/v1/users/{0}/bookshelves/{1}/volumes",
				userId, bookshelveId);
		System.out.println(uri);
		var request = HttpRequest.newBuilder(URI.create(uri)).build();
		var response = client.send(request, BodyHandlers.ofString());
		if (response.statusCode() != 200) {
			System.out.println(response.body());
			throw new IOException("Something went wrong!");
		}
		Volumes vlms = objectMapper.readValue(response.body(), Volumes.class);
		return vlms;
	}
}

