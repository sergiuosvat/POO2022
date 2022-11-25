import junit.framework.TestCase;

public class ReverseStringsTest extends TestCase {

    public void testReverseAString() {
        ReverseStrings tester = new ReverseStrings();
        assertEquals("Single name must return single name", "Sergiu",tester.reverseAString("Sergiu"));
        assertEquals("You have to trim the white spaces!", "Sergiu", tester.reverseAString(" Sergiu "));
        assertNull("Check the condition for null", tester.reverseAString(null));
        assertEquals("Check the condition for empty string", "\"\"", tester.reverseAString(""));
        assertEquals("Trim the whitespaces and return the correct form", "\"Osvat, Sergiu \"", tester.reverseAString(" Sergiu Osvat "));
        assertEquals("Check the condition for titles before the names", "\"Osvat, Sergiu Mr.\"", tester.reverseAString("Mr. Sergiu Osvat"));
        assertEquals("Check the condition for titles before the names", "\"Osvat, Sergiu Mr. Phd.\"", tester.reverseAString("Mr. Phd. Sergiu Osvat"));
    }


}