package cts.patterns.miky.implementation;

public abstract class TaskAsincronAbstract {
    String denumireTask;

    public TaskAsincronAbstract(String denumireTask) {
        this.denumireTask = denumireTask;
    }

    public abstract void executaTask(int prioritate);
}
