package com.knoldus.euqality

object EqualityApp extends App {

  private val equality = new Equality

  private val name1 = "Sant"
  private val name2 = "Tushar"

  private val num1 = 45
  private val num2 = 67

  private val list1 = List(1, 2, 3)
  private val list2 = List(1, 2, 3)

  println(equality.usingEquals(name1, name2)) //using  equals method
  println(equality.usingEq(list1, list2)) //using eq function
  println(equality.usingNe(name1, name2)) //using ne function
  println(equality.unequalComparisonOperator(num1, num2)) //using == comparison operator
  println(equality.equalComparisonOperator(list1, list2)) //using != comparison operator
}