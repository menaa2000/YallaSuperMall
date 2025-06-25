package io.paysky.qa;


import org.testng.Assert;
import org.testng.TestException;
import org.testng.annotations.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public abstract class QAForgeCore {

   // protected TestData testData;
    protected String propertiesFilePath = "config-android.properties";

//    @BeforeClass
//    @Parameters("testDataFile")
//    protected void setup(@Optional("") String testDataFile) {
//        try {
//            if (testDataFile == null || testDataFile.isEmpty()) {
//                testDataFile = this.getClass().getSimpleName() + ".xml";
//            }
//            testData = TestData.getInstance(testDataFile);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//            Assert.fail("could not read test data: " + testDataFile + "\n" + ex.getMessage());
//        }
//    }

//    @AfterClass
//    protected void tearDown() throws Exception {
//        // log error summary to allure report and closure report
//    }

//    public String getGlobalValueByKey(String key) throws IOException {
//        Properties prop = new Properties();
//        final ClassLoader cl = Thread.currentThread().getContextClassLoader();
//        final InputStream stream = cl.getResourceAsStream(propertiesFilePath);
//        prop.load(stream);
//        return prop.getProperty(key);
//    }

    public Properties getGlobalsValue() throws Exception {
        Properties prop = new Properties();
        final ClassLoader cl = Thread.currentThread().getContextClassLoader();
        final InputStream stream = cl.getResourceAsStream(propertiesFilePath);
        prop.load(stream);
        return prop;
    }

//    public void executeForEveryTestCase(final TestScript testScript){
//        final TestScenario testScenario = getTestScenario();
//        final String testScenarioName = testScenario.getName();
//
//        try{
//            for(TestCase testCase : testScenario.getTestCases()){
//                testScript.execute(testCase);
//            }
//        }catch(Exception ex){
//            Assert.fail("Failed in executeForEveryTestCase: " + ex.getMessage(), ex);
//        }
//    }
//
//    protected TestScenario getTestScenario() {
//        final StackTraceElement element = getTestMethodStackElement();
//        System.out.println("element: " + element.toString());
//        TestScenario ts = testData.getTestScenario(element.getMethodName());
//        if (ts == null) {
//            Assert.fail("No TestScenario assigned to the method: " + element.getMethodName());
//        }
//        System.out.println("Scenario: " + ts.getName());
//        return ts;
//    }
//
//    protected StackTraceElement getTestMethodStackElement() {
//        final Throwable t = new Throwable();
//        final StackTraceElement[] elements = t.getStackTrace();
//        Method method = null;
//        for (final StackTraceElement element : elements) {
//            // following trial will succeed only for parameterless methods
//            try {
////                method = Class.forName(element.getClassName()).getMethod(element.getMethodName());
//                method = Class.forName(element.getClassName()).getMethod(element.getMethodName(),String.class);
//            } catch (final Throwable e) {
//                // will fail for a method with parameters, which cannot be the test method case.
//                try {
//                    method = Class.forName(element.getClassName()).getMethod(element.getMethodName(),String.class);
//                } catch (Exception ex) {
//                    // will fail
//                    continue;
//                }
//            }
////            if (method != null && method.isAnnotationPresent(Test.class)) {
////                return element;
////            }
//            if (method != null) {
//                return element;
//            }
//        }
//        throw new TestException("getTestMethodStackElement() method called outside of any test method scope.");
//    }
}
