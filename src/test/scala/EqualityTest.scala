package com.knoldus.euqality

import org.scalatest.funsuite.AnyFunSuite

class EqualityTest extends AnyFunSuite {

  private val equality = new Equality

  test("usingEquals should return true for equal values") {
    assert(equality.usingEquals(3, 3) == true)
  }

  test("usingEquals should return false for unequal values") {
    assert(equality.usingEquals("hello", "world") == false)
  }

  test("usingEq should return true for referentially equal objects") {
    val str = "hello"
    assert(equality.usingEq(str, str) == true)
  }

  test("usingEq should return false for non-referentially equal objects") {
    assert(equality.usingEq("hello", "world") == false)
  }

  test("equalComparisonOperator should return true for equal values") {
    assert(equality.equalComparisonOperator(3, 3) == true)
  }

  test("equalComparisonOperator should return false for unequal values") {
    assert(equality.equalComparisonOperator("hello", "world") == false)
  }

  test("unequalComparisonOperator should return true for unequal values") {
    assert(equality.unequalComparisonOperator(3, 4) == true)
  }

  test("unequalComparisonOperator should return false for equal values") {
    assert(equality.unequalComparisonOperator("hello", "hello") == false)
  }

  test("usingNe should return true for non-referentially equal objects") {
    assert(equality.usingNe("hello", "world") == true)
  }

  test("usingNe should return false for referentially equal objects") {
    val str = "hello"
    assert(equality.usingNe(str, str) == false)
  }
}