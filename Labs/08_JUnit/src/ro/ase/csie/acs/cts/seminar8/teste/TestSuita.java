package ro.ase.csie.acs.cts.seminar8.teste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class) // test suite cu filtre pe categorii
@Suite.SuiteClasses({TestClient.class,Test2.class}) //filtrele sunt aplicate pe unit testele mentionate aici
@Categories.IncludeCategory ({CategorieImportante.class})   //aplicare filtru
public class TestSuita {
}
