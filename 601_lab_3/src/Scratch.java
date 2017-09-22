/**
 * Just a class for your own code experiments...
 * 
 * The commented-out code does a few experiments:
 * 
 * The first experiment below is how narrowing works: converting one type
 * variable to another
 * 
 * The second shows how StdIn.readXXX works for different types XXX.
 * 
 * @author eric
 *
 */
public class Scratch
{

	public static void main(String[] args)
	{
		double theta = 3.14159;
		
		StdOut.printf("The formula is: sin(%f) = cos(Math.PI/2.0 - %f)\n",  theta, theta);
		StdOut.println("The left side is:  " + Math.sin(theta));
		StdOut.println("The right side is: " + Math.cos(Math.PI/2.0 - theta));
	}

}
