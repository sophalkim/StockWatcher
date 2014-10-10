package ssk.project.StockWatcher.client;

import com.google.gwt.core.client.JavaScriptObject;

public class StockData2 extends JavaScriptObject{

	protected StockData2() {}
	
	public static final native String getSymbol() /*-{ return this.symbol; }-*/;
	public static final native double getPrice() /*-{ return this.price; }-*/;
	public static final native double getChange() /*-{ return this.change; }-*/;
	
	public final double getChangePercet() {
		return 100.0 * getChange() / getPrice();
	}
}
