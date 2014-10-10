package ssk.project.StockWatcher.client;

import com.google.gwt.core.client.JavaScriptObject;

public class StockData extends JavaScriptObject {

	// Overlay types always have protected, zero argument constructors.
	protected StockData() {}
	
	public static final native String getSymbol() /*-{ return this.symbol; }-*/;
	public static final native double getPrice() /*-{ return this.price; }-*/;
	public static final native double getChange() /*-{ return this.change; }-*/;
	
	public final double getChangePercent() {
		return 100.0 * getChange() / getPrice();
	}
}
