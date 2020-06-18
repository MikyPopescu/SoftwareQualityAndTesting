package cts.testing.miky.teste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestSetVarstaStudent.class,TestGetMedie2ZecimaleStudent.class})
@Categories.IncludeCategory({Categorie.class})
public class Suita {
}
