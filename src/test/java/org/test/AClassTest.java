package org.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AClassTest {

  @Test
  void aFailingTest() {
    Assertions.fail("This is a failing test");
  }
}
