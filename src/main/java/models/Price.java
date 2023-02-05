package models;

public class Price {
	private int amountInMicros;
	private String currencyCode;

	public int getAmountInMicros() {
		return amountInMicros;
	}

	public void setAmountInMicros(int amountInMicros) {
		this.amountInMicros = amountInMicros;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
}
