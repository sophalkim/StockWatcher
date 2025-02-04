package ssk.project.StockWatcher.client;

import java.io.Serializable;

public class StockPrice2 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String symbol;
	private double price;
	private double change;
	
	public StockPrice2() {}
	
	public StockPrice2(String symbol, double price, double change) {
		this.symbol = symbol;
		this.price = price;
		this.change = change;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getChange() {
		return change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public double getChangePercent() {
		return 100.0 * this.change / this.price;
	}
}
