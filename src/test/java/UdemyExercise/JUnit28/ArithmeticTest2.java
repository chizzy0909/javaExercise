package UdemyExercise.JUnit28;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArithmeticTest2 {

  ArithmeticTest arithmeticTest2;

  @BeforeClass
  public static void beforeClass() {
    System.out.println("TestCase execution begin.");
  }

  @AfterClass
  public static void AfterClass() {
    System.out.println("TestCase execution has been finished.");
  }

  @Before
  public void BeforeMethod() {
    arithmeticTest2 = new ArithmeticTest();
  }

  @After
  public void AfterMethod() {

  }


  @Test
  public void mul() {
    assertEquals(2,arithmeticTest2.mul(2,1));
  }

  @Test
  public void div() {
    assertEquals(2,arithmeticTest2.div(2,1));
  }

}