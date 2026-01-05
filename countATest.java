package lab009;

import static org.junit.Assert.*;
import org.junit.Test;
public class countATest {

	@Test
	public void test() {
		JUnitTesting obj = new JUnitTesting();
        assertEquals(3, obj.countA("Java and Android"));
    }
}




