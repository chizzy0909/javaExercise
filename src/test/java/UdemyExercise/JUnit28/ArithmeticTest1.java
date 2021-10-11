package UdemyExercise.JUnit28;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class ArithmeticTest1 {

  ArithmeticTest arithmeticTest1 = null;

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
    arithmeticTest1 = new ArithmeticTest();
  }

  @After
  public void AfterMethod() {

  }

  @Test
  public void add() {
    assertEquals(3,arithmeticTest1.add(2,1));
  }

  @Test
  public void sub() {
    assertEquals(1,arithmeticTest1.sub(2,1));
  }
}