package models;

import java.util.ArrayList;

public class SaleInfo {
	private String country;
	private String saleability;
	private Boolean isEbook;
	private PriceSale listPrice;
	private PriceSale retailPrice;
	private String buyLink;
	private ArrayList<Offer> offers;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSaleability() {
		return saleability;
	}

	public void setSaleability(String saleability) {
		this.saleability = saleability;
	}

	public Boolean getIsEbook() {
		return isEbook;
	}

	public void setIsEbook(Boolean isEbook) {
		this.isEbook = isEbook;
	}


	public String getBuyLink() {
		return buyLink;
	}

	public void setBuyLink(String buyLink) {
		this.buyLink = buyLink;
	}

	public ArrayList<Offer> getOffers() {
		return offers;
	}

	public void setOffers(ArrayList<Offer> offers) {
		this.offers = offers;
	}

	public PriceSale getListPrice() {
		return listPrice;
	}

	public void setListPrice(PriceSale listPrice) {
		this.listPrice = listPrice;
	}

	public PriceSale getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(PriceSale retailPrice) {
		this.retailPrice = retailPrice;
	}

}