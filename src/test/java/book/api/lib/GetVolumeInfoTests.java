package book.api.lib;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import api.ApiCalls;
import models.Item;

public class GetVolumeInfoTests {

	private ApiCalls api;

	public GetVolumeInfoTests() {
		api = new ApiCalls();
	}
	@Test
	public void getVolumeInfoReturnsOK () throws IOException, InterruptedException {

		String volumeId = "lqHNugAACAAJ";

		Item item = api.GetVolumeInfo(volumeId);

		boolean itemIsNull = item.equals(null);
		boolean itemHasInfo = item.getId().length() > 0;
		assertFalse(itemIsNull);
		assertTrue(itemHasInfo);
	}

	@Test
	public void getVolumeInfoShouldReturnErrorInCaseEmtyString() throws IOException, InterruptedException {
		String volumeId = "";
		String errorResponse = "Required parameter: q";

		Exception ex = assertThrows(Exception.class, () -> {
			api.GetVolumeInfo(volumeId);
		});
		
		String exceptionMessage = ex.getMessage();
		boolean areEqual = exceptionMessage.equals(errorResponse);
		assertTrue(areEqual);
	}

}
