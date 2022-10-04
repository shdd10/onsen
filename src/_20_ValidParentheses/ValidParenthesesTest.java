package _20_ValidParentheses;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

  @Test
  public void test() {
    ValidParentheses vp = new ValidParentheses();
    String s1 = "()[]{}";
    Assert.assertTrue(vp.isValid(s1));
    String s2 = "()[]{";
    Assert.assertFalse(vp.isValid(s2));
    String s3 = "()[]}";
    Assert.assertFalse(vp.isValid(s3));
  }

}
