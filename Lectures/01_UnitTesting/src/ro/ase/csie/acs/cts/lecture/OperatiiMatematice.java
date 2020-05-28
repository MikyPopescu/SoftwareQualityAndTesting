package ro.ase.csie.acs.cts.lecture;

public class OperatiiMatematice {

    public static float calculMedie(int[] valori) {
        if (valori.length == 0) {
            return 0;
        } else {
            float suma = 0;
            for (int valoare : valori) {
                suma += valoare;
            }
            return suma / valori.length;

        }
    }
 }
