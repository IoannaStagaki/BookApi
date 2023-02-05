package models;

public class Bookshelve {
	private String kind;
	private int id;
	private String title;
	private String access;
	private String updated;
	private String created;
	private int volumeCount;
	private String volumesLastUpdated;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public int getVolumeCount() {
		return volumeCount;
	}

	public void setVolumeCount(int volumeCount) {
		this.volumeCount = volumeCount;
	}

	public String getVolumesLastUpdated() {
		return volumesLastUpdated;
	}

	public void setVolumesLastUpdated(String volumesLastUpdated) {
		this.volumesLastUpdated = volumesLastUpdated;
	}
}
