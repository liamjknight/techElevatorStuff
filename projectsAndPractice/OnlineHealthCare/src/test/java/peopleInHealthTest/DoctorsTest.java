package peopleInHealthTest;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import peopleInHealth.Doctors;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DoctorsTest {
	Doctors test = new Doctors("Kale", "Barnahm", "a43f7e", 1);

	@Test
	public void testSetIsInER() {
		test.setInER();
		Assert.assertTrue(test.isInER());
		test.setInER();
		Assert.assertFalse(test.isInER());
	}

}
