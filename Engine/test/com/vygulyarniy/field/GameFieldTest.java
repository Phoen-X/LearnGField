package com.vygulyarniy.field;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

import org.testng.annotations.Test;

/**
 * Class description here.
 * @author Vadim Vygulyarniy. 30.12.13 16:01
 */
public class GameFieldTest {

  @Test
  public void testQuadraticGameFieldCreation() {
    // quadratic field creation
    GameField field = new GameField(100, 100, 10);
    assertNotNull("Cells are not created", field.cells);
    assertEquals("Horizontal cells are not correct", 10, field.cells.length);
    assertEquals("Vertical cells are not correct", 10, field.cells[0].length);
  }

  @Test
  public void testRectangleGameFieldCreation() {
    GameField field = new GameField(154, 53, 10);
    assertNotNull("Cells are not created", field.cells);
    assertEquals("Horizontal cells are not correct", 16, field.cells.length);
    assertEquals("Vertical cells are not correct", 6, field.cells[0].length);
  }

  @Test
  public void testSingleCellFieldCreation() {
    GameField field = new GameField(100, 53, 500);
    assertNotNull("Cells are not created", field.cells);
    assertEquals("Horizontal cells are not correct", 1, field.cells.length);
    assertEquals("Vertical cells are not correct", 1, field.cells[0].length);
  }
}
