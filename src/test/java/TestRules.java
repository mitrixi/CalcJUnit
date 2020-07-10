import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.List;

public class TestRules {

    @Rule
    public final TestRule testRule = new TestRule() {
        @Override
        public Statement apply(final Statement statement, Description description) {
            return new Statement() {
                @Override
                public void evaluate() throws Throwable {
                    statement.evaluate();
                }
            };
        }
    };

//    @Override
//    public Statement apply(Statement statement, Description description) {
//        return new Statement() {
//            @Override
//            public void evaluate() throws Throwable {
//                System.out.println(";asdfa");
//
//                statement.evaluate();
//            }
//        };
//    }

    @Rule
    public TestRule rule = new TestWatcher() {

        @Override
        protected void succeeded(Description description) {
            System.out.println("Test " + description.getMethodName() + " succeeded");
        }

        @Override
        protected void failed(Throwable e, Description description) {
            System.out.println("Test " + description.getMethodName() + " failed");
        }

        @Override
        protected void starting(Description description) {
            for (Annotation annotation : description.getAnnotations()) {
                if (annotation instanceof MyOwnAnnotation)
                    System.out.println(((MyOwnAnnotation) annotation).info());
            }

            System.out.println("Test " + description.getMethodName() + " has started");
        }

        @Override
        protected void finished(Description description) {
            System.out.println("Test " + description.getMethodName() + " has finished\r\n");
        }
    };
}
