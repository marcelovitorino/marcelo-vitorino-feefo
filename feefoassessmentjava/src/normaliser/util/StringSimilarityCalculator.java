package normaliser.util;

/**
 * Utility class to calculate similarity between strings using Levenshtein
 * distance.
 * 
 * @{link https://en.wikipedia.org/wiki/Levenshtein_distance}
 * 
 * @author Marcelo Vitorino <marcelogabrielvitorino@gmail.com>
 */
public class StringSimilarityCalculator {

	/**
	 * Calculates the similarity score between two strings.
	 *
	 * @param s1 The first string.
	 * @param s2 The second string.
	 * @return The similarity score between the two strings, ranging from 0.0 to
	 *         1.0.
	 */
	public static double calculateSimilarityScore(String s1, String s2) {
		int maxLength = Math.max(s1.length(), s2.length());
		int distance = calculateLevenshteinDistance(s1, s2);
		return 1.0 - (double) distance / maxLength;
	}

	/**
	 * Calculates the Levenshtein distance between two strings.
	 *
	 * @param str1 The first string.
	 * @param str2 The second string.
	 * @return The Levenshtein distance between the two strings.
	 */
	public static int calculateLevenshteinDistance(String str1, String str2) {
		int[][] distanceMatrix = new int[str1.length() + 1][str2.length() + 1];

		for (int row = 0; row <= str1.length(); row++) {
			distanceMatrix[row][0] = row;
		}
		for (int col = 0; col <= str2.length(); col++) {
			distanceMatrix[0][col] = col;
		}

		for (int rowIndex = 1; rowIndex <= str1.length(); rowIndex++) {
			for (int colIndex = 1; colIndex <= str2.length(); colIndex++) {
				int substitutionCost = (str1.charAt(rowIndex - 1) == str2.charAt(colIndex - 1)) ? 0 : 1;
				distanceMatrix[rowIndex][colIndex] = Math.min(
						Math.min(distanceMatrix[rowIndex - 1][colIndex] + 1,
								distanceMatrix[rowIndex][colIndex - 1] + 1),
						distanceMatrix[rowIndex - 1][colIndex - 1] + substitutionCost);
			}
		}

		return distanceMatrix[str1.length()][str2.length()];
	}

}