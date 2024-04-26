package normaliser.model;

/**
 * Enum representing a set of normalized job titles.
 */
public enum NormalisedTitle {
	ARCHITECT("Architect"), SOFTWARE_ENGINEER("Software engineer"), QUANTITY_SURVEYOR("Quantity surveyor"),
	ACCOUNTANT("Accountant");

	private final String title;

	/**
	 * Constructs a NormalisedTitle enum constant with the specified title.
	 *
	 * @param title The title of the normalized job.
	 */
	NormalisedTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the title of the normalized job.
	 *
	 * @return The title of the normalized job.
	 */
	public String getTitle() {
		return title;
	}
}
