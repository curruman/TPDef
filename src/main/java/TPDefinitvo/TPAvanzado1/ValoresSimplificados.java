package TPDefinitvo.TPAvanzado1;

import java.math.BigDecimal;

public class ValoresSimplificados {
	private String ticker;
	//private double price;
	private BigDecimal price;
	private String isin;
	
	
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	
	
}
