package book.api.lib;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import api.ApiCalls;
import models.UserBookshelves;

public class GetBookshelvesTests {

	@Test
	public void getBookshelvesReturnsOK() throws IOException, InterruptedException {

		String userId = "102701940585560677579";
		ApiCalls api = new ApiCalls();

		UserBookshelves item = api.GetUserBookshelves(userId);
		boolean bookshelvesHasItems = item != null && item.getItems().size() > 0;
		assertTrue(bookshelvesHasItems);
	}

	@Test
	public void getBookshelvesReturnsNotFound() {

		String userId = "";
		String errorMsg = "Invalid user ID.";
		ApiCalls api = new ApiCalls();

		Exception ex = assertThrows(Exception.class, () -> {
			api.GetUserBookshelves(userId);
		});
		String message = ex.getMessage();

		boolean areEqual = message.equals(errorMsg);
		assertTrue(areEqual);

	}

}
