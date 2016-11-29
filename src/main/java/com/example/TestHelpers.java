package com.example;

import org.junit.Assert;

public class TestHelpers {
  public static void useJunit412() {
    // This was added in 4.12.
    Assert.assertArrayEquals(new boolean[] {true}, new boolean[] {true});
  }
}
