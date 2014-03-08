/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import bradz.boom.com.MyInterface;
import bradz.boom.com.Header;
import bradz.confi.AppConfig;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.Ignore;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/**
 *
 * @author 211064084
 */
public class testingAssertion {
    
    public testingAssertion() {
    }
    private static MyInterface myObject;
    private static ApplicationContext ctx;
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void integerAssertion(){
    
        int studNum = myObject.getStudentNum();
        Assert.assertEquals(209215178, studNum,"The student number is wrong");
    }
    
    public void worldTest()
    {
        String worldMess = myObject.hello();
        System.out.println(worldMess);
    }
    @Test
    public void floatAssertion()
    {
        float fees = myObject.feesDue();
        Assert.assertEquals(3456.56f, fees, "Expected 3456.56");
    }
    @Test
    public void objectEquality()
    {
        Header head = new Header("Bradz","Baartman");
        Assert.assertEquals(head.toString(),"BradzBaartman",
                "Expected BradzBaartman");
    }
    
    @Test
    public void objNotSame()
    {
        Header head = new Header("Bradz","Baartman");
        Assert.assertNotSame(head.toString(),"Bradz Baartman",
                "Expected Bradz Baartman");
    }
    
    @Test
    public void trueTest()
    {
        Header head = new Header("Bradz","Baartman");
        Assert.assertTrue(head.toString().equalsIgnoreCase("bradzBaartman"),
                "Is True test");
    }
    
    @Test
    public void falseTest()
    {
        Header head = new Header("Bradz","Baartman");
        Assert.assertFalse(head.toString().equals("bradzBaartman"),
                "Is False test");
    }
    
    @Test
    public void notNullTest()
    {
         //Header head = new Header("Bradz","Baartman");
         Assert.assertNotNull(myObject, "Object is not null");
    }
    
    /**
     *
     */
    @Test
    public void failTest()
    {
        Assert.fail("Deliberate fail");
    }
    
    @Test
    public void verifyArrayContent() throws Exception
    {
        String [] actual = new String[]{"Bradley","Esmonde","Baartman"};
        String [] var = new String[]{"Bradley1","Esmonde1","Baartman1"};
        Assert.assertNotEquals(actual, var, "The 2 arrays are not be the same");
    }
    @Ignore("this doesn't work yet")
    @Test
    public void exceptionTest() throws Exception
    {
        Pattern pat = Pattern.compile("12345");
        Matcher match = pat.matcher("12346");
        boolean bool = match.matches();
        Assert.assertFalse(bool, "Pattern did not match");
    }
        
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        myObject = (Header)ctx.getBean("class1");
        System.out.println("This is in the Before class");
        
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("This is in the After class");
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.out.println("This is in the before method");
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        System.out.println("This is in the After method");
    }
}