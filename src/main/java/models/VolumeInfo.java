package models;

import java.util.ArrayList;

public class VolumeInfo {

	private String title;
	private String subtitle;
	private ArrayList<String> authors;
	private String publisher;
	private String publishedDate;
	private String description;
	private ArrayList<IndustryIdentifier> industryIdentifiers;
	private ReadingModes readingModes;
	private Integer pageCount;
	private String printType;
	private ArrayList<String> categories;
	private int averageRating;
	private int ratingsCount;
	private String maturityRating;
	private Boolean allowAnonLogging;
	private String contentVersion;
	private PanelizationSummary panelizationSummary;
	private ImageLink imageLinks;
	private String language;
	private String previewLink;
	private String infoLink;
	private String canonicalVolumeLink;
	private int printedPageCount;
	private Dimensions dimensions;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public String getPrintType() {
		return printType;
	}

	public void setPrintType(String printType) {
		this.printType = printType;
	}

	public ArrayList<String> getCategories() {
		return categories;
	}

	public void setCategories(ArrayList<String> categories) {
		this.categories = categories;
	}

	public String getMaturityRating() {
		return maturityRating;
	}

	public void setMaturityRating(String maturityRating) {
		this.maturityRating = maturityRating;
	}

	public Boolean getAllowAnonLogging() {
		return allowAnonLogging;
	}

	public void setAllowAnonLogging(Boolean allowAnonLogging) {
		this.allowAnonLogging = allowAnonLogging;
	}

	public String getContentVersion() {
		return contentVersion;
	}

	public void setContentVersion(String contentVersion) {
		this.contentVersion = contentVersion;
	}

	public PanelizationSummary getPanelizationSummary() {
		return panelizationSummary;
	}

	public void setPanelizationSummary(PanelizationSummary panelizationSummary) {
		this.panelizationSummary = panelizationSummary;
	}

	public ImageLink getImageLinks() {
		return imageLinks;
	}

	public void setImageLinks(ImageLink imageLinks) {
		this.imageLinks = imageLinks;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPreviewLink() {
		return previewLink;
	}

	public void setPreviewLink(String previewLink) {
		this.previewLink = previewLink;
	}

	public String getInfoLink() {
		return infoLink;
	}

	public void setInfoLink(String infoLink) {
		this.infoLink = infoLink;
	}

	public String getCanonicalVolumeLink() {
		return canonicalVolumeLink;
	}

	public void setCanonicalVolumeLink(String canonicalVolumeLink) {
		this.canonicalVolumeLink = canonicalVolumeLink;
	}

	public ReadingModes getReadingModes() {
		return readingModes;
	}

	public void setReadingModes(ReadingModes readingModes) {
		this.readingModes = readingModes;
	}

	public int getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(int averageRating) {
		this.averageRating = averageRating;
	}

	public int getRatingsCount() {
		return ratingsCount;
	}

	public void setRatingsCount(int ratingsCount) {
		this.ratingsCount = ratingsCount;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public int getPrintedPageCount() {
		return printedPageCount;
	}

	public void setPrintedPageCount(int printedPageCount) {
		this.printedPageCount = printedPageCount;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	public ArrayList<IndustryIdentifier> getIndustryIdentifiers() {
		return industryIdentifiers;
	}

	public void setIndustryIdentifiers(ArrayList<IndustryIdentifier> industryIdentifiers) {
		this.industryIdentifiers = industryIdentifiers;
	}

}
