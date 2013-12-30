import com.vygulyarniy.beans.Point;
import com.vygulyarniy.field.GameField;

/**
 * Class description here.
 * @author Vadim Vygulyarniy. 30.12.13 15:22
 */
public class TestClass {

  public static void main(String[] args) {
    GameField field = new GameField(new Point(10000, 10000));
    System.out.println(field.toString());
  }
}
