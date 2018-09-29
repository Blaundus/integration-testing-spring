package atd.spring.testing.rules;

import atd.spring.testing.bills.LineItem;

public class GratisOnStarRule implements LineItemRule {

  @Override
  public float getFactor(LineItem t) {
    if (t.getDescription()!=null && t.getDescription().startsWith("*")) {
      return 0;
    } else {
      return 1;
    }
  }

}