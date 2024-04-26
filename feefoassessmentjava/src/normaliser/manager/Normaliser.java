package normaliser.manager;

import normaliser.model.NormalisedTitle;
import normaliser.util.StringSimilarityCalculator;

/**
 * Normaliser class provides functionality to normalize job titles.
 * 
 * @author Marcelo Vitorino <marcelogabrielvitorino@gmail.com>
 */
public class Normaliser {

	/**
	 * Normalizes the given job title by finding the closest match from a predefined
	 * list of normalized titles.
	 *
	 * @param jobTitle The job title to be normalized.
	 * @return The closest matching normalized job title.
	 * @throws IllegalArgumentException if jobTitle is null or empty.
	 */
	public String normalise(String jobTitle) {
		if (jobTitle == null || jobTitle.isEmpty()) {
			throw new IllegalArgumentException("Job title cannot be null or empty");
		}

		String lowercaseJobTitle = jobTitle.toLowerCase();
		String bestMatch = "";
		double bestScore = 0.0;

		for (NormalisedTitle normalizedTitle : NormalisedTitle.values()) {
			double score = StringSimilarityCalculator.calculateSimilarityScore(lowercaseJobTitle,
					normalizedTitle.getTitle().toLowerCase());
			if (score > bestScore) {
				bestScore = score;
				bestMatch = normalizedTitle.getTitle();
			}
		}

		return bestMatch;
	}
}
