package ro.ase.csie.acs.cts.recap.teste;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.fail;

@RunWith(Suite.class) //marchez suita
@Suite.SuiteClasses({TestStudent.class, TestStudentGetMedie.class})//marchez clasele =>suita totala
public class TestSuitaTotala {

}
