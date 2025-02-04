package ssk.project.StockWatcher.server;

import java.util.Random;

import ssk.project.StockWatcher.client.DelistedException;
import ssk.project.StockWatcher.client.StockPrice;
import ssk.project.StockWatcher.client.StockPriceService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class StockPriceServiceImpl2 extends RemoteServiceServlet implements StockPriceService {

	private static final long serialVersionUID = 1L;
	private static final double MAX_PRICE = 100.0; // $100.00
	private static final double MAX_PRICE_CHANGE = 0.02; // +/- 2%
	
	/**
	 * Takes a String array of Stocks Symbols and returns an Array of StockPrice Objects.
	 * @param symbols A string array of Stock Symbols
	 */
	@Override
	public StockPrice[] getPrices(String[] symbols) throws DelistedException {
		Random rnd = new Random();
		StockPrice[] prices = new StockPrice[symbols.length];
		
		for (int i = 0; i < symbols.length; i++) {
			if (symbols[i].equals("ERR")) {
				throw new DelistedException("ERR");
			}
			double price = rnd.nextDouble() * MAX_PRICE;
			double change = price * MAX_PRICE_CHANGE * (rnd.nextDouble() * 2f - 1f);
			prices[i] = new StockPrice(symbols[i], price, change);
		}
		return prices;
	}

}
