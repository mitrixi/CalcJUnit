import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(CalcTest.UsualTests.class)
@Suite.SuiteClasses({CalcTest.class})
public class ClientTest {

}
