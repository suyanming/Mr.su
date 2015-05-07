package su;

public class ReviewTest
{
     public void changePoint(Point point)
     {
          point = new Point();
          point.x = 3;
          point.y = 4;
     }
     public static void main(String[] args)
     {
          ReviewTest rt = new ReviewTest();
          Point point = new Point();
          rt.changePoint(point);
          System.out.println(point.x);
          System.out.println(point.y);
     }
}
class Point
{
     int x;
     int y;
}
