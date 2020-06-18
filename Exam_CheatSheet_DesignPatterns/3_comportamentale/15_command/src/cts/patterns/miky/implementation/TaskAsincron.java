package cts.patterns.miky.implementation;

//comandaconcreta
public class TaskAsincron extends TaskAsincronAbstract {
    //stare specifica
    float timeout;

    //executant
    InterfataModuleJoc modul;

    public TaskAsincron(String denumireTask, float timeout, InterfataModuleJoc modulExecutant) {
        super(denumireTask);
        this.timeout = timeout;
        this.modul = modulExecutant;
    }

    @Override
    public void executaTask(int prioritate) {
        //cand se poate executa
        this.modul.executaActiune();

    }
}
