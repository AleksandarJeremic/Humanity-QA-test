package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import automation.JUnitTestOne;
import automation.JUnitTestTwo;

@RunWith(Suite.class)
@SuiteClasses({ JUnitTestOne.class, JUnitTestTwo.class })
public class AllJUnitTests {}
