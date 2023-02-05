package models;

public class AccessInfo {
	private String country;
	private String viewability;
	private Boolean embeddable;
	private Boolean publicDomain;
	private String textToSpeechPermission;
	private TypeOfMedia epub;
	private TypeOfMedia pdf;
	private String webReaderLink;
	private String accessViewStatus;
	private Boolean quoteSharingAllowed;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getViewability() {
		return viewability;
	}

	public void setViewability(String viewability) {
		this.viewability = viewability;
	}

	public Boolean getEmbeddable() {
		return embeddable;
	}

	public void setEmbeddable(Boolean embeddable) {
		this.embeddable = embeddable;
	}

	public Boolean getPublicDomain() {
		return publicDomain;
	}

	public void setPublicDomain(Boolean publicDomain) {
		this.publicDomain = publicDomain;
	}

	public String getTextToSpeechPermission() {
		return textToSpeechPermission;
	}

	public void setTextToSpeechPermission(String textToSpeechPermission) {
		this.textToSpeechPermission = textToSpeechPermission;
	}

	public String getWebReaderLink() {
		return webReaderLink;
	}

	public void setWebReaderLink(String webReaderLink) {
		this.webReaderLink = webReaderLink;
	}

	public String getAccessViewStatus() {
		return accessViewStatus;
	}

	public void setAccessViewStatus(String accessViewStatus) {
		this.accessViewStatus = accessViewStatus;
	}

	public Boolean getQuoteSharingAllowed() {
		return quoteSharingAllowed;
	}

	public void setQuoteSharingAllowed(Boolean quoteSharingAllowed) {
		this.quoteSharingAllowed = quoteSharingAllowed;
	}

	public TypeOfMedia getEpub() {
		return epub;
	}

	public void setEpub(TypeOfMedia epub) {
		this.epub = epub;
	}

	public TypeOfMedia getPdf() {
		return pdf;
	}

	public void setPdf(TypeOfMedia pdf) {
		this.pdf = pdf;
	}

}
