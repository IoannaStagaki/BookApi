package models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Post {

	@JsonProperty("userId")
	public String UserId;
	public int id;
	public String title;
	public String body;

	@Override
	public String toString() {
		return this.UserId + "\n" + this.id + "\n" + this.title + "\n" + this.body;
	}
}
