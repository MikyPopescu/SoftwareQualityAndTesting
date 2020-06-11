package ro.ase.csie.acs.cts.seminar13.observer;

import java.util.ArrayList;

public class ModulStareConexiune {
    ArrayList<NotificareConexiune> event = new ArrayList<>();

    public void addListener(NotificareConexiune listener) {
        event.add(listener);
    }

    public void removeListener(NotificareConexiune listener) {
        event.remove(listener);
    }

    public void notificareConexiunePierduta() {
        for(NotificareConexiune observator : event)
            observator.conexiuneInchisa();
    }
}
