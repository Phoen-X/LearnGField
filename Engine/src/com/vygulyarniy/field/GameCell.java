package com.vygulyarniy.field;

import java.util.ArrayList;
import java.util.List;

import com.vygulyarniy.beans.Point;
import com.vygulyarniy.character.Person;

/**
 * Class description here.
 * @author Vadim Vygulyarniy. 30.12.13 15:38
 */
public class GameCell {

  private List<Person> persons = new ArrayList<>(100);
  private Point topLeft;
  private Point bottomRight;

  public GameCell(final Point topLeft, final Point bottomRight) {
    this.topLeft = topLeft;
    this.bottomRight = bottomRight;
  }

  public GameCell(final int topX, final int topY, final int bottomX, final int bottomY) {
    this(new Point(topX, topY), new Point(bottomX, bottomY));
  }

  public List<Person> getPersons() {
    return persons;
  }

  public void setPersons(final List<Person> persons) {
    this.persons = persons;
  }

  public void addPerson(final Person person) {
    this.persons.add(person);
  }

  @Override
  public String toString() {
    return String.format("GameCell{%s => %s}", topLeft, bottomRight);
  }
}
