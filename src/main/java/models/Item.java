package models;

import java.text.MessageFormat;

public class Item {
	private String kind;
	private String id;
	private String etag;
	private String selfLink;
	private VolumeInfo volumeInfo;
	private LayerInfo layerInfo;
	private AccessInfo accessInfo;
	private SaleInfo saleInfo;
	private SearchInfo searchInfo;

	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEtag() {
		return etag;
	}
	public void setEtag(String etag) {
		this.etag = etag;
	}
	public String getSelfLink() {
		return selfLink;
	}
	public void setSelfLink(String selfLink) {
		this.selfLink = selfLink;
	}
	public VolumeInfo getVolumeInfo() {
		return volumeInfo;
	}
	public void setVolumeInfo(VolumeInfo volumeInfo) {
		this.volumeInfo = volumeInfo;
	}

	public SearchInfo getSearchInfo() {
		return searchInfo;
	}

	public void setSearchInfo(SearchInfo searchInfo) {
		this.searchInfo = searchInfo;
	}

	public SaleInfo getSaleInfo() {
		return saleInfo;
	}

	public void setSaleInfo(SaleInfo saleInfo) {
		this.saleInfo = saleInfo;
	}

	public AccessInfo getAccessInfo() {
		return accessInfo;
	}

	public void setAccessInfo(AccessInfo accessInfo) {
		this.accessInfo = accessInfo;
	}

	public LayerInfo getLayerInfo() {
		return layerInfo;
	}

	public void setLayerInfo(LayerInfo layerInfo) {
		this.layerInfo = layerInfo;
	}

	@Override
	public String toString() {
		String result = MessageFormat.format("- ID:{0}\n- Title:{1}\n- Subtitle:{2}\n- Authors:{3}\n- Description:{4} ",
				id,
				volumeInfo.getTitle(), volumeInfo.getSubtitle(), String.join(", ", volumeInfo.getAuthors()),
				volumeInfo.getDescription());

		return result;
	}

}
