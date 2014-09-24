package com.shippable

import org.scalatest.junit.JUnitSuite
import junit.framework.Assert._
import org.junit.Test

class TestStuff extends JUnitSuite {
 val calc = new HelloWorld

 @ Test def oneIsOne {
    assertEquals(1, calc square 1)
  }

  @ Test def twoIsTwo {
    assertEquals(7, calc multiple (2,3))
  }
}
