package testing;

import static org.junit.Assert.assertEquals;

import java.awt.Color;

import org.junit.Test;

import sorting.gui.TraceSortDisplay;

public class GUITests {

	@Test
	public void testColorGeneration() {
		assertEquals(Color.getHSBColor(0, 1, .5f), TraceSortDisplay.returnColor(0));
		assertEquals(Color.getHSBColor(0.25f, 1, .5f), TraceSortDisplay.returnColor(90));
		assertEquals(Color.getHSBColor(0.5f, 1, .5f), TraceSortDisplay.returnColor(180));
	}

}
