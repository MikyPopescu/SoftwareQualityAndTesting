package ro.ase.csie.acs.cts.recap.teste;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.csie.acs.cts.recap.teste.categorii.CategorieTesteImportante;


@RunWith(Categories.class)
@Suite.SuiteClasses({TestStudent.class, TestStudentGetMedie.class})
// => suita partiala
@Categories.IncludeCategory({CategorieTesteImportante.class})
public class TestStudentImportantSuite {

}
