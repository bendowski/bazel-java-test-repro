package com.example;

import java.net.URL;
import org.junit.Assert;
import org.junit.Test;

public class UseJunit412 {
  @Test
  public void junit412Features() {
    // This crashes when ran with the :test task.
    TestHelpers.useJunit412();
  }

  @Test
  public void classPath() throws Exception {
    URL classFile =
        Assert.class
            .getClassLoader()
            .getResource(Assert.class.getName().replace('.', '/') + ".class");
    Assert.assertFalse(
        "JUnit classes read from " + classFile.toString(),
        classFile.toString().contains("TestRunner_deploy.jar"));
  }
}
