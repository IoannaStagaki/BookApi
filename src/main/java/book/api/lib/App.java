package book.api.lib;

import java.io.IOException;

import api.ApiCalls;
import models.Volumes;

public class App {
	public static void main(String[] args) throws IOException, InterruptedException {
		var api = new ApiCalls();
		var testUserId = "102701940585560677579";

		
		try {
//			var item = api.GetVolumeInfo("zyTCAlFPjgYC");
//			System.out.print(item.getId());

//			Volumes volumes = api.GetVolumes("rings", "inauthor", "tolkien");
//			System.out.println(volumes.getKind() + " " + volumes.getTotalItems());
//			System.out.println(volumes.getItems().get(0).getVolumeInfo().getTitle());

//			UserBookshelves ubs = api.GetUserBookshelves(testUserId);
//			System.out.println(ubs.getKind());
//			System.out.println(ubs.getItems().size());
//
//			Bookshelve bks = api.GetUserBookshelveInfo(testUserId, 0);
//			System.out.println(bks.getTitle());

			Volumes vlms = api.GetUserBookshelveVolumes(testUserId, "1001");
			System.out.println(vlms.getKind());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void Menu() {
		System.out.println("Παρακαλώ επικλέξτε:");
		System.out.println("1.Αναζήτηση Τόμων");
		System.out.println("2.Διαχείριση Ραφιών");
		int usechoise = 0;
		if (true) {
			System.out.println("=== Αναζήτηση Τόμων===");
			for (int i = 0; i < usechoise.size(); i++) {
			}
		
		}
	}

}
