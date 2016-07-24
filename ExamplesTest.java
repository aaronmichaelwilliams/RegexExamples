import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExamplesTest {

    Examples ex;

    @Before
    public void setUp() {
        ex = new Examples();
    }

    @Test
    public void testEmailDotInfo() {
        assertTrue(ex.validateEmail("person@domain.info"));
    }

    @Test
    public void testEmailDotCoDotUK() {
        assertTrue(ex.validateEmail("person@domain.co.uk"));
    }

    @Test
    public void testEmailDotNet() {
        assertTrue(ex.validateEmail("person@domain.net"));
    }

    @Test
    public void testEmailDotCo() {
        assertTrue(ex.validateEmail("person@domain.co"));
    }

    @Test
    public void testEmailIncNumbers() {
        assertTrue(ex.validateEmail("123per123son123@123domain123.org"));
    }

    @Test
    public void testEmailIncDashLONDON() {
        assertTrue(ex.validateEmail("p-ers-o-n@domain.london"));
    }

    @Test
    public void testEmailIncUnderScoreLONDON() {
        assertTrue(ex.validateEmail("p.er.son@domain.gov.uk"));
    }

    @Test
    public void testEmailDotArpa() {
        assertTrue(ex.validateEmail("12345a@a1.arpa"));
    }

}