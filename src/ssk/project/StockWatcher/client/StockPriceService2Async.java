package ssk.project.StockWatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StockPriceService2Async {

	void getPrices(String[] symbols, AsyncCallback<StockPrice2[]> callback);
}
