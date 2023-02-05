package models;

public class TypeOfMedia {
	private Boolean isAvailable;
	private String acsTokenLink;
	private String downloadLink;

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getAcsTokenLink() {
		return acsTokenLink;
	}

	public void setAcsTokenLink(String acsTokenLink) {
		this.acsTokenLink = acsTokenLink;
	}

	public String getDownloadLink() {
		return downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
}
