package ro.ase.csie.cts.varianta1.unittesting.suita;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.csie.cts.varianta1.unittesting.teste.TestCalculValoareTVA;
import ro.ase.csie.cts.varianta1.unittesting.teste.TestSetPret;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestSetPret.class, TestCalculValoareTVA.class})
@Categories.IncludeCategory({ICategorieSuitaCustom.class})
public class SuitaCustom {
}
