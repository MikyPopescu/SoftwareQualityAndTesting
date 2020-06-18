package cts.popescu.mihaela.g1082.teste.suita;

import cts.popescu.mihaela.g1082.teste.TestCalculValoareTVA;
import cts.popescu.mihaela.g1082.teste.TestSetPret;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestCalculValoareTVA.class, TestSetPret.class})
@Categories.IncludeCategory({Categorie.class})
public interface Categorie {
}
