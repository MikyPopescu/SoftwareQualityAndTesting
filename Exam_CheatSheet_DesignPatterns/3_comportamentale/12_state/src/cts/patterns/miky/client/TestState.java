package cts.patterns.miky.client;

import cts.patterns.miky.implementation.CaracterJoc;

public class TestState {
    public static void main(String[] args) {
        CaracterJoc miky = new CaracterJoc("miky",1000);

        miky.merge();
        miky.ataca("csie",100);


        miky.esteLovit(200);
        miky.merge();
        miky.ataca("csie",100);

        miky.esteLovit(400);
        miky.merge();
        miky.ataca("csie",100);

        miky.esteLovit(360);
        miky.merge();
        miky.ataca("csie",100);
    }
}
