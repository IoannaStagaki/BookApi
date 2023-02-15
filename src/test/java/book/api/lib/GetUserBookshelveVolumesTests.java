package book.api.lib;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import api.ApiCalls;
import models.Volumes;

public class GetUserBookshelveVolumesTests {

	@Test
	public void getBookshelvesVolumsReturnsOK() throws IOException, InterruptedException {
		String userId = "102701940585560677579";
		String bookshelvesId = "1001";
		ApiCalls api = new ApiCalls();

		Volumes volume = api.GetUserBookshelveVolumes(userId, bookshelvesId);
		boolean itemHasValue = volume.getKind().equals("books#volumes");

		int totalItems = volume.getTotalItems();
		boolean totalItemsHasCorrectCount = totalItems == volume.getItems().size();
		assertTrue(itemHasValue);
		assertTrue(totalItemsHasCorrectCount);

	}

	@Test
	public void getBookshelvesVolumsReturnsExceptionInCaseOfUserIdEmpty() {

		String userId = "";
		String bookshelvesId = "1001";
		String errorMsg = "Invalid user ID.";

		ApiCalls api = new ApiCalls();

		Exception ex = assertThrows(Exception.class, () -> {
			api.GetUserBookshelveVolumes(userId, bookshelvesId);
		});
		String message = ex.getMessage();

		boolean areEqual = message.equals(errorMsg);
		assertTrue(areEqual);

	}

	@Test
	public void getBookshelvesVolumsReturnsExceptionInCaseOfBookshelveIdEmpty() {

		String userId = "102701940585560677579";
		String bookshelvesId = "";
		String errorMsg = "Invalid bookshelf ID.";

		ApiCalls api = new ApiCalls();

		Exception ex = assertThrows(Exception.class, () -> {
			api.GetUserBookshelveVolumes(userId, bookshelvesId);
		});
		String message = ex.getMessage();

		boolean areEqual = message.equals(errorMsg);
		assertTrue(areEqual);

	}

	@Test
	public void getBookshelvesVolumsReturnsExceptionInCaseOfBothParamsEmpty() {

		String userId = "";
		String bookshelvesId = "";
		String errorMsg = "Invalid bookshelf ID.";

		ApiCalls api = new ApiCalls();

		Exception ex = assertThrows(Exception.class, () -> {
			api.GetUserBookshelveVolumes(userId, bookshelvesId);
		});
		String message = ex.getMessage();

		boolean areEqual = message.equals(errorMsg);
		assertTrue(areEqual);

	}

}

