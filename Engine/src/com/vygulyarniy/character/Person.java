package com.vygulyarniy.character;

import com.vygulyarniy.beans.Point;

/**
 * Class description here.
 * @author Vadim Vygulyarniy. 30.12.13 15:28
 */
public interface Person {

  public String getName();

  public void setPosition(int x, int y);

  public void setPosition(Point point);

  public Point getPosition();

}
