package models;

import java.util.ArrayList;

public class UserBookshelves {
	private String kind;
	private ArrayList<Bookshelve> items;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public ArrayList<Bookshelve> getItems() {
		return items;
	}

	public void setItems(ArrayList<Bookshelve> items) {
		this.items = items;
	}
}
