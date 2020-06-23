package cts.g1082.popescu.mihaela.teste.suita;

import cts.g1082.popescu.mihaela.teste.TestMetodaGetNumarLocuriOcupate;
import cts.g1082.popescu.mihaela.teste.TestMetodaGetPretBilet;
import cts.g1082.popescu.mihaela.teste.TestMetodaSetGreutate;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({TestMetodaGetNumarLocuriOcupate.class, TestMetodaSetGreutate.class, TestMetodaGetPretBilet.class})
@Categories.IncludeCategory({ICategorie.class})
public class Suita {
}
