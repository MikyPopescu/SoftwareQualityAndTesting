package cts.patterns.miky.implementation;

import java.util.ArrayList;

//observabil
public class ModulMonitorizareConexiune {
    ArrayList<InterfataConexiuneListener> observatori = new ArrayList<>();

    //metode specifice observabil
    public void registerObservator(InterfataConexiuneListener listener){
        this.observatori.add(listener);
    }

    public void unregisterObservator(InterfataConexiuneListener listener){
        this.observatori.remove(listener);
    }

    //metoda care notifica observatorul
    public void notificareConexiunePierduta(){
        for (InterfataConexiuneListener observator:this.observatori){
            observator.conexiunePierduta(System.currentTimeMillis()+"");
        }
    }

    public void notificareConexiuneActiva(){
        for (InterfataConexiuneListener observator:this.observatori){
            observator.conexiuneActiva();
        }
    }
}
