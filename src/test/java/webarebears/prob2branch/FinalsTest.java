package webarebears.prob2branch;

import org.junit.Test;
import static org.junit.Assert.*;

public class FinalsTest {

	@Test
	public void testCheckGraph() {
		Finals fin = new Finals();
		fin.main(null);
		int val = fin.checkGraph();
		assertEquals(val, 1);
	}
	
	@Test
	public void testCheckExport() {
		Finals fin = new Finals();
		fin.main(null);
		int val = fin.checkExport();
		assertEquals(val, 1);
	}

}
