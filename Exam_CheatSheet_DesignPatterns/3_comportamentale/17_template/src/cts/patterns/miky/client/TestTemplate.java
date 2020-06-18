package cts.patterns.miky.client;

import cts.patterns.miky.implementation.Bancomat;

public class TestTemplate {
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat("387293456172");
        bancomat.retragereBani("4678", 350);
    }
}
