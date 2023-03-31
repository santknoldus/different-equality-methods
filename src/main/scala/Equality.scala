package com.knoldus.euqality

class Equality {

  //this will compare actual values, return true if equal else false
  def usingEquals[T](firstOperand: T, secondOperand: T): Boolean = {
    firstOperand.equals(secondOperand)
  }

  //this will check referential equality, return true  if equal else false
  def usingEq[T <: AnyRef](firstOperand: T, secondOperand: T): Boolean = {
    firstOperand eq secondOperand
  }

  //this will compare actual values, return true if equal else false
  def equalComparisonOperator[T](firstOperand: T, secondOperand: T): Boolean = {
    firstOperand == secondOperand
  }

  //this will compare actual values, return true if not equal else false
  def unequalComparisonOperator[T](firstIOperand: T, secondOperand: T): Boolean = {
    firstIOperand != secondOperand
  }

  //this will check referential equality, if not equal return true else false
  def usingNe[T <: AnyRef](firstOperand: T, secondOperand: T): Boolean = {
    firstOperand ne secondOperand
  }
}