package ssk.project.StockWatcher.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("stockPrices2")
public interface StockPriceService2 extends RemoteService {
	
	StockPrice2[] getPrices(String[] symbols) throws DelistedException;
}
