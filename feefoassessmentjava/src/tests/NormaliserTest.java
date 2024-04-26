package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import normaliser.manager.Normaliser;
import normaliser.model.NormalisedTitle;

class NormaliserTest {

	@Test
	void testNormaliseValidInput() {
		Normaliser normaliser = new Normaliser();
		assertEquals(NormalisedTitle.SOFTWARE_ENGINEER.getTitle(), normaliser.normalise("Java engineer"));
		assertEquals(NormalisedTitle.SOFTWARE_ENGINEER.getTitle(), normaliser.normalise("C# engineer"));
		assertEquals(NormalisedTitle.ACCOUNTANT.getTitle(), normaliser.normalise("Chief Accountant"));
		assertEquals(NormalisedTitle.ACCOUNTANT.getTitle(), normaliser.normalise("Accountant"));
	}

	@Test
	void testNormaliseNullInput() {
		Normaliser normaliser = new Normaliser();
		assertThrows(IllegalArgumentException.class, () -> normaliser.normalise(null));
	}

	@Test
	void testNormaliseEmptyInput() {
		Normaliser normaliser = new Normaliser();
		assertThrows(IllegalArgumentException.class, () -> normaliser.normalise(""));
	}

}
