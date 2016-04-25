import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;


public class Triangle {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/triangle", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      int side1 = Integer.parseInt(request.queryParams("side1"));
      int side2 = Integer.parseInt(request.queryParams("side2"));
      int side3 = Integer.parseInt(request.queryParams("side3"));

      Triangle myTriangle = new Triangle(side1, side2, side3);
      model.put("myTriangle", myTriangle);

      model.put("template", "templates/triangle.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
    //end of interface logic

  // public class Triangle
  private int mSide1;
  private int mSide2;
  private int mSide3;

  public Triangle(int side1, int side2, int side3) {
    mSide1 = side1;
    mSide2 = side2;
    mSide3 = side3;
  }
  public int getSide1() {
    return mSide1;
  }

  public int getSide2() {
    return mSide2;
  }

  public int getSide3() {
    return mSide3;
  }

  public boolean isTriangle() {
    Boolean triangle = false;
    if (mSide1 + mSide2 > mSide3 && mSide1 + mSide3 > mSide2 && mSide2 + mSide3 > mSide1) {
      triangle = true;
    } return triangle;
  }
  public boolean isEquilateral() {
    Boolean equilateral = false;
    if (mSide1 == mSide2 && mSide2 == mSide3) {
      equilateral = true;
    } return equilateral;
  }
  public boolean isIsosceles() {
    Boolean isosceles = false;
    if (mSide1 == mSide2 && mSide2 != mSide3) {
      isosceles = true;
    } else if (mSide1 == mSide3 && mSide3 != mSide2) {
      isosceles = true;
    } else if (mSide2 == mSide3 && mSide3 != mSide1) {
      isosceles = true;
    } return isosceles;
  }
  // public boolean isScalene() {
  //   return mLength == mWidth;
  // }

}
