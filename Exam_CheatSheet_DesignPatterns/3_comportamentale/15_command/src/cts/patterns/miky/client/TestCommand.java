package cts.patterns.miky.client;

import cts.patterns.miky.implementation.ModulBackupDate;
import cts.patterns.miky.implementation.TaskAsincron;
import cts.patterns.miky.implementation.TaskManager;

public class TestCommand {
    public static void main(String[] args) {
        System.out.println("ruleaza...");
        TaskManager manager = new TaskManager();
        System.out.println("Lansare autosave");
        manager.adaugaTask(new TaskAsincron("backup",1000,new ModulBackupDate()));
        System.out.println("ruleaza...");
        System.out.println("Lansare update forum");
        manager.adaugaTask(new TaskAsincron("update forum",1000,new ModulBackupDate()));
        System.out.println("ruleaza...");
        manager.executaTask();
        System.out.println("ruleaza...");
        manager.executaTask();
    }
}
