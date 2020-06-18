package cts.patterns.miky.implementation;

import java.util.ArrayList;

//invoker
public class TaskManager {
    ArrayList<TaskAsincronAbstract> taskuri = new ArrayList<>();

    public void adaugaTask(TaskAsincron task) {
        taskuri.add(task);
    }

    public void executaTask() {
        if (this.taskuri.size() > 0) {
            TaskAsincronAbstract task = taskuri.get(0);
            taskuri.remove(0);
            task.executaTask(1000);
        }
    }
}
