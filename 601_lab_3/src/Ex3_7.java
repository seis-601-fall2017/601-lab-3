/**
 * Lab 3, problem 3
 * 
 */
public class Ex3_7
{
	// -----------------------------------------------------------------
	// Computes the Fahrenheit equivalent of a specific Celsius
	// value using the formula F = (9/5)C + 32.
	// -----------------------------------------------------------------

	public static void main(String[] args)
	{
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0 / 5.0;

		double fahrenheitTemp;
		int celsiusTemp = 24; // value to convert

		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

		System.out.println("Celsius Temperature: " + celsiusTemp);
		System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
	}
}
