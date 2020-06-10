package ro.ase.csie.acs.cts.recap.teste.stub;

import ro.ase.csie.acs.cts.recap.clase.Student;
import ro.ase.csie.acs.cts.recap.interfete.InterfataBazaDeDate;

public class StubInterfataBazaDeDate implements InterfataBazaDeDate {
    private boolean returnInsertStudent = false;

    public void setRaspunsAsteptatInsertStud(boolean raspuns) {
        this.returnInsertStudent = raspuns;
    }

    @Override
    public boolean insertStud(Student student) {
        return returnInsertStudent;
    }
}
