import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by ialsanea on 1/14/15.
 */
public class MenuTest {
    private Menu menu;

    @Before
    public void setUp() {
        menu = new Menu();
    }

    //test for printing menu
    //test for input
    //test for if put input of list books then lists books
    //test for if put something else then print out error message


    @Test
    public void shouldPrintMenuWhenCalled() {
        String expectedOptions = "List Books";
        String options = menu.listOptions();
        assertThat(options, is(expectedOptions));
    }
}
