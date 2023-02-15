package book.api.lib;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import api.ApiCalls;
import models.Bookshelve;

public class GetBokshelvesInfoTests {

	@Test
	public void getBookshelvesInfoReturnsOK() throws IOException, InterruptedException {

		String userId = "102701940585560677579";
		String bookshelvesId = "1001";
		ApiCalls api = new ApiCalls();

		Bookshelve item = api.GetUserBookshelveInfo(userId, bookshelvesId);
		boolean itemHasValue = item.getId().equals(bookshelvesId);
		assertTrue(itemHasValue);
	}

	@Test
	public void getBookshelvesInfoEmptyTwoParametersReturnsExeption() {
		String userId = "";
		String bookshelvesId = "";
		String errorMsg = "Invalid user ID.";
		ApiCalls api = new ApiCalls();

		Exception ex = assertThrows(Exception.class, () -> {
			api.GetUserBookshelveInfo(userId, bookshelvesId);
		});
		String message = ex.getMessage();

		boolean areEqual = message.equals(errorMsg);
		assertTrue(areEqual);
	}

	@Test
	
	public void getBookshelvesInfoEmptyOneParameterReturnsExeption() {
		String userId = "";
		String bookshelvesId = "1001";
		String errorMsg = "Invalid user ID.";
		ApiCalls api = new ApiCalls();

		Exception ex = assertThrows(Exception.class, () -> {
			api.GetUserBookshelveInfo(userId, bookshelvesId);
		});
		String message = ex.getMessage();

		boolean areEqual = message.equals(errorMsg);
		assertTrue(areEqual);
	}


}
