package edu.luc.cs.cs271.lab2;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TestSearch {
  
    Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

    ArrayList<Team> makeListFixture () {
      int i=0;
    final ArrayList<Team> list = new ArrayList<>();
//    for each Team add a new Team object to my list
      while (i<10) {
        final String s = Integer.toString(i);
        list.add(new Team("Team " + s, "Coach " + s, i * 100 + 50));
        i++;
      }
    return list;
  }

//  MakeFundingFixture
  Team[] makeFundingFixture(final int size) {
  final Team[] array = new Team[size];
  for (int i = 0; i < size; i++) {
    final String s = Integer.toString(i);
    array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
  }
  return array;
}


  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  

  @Test
  public void testFindPositionList0() {
    final ArrayList<Team> list = makeListFixture();
    assertTrue(Search.findTeamPosition(list,"Team 0").isPresent());
  }

  @Test
  public void testFindPositionList10s() {
    final ArrayList<Team> list = makeListFixture();
    assertTrue(Search.findTeamPosition(list, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionList10f() {
    final ArrayList<Team> list = makeListFixture();
    assertFalse(Search.findTeamPosition(list, "Team 11").isPresent());
  }


  @Test
  public void testFindMinFundingArray0()  {
    final Team[] arr = makeFundingFixture(0);
    assertFalse(Search.findTeamMinFunding(arr, 50).isPresent());
  }

  @Test
  public void testFindMinFundingArray3()  {
    final Team[] arr = makeFundingFixture(3);
    assertTrue(Search.findTeamMinFunding(arr, 100).isPresent());
  }

  @Test
  public void testFindMinFundingArrayNotPresent()  {
    final Team[] arr = makeFundingFixture(3);
    assertFalse(Search.findTeamMinFunding(arr, 1000).isPresent());
  }


  @Test
  public void testFindMinFundingArrayFast3()  {
    final Team[] arr = makeFundingFixture(3);
    assertTrue(Search.findTeamMinFundingFast(arr, 50).isPresent());
  }

  @Test
  public void testFindMinFundingArrayFastNotFound()  {
    final Team[] arr = makeFundingFixture(3);
    assertFalse(Search.findTeamMinFundingFast(arr, 10000).isPresent());
  }

  @Test
  public void testFindMinFundingArrayFast0()  {
    final Team[] arr = makeFundingFixture(0);
    assertFalse(Search.findTeamMinFundingFast(arr, 50).isPresent());
  }

}
