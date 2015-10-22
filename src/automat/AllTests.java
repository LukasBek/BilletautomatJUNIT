package automat;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TjekAfBilletsalg.class, TjekAfIndtjening.class, TjekAfMontørkoder.class, TjekAfNegativeBeloeb.class })
public class AllTests {

}
