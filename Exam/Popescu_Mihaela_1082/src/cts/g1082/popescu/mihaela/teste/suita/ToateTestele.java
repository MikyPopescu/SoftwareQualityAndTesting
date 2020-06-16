package cts.g1082.popescu.mihaela.teste.suita;

import cts.g1082.popescu.mihaela.teste.TestCalculTotalPuncteTestGrila;
import cts.g1082.popescu.mihaela.teste.TestSetDificultateTestGrila;
import cts.g1082.popescu.mihaela.teste.TestSetPunctajMaximTestGrila;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestCalculTotalPuncteTestGrila.class, TestSetDificultateTestGrila.class, TestSetPunctajMaximTestGrila.class})
@Categories.IncludeCategory({TestSuiteCategory.class})
public class ToateTestele {
}
