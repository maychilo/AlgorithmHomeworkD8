package homeworkD8;

public class SquareRootService {
	public static double getSqrt(double number) { 
		double i;
		double sqrt = number / 2; 
		do {
			i = sqrt;
			sqrt = (i + (number / i)) / 2; 
											
		} while ((i - sqrt) != 0); 
									
		return sqrt;

		// TIME COMPLEXITY O(n^(log (1/E))
		
		// The Babylonian square-root algorithm
		// Improve the guess. Apply the formula x1 = (X0 + S / X0) / 2.
		// The number x1 is a better approximation to sqrt(S).
		// Iterate until convergence. Apply the formula Xn+1 = (Xn + S / Xn) / 2 until
		// the process converges. infinity
		
	}
}
