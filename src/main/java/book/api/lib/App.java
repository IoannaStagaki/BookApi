package book.api.lib;

import java.io.IOException;

import api.ApiCalls;
import models.Item;

public class App {
	public static void main(String[] args) throws IOException, InterruptedException {
		ApiCalls api = new ApiCalls();
		try {
			Item vols = api.GetVolumeInfo("");
			System.out.println(vols);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
