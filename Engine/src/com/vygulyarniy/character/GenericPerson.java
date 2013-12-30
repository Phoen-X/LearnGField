package com.vygulyarniy.character;

import com.vygulyarniy.beans.Point;

/**
 * General implementation of person interface.
 * Contains common getters/setters and so on.
 * @author Vadim Vygulyarniy. 30.12.13 15:31
 */
public class GenericPerson implements Person {
  protected String name;
  protected Point position;

  public GenericPerson(final String name, final Point position) {
    this.name = name;
    this.position = position;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setPosition(final int x, final int y) {
    setPosition(new Point(x, y));
  }

  @Override
  public Point getPosition() {
    return position;
  }

  @Override
  public void setPosition(final Point position) {
    this.position = position;
  }
}
