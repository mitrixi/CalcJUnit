import static com.tngtech.java.junit.dataprovider.DataProviders.$;
import static com.tngtech.java.junit.dataprovider.DataProviders.$$;

public class DataProvider {

    @com.tngtech.java.junit.dataprovider.DataProvider
    public static Object[][] dataProviderSumArray() {
        return $$(
//                $(11, 1, 2, 3, 4),
                $(10, 1, 2, 3, 4)
        );
    }

    @com.tngtech.java.junit.dataprovider.DataProvider
    public static Object[][] dataProviderMul() {
        return $$(
                $(10, 2, 20),
                $(4, 4, 16),
                $(2, -2, -4),
                $(0, 5, 0)
        );
    }

    @com.tngtech.java.junit.dataprovider.DataProvider
    public static Object[][] dataProviderDiv() {
        return $$(
                $(10, 2, 5),
                $(4, 4, 1),
                $(2, -2, -1),
                $(-2, 2, -1),
                $(0, 5, 0)
        );
    }
}
