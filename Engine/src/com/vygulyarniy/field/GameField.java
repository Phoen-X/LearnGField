package com.vygulyarniy.field;

import com.vygulyarniy.beans.Point;

/**
 * Class description here.
 * @author Vadim Vygulyarniy. 30.12.13 15:43
 */
public class GameField {
  GameCell[][] cells;
  Point topLeft = new Point(0, 0);
  Point bottomRight;
  int cellSize;
  static final int DEFAULT_CELL_SIZE = 1000;

  public GameField(final Point bottomRight, final int cellSize) {
    this.bottomRight = bottomRight;
    this.cellSize = cellSize;
    initCells();
  }

  public GameField(final int width, final int height, final int cellSize) {
    this(new Point(width, height), cellSize);
  }

  public GameField(final Point bottomRight) {
    this(bottomRight, DEFAULT_CELL_SIZE);
  }

  public GameField(final int width, final int height) {
    this(new Point(width, height));
  }

  private void initCells() {
    int horizontalCells = Math.abs(getFieldWidth() / cellSize);
    int verticalCells = Math.abs(getFieldHeight() / cellSize);

    if (getFieldWidth() % cellSize != 0) {
      horizontalCells++;
    }
    if (getFieldHeight() % cellSize != 0) {
      verticalCells++;
    }
    createCells(horizontalCells, verticalCells);
  }

  private void createCells(final int horizontalCells, final int verticalCells) {
    cells = new GameCell[horizontalCells][verticalCells];
    for (int verticalIndex = 0; verticalIndex < verticalCells; verticalIndex++) {
      for (int horizontalIndex = 0; horizontalIndex < horizontalCells; horizontalIndex++) {
        createCell(horizontalIndex, verticalIndex);
      }
    }
  }

  private void createCell(final int horizontalIndex, final int verticalIndex) {
    int topX = cellSize * horizontalIndex;
    int topY = cellSize * verticalIndex;
    int bottomX = cellSize * (horizontalIndex + 1);
    int bottomY = cellSize * (verticalIndex + 1);
    bottomX = bottomX >= bottomRight.getX() ? bottomRight.getX() : bottomX;
    bottomY = bottomY >= bottomRight.getY() ? bottomRight.getY() : bottomY;
    Point fromPoint = new Point(topX, topY);
    Point toPoint = new Point(bottomX - 1, bottomY - 1);
    GameCell cell = new GameCell(fromPoint, toPoint);
    cells[horizontalIndex][verticalIndex] = cell;
  }

  public int getFieldWidth() {
    return bottomRight.getX() - topLeft.getX();
  }

  public int getFieldHeight() {
    return bottomRight.getY() - topLeft.getY();
  }

  public Point getTopLeft() {
    return topLeft;
  }

  public Point getBottomRight() {
    return bottomRight;
  }

  @Override
  public String toString() {
    return String.format("GameField{%s => %s} (%d cells)", topLeft, bottomRight, cells.length * cells[0].length);
  }
}
