package ssk.project.StockWatcher.client;

import java.io.Serializable;

public class DelistedException2 extends Exception implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String symbol;
	
	public DelistedException2() {}
	
	public DelistedException2(String symbol) {
		this.symbol = symbol;
	}
	
	public String getSymbol() {
		return symbol;
	}
}
