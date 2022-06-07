package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;

	public static double converter(double price, double bought) {
		return price * bought * (1.0 + IOF);
	}

}