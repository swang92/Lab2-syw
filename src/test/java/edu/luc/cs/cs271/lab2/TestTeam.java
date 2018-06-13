package edu.luc.cs.cs271.lab2;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestTeam {

  Team makeTeamFixture(final String name, final String headcoach, final int funding) {
    return new Team(name, headcoach, funding);
  }

  @Test
  public void testConstructorValidName() {
    try {
      new Team(null, "Klinsmann", 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
      // if we landed here, we're good!
    }
  }

  @Test
  public void testConstructorValidHeadcoach() {
    try {
      new Team("USA", null, 500);
      fail("should have thrown IllegalArgumentException");
    } catch (final Throwable ex) {
    }
  }

  @Test
  public void testConstructorValidFunding() {
    try {
      new Team("USA", "Klinsman", 0);
      fail("should have thrown IllegalArgumentsException");
    } catch (final Throwable ex) {
    }
  }

  @Test
  public void testGetName() {
    final String name = "USA";
    final Team t = makeTeamFixture(name, "Klinsmann", 500);
    assertEquals(name, t.getName());
  }

  @Test
  public void testGetCoach(){
    final String name = "Klinsman";
    final Team t = makeTeamFixture("USA", name, 500);
    assertEquals(name, t.getHeadcoach());
  }

  @Test
  public void testGetFunding(){
    final int funding = 500;
    final Team t = makeTeamFixture("USA", "Klinsman",funding);
    assertEquals(funding, t.getFunding());
  }
  
}