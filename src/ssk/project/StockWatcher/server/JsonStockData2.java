package ssk.project.StockWatcher.server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JsonStockData2 extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final double MAX_PRICE = 100; // $100
	private static final double MAX_PRICE_CHANGE = 0.02; // +/- 2%
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Random rnd = new Random();
		PrintWriter out = response.getWriter();
		out.println('[');
		String[] stockSymbols = request.getParameter("q").split(" ");
		boolean firstSymbol = true;
		for (String stockSymbol: stockSymbols) {
			double price = rnd.nextDouble() * MAX_PRICE;
			double change = price * MAX_PRICE_CHANGE * (rnd.nextDouble() * 2f - 1f);
			
			if (firstSymbol) {
				firstSymbol = false;
			} else {
				out.println(" ,");
			}
			out.println(" {");
			out.print("   \"symbol\": \"");
			out.print(stockSymbol);
			out.println("\",");
			out.print("   \"price\": ");
			out.print(price);
			out.print("   \"change\": ");
			out.println(change);
			out.println("  }");
		}
		out.println(']');
		out.flush();
	}
}
