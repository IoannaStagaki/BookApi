package book.api.lib;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import api.ApiCalls;
import models.Volumes;

public class GetVolumesTests {
	
	@Test
	public void getVolumesShouldReturnOK() throws IOException, InterruptedException {
		String term = "lord of the rings";
		ApiCalls api = new ApiCalls();

		Volumes volumes = api.GetVolumes(term, "", "", null, null, null, null, null);
		boolean volumesHasItems = volumes != null && volumes.getItems().size() > 0;
		assertTrue(volumesHasItems);
	}
	
	
	@Test
	public void getVolumesShouldReturnOKWhenSpecificSearchIsProvided() throws IOException, InterruptedException {
		String term = "lord of the rings";
		String specificTerm = "Tolkien";
		String parameter = "inauthor";
		ApiCalls api = new ApiCalls();

		Volumes volumes = api.GetVolumes(term, specificTerm, parameter, null, null, null, null, null);
		boolean volumesHasItems = volumes != null && volumes.getItems().size() > 0;
		assertTrue(volumesHasItems);
	}

	@Test
	public void getVolumesShouldReturThrowExceptionInCaseOfNullParameter() throws IOException, InterruptedException {
		String term = null;
		ApiCalls api = new ApiCalls();

		Exception ex = assertThrows(Exception.class, () -> {
			api.GetVolumes(term, null, null, null, null, null, null, null);
		});
		String message = ex.getMessage();
		String expectedMessage = "Cannot invoke \"String.length()\" because \"s\" is null";
		boolean areEqual = message.equals(expectedMessage);
		assertTrue(areEqual);
	}

	@Test
	public void getVolumesShouldReturThrowExceptionInCaseOfEmptySearchParameter()
			throws IOException, InterruptedException {
		String term = "";
		ApiCalls api = new ApiCalls();

		Exception ex = assertThrows(Exception.class, () -> {
			api.GetVolumes(term, "", "", null, null, null, null, null);
		});

		String message = ex.getMessage();
		String expectedMessage = "Missing query.";
		boolean areEqual = message.equals(expectedMessage);
		assertTrue(areEqual);
	}

}
