import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static com.tngtech.java.junit.dataprovider.DataProviders.*;
import static org.junit.Assert.*;

public class CalcTest {
    private static Calc calc;

    interface UsualTests {
    }

    interface ParametrizedTests {
    }

    @BeforeClass
    public static void createCalc() {
        calc = new Calc();
    }

    @DataProvider
    public static Object[][] dataProvider() {
        return $$(
                $(2, -2),
                $(-2, 2),
                $(0, 5),
                $(5, 0)
        );
    }

    @Category(UsualTests.class)
    @Test
    public void shouldReturnSumOfTwoNumbers() {
        assertEquals(10, calc.sum(5, 5));
    }

    @Category(UsualTests.class)
    @Test
    public void shouldReturnDiffOfTwoNumbers() {
        assertEquals(3, calc.subtracting(10, 7));
    }

    @Category({UsualTests.class, ParametrizedTests.class})
    @Test
    @UseDataProvider("dataProvider")
    public void shouldReturnMultiplicationOfTwoNumbers() {
        assertEquals(9, calc.multiplication(3, 3));
    }

    @Category({UsualTests.class, ParametrizedTests.class})
    @Test
    @UseDataProvider("dataProvider")
    public void shouldReturnDivisionOfTwoNumbers() {
        assertEquals(2, calc.division(10, 5));
    }
}

