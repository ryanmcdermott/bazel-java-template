package com.example.template;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringRepeaterTest {

  @Test
  public void testRepeat() throws Exception {
    StringRepeater stringRepeater = new StringRepeater();
    assertEquals(
        "should return 'foobarfoobarfoobar' when ('foobar', 3) are passed as args",
        "foobarfoobarfoobar",
        stringRepeater.repeat("foobar", 3)
    );
  }

}