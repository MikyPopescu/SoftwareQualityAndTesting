package ro.ase.csie.acs.cts.seminar14.command;

public abstract class TaskAsincronAbstract {

    String denumnireTask;

    public TaskAsincronAbstract(String denumnireTask) {
        super();
        this.denumnireTask = denumnireTask;
    }

    public abstract void executaTask(int prioritate);
}
