package fr.olivier.test1;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(UnitTest.class)
@Suite.SuiteClasses({AllJunitTest.class})
public class UnitTestSuite {

}
