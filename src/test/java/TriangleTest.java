import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle(2, 4, 2);
    assertEquals(true, testTriangle instanceof Triangle);
  }
  @Test
  public void getSide1_getsTriangleSide1_2() {
    Triangle testTriangle = new Triangle(2, 4, 2);
    assertEquals(2, testTriangle.getSide1());
  }
  @Test
  public void getSide2_getsTriangleSide2_4() {
    Triangle testTriangle = new Triangle(2, 4, 2);
    assertEquals(4, testTriangle.getSide2());
  }
  @Test
  public void getSide3_getsTriangleSide3_2() {
    Triangle testTriangle = new Triangle(2, 4, 2);
    assertEquals(2, testTriangle.getSide3());
  }
  @Test
  public void isEquilateral_allSidesEqual_true() {
    Triangle testTriangle = new Triangle(2, 2, 2);
    assertEquals(true, testTriangle.isEquilateral());
  }
  @Test
  public void isEquilateral_allSidesEqual_false() {
    Triangle testTriangle = new Triangle(5, 2, 2);
    assertEquals(false, testTriangle.isEquilateral());
  }
  @Test
  public void isIsosceles_twoSidesEqual_true() {
    Triangle testTriangle = new Triangle(1, 2, 2);
    assertEquals(true, testTriangle.isIsosceles());
  }
  @Test
  public void isTriangle_twoSidesGreaterThanThird_true() {
    Triangle testTriangle = new Triangle(5, 10, 7);
    assertEquals(true, testTriangle.isTriangle());
  }
  @Test
  public void isScalene_noSidesEqual_true() {
    Triangle testTriangle = new Triangle(1, 2, 4);
    assertEquals(true, testTriangle.isScalene());
  }
}
