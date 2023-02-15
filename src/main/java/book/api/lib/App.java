package book.api.lib;

import java.io.IOException;

import api.ApiCalls;
import models.UserBookshelves;

public class App {
	public static void main(String[] args) throws IOException, InterruptedException {
		ApiCalls api = new ApiCalls();
		try {
			UserBookshelves vols = api.GetUserBookshelves("");
			System.out.println(vols);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
