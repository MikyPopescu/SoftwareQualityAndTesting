package ro.ase.csie.acs.cts.seminar8.teste;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.csie.acs.cts.seminar8.Client;
import ro.ase.csie.acs.cts.seminar8.TipClient;
import ro.ase.csie.acs.cts.seminar8.exceptii.ExceptieTipClient;
import ro.ase.csie.acs.cts.seminar8.marketing.Promotie;
import ro.ase.csie.acs.cts.seminar8.marketing.PromotieAbstracta;
import ro.ase.csie.acs.cts.seminar8.stub.StubPromotie;

import static org.junit.Assert.*;

public class TestClient {

    //test fixture
    Client client;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        client = new Client();
    }

    @After
    public void tearDown() throws Exception {
    }

    //Right
    @Test
    public void testCalculeazaPretFinalRight() throws ExceptieTipClient {
        Promotie promotie = new Promotie();
        client.setPromo(promotie);

        TipClient testTipClient = TipClient.WOOD;
        float testPretInitial = 100;
        int testAniVechime = 0;

        float pretEstimat = testPretInitial;
        float pretCalculat = client.calculeazaPretFinal(testTipClient, testPretInitial, testAniVechime);

        assertEquals(pretEstimat, pretCalculat, 0);
    }


    //Test Right
    // Stub pentru Promotie - Nu exista Clasa Promotie
    @Test
    public void testCalculeazaPretFinalRightCuStubClasaAnonima() throws ExceptieTipClient {
//implementare locala, clase anonime - ineficient

        PromotieAbstracta promotie = new PromotieAbstracta() {
            @Override
            public float getDiscountFidelitate(int aniFidelitate) {
                return 0.05f;
            }

            @Override
            public float getPretCuDiscount(float pret, float discountFidelitate, float discount) {
                return 85.5f;
            }
        };

        client.setPromo(promotie);

        TipClient testTipClient = TipClient.BRONZE;
        float testPretInitial = 100;
        int testAniVechime = 5;

        float pretEstimat = 85.5f;
        float pretCalculat = client.calculeazaPretFinal(testTipClient, testPretInitial, testAniVechime);

        assertEquals(pretEstimat, pretCalculat, 0);
    }

    //Test Right
    // Stub pentru Promotie - Nu exista Clasa Promotie
    @Category({CategorieImportante.class})
    @Test
    public void testCalculeazaPretFinalRightCuClasaStub() throws ExceptieTipClient {
        StubPromotie promotie = new StubPromotie();
        promotie.setReturnGetDiscountFidelitate(0.05f);
        promotie.setReturnGetPretCuDiscount(85.5f);

        //daca se doreste ca metoda stub sa genereze o exceptie
        //  promotie.setGenereazaExceptie(true);

        client.setPromo(promotie);

        TipClient testTipClient = TipClient.BRONZE;
        float testPretInitial = 100;
        int testAniVechime = 5;

        float pretEstimat = 85.5f;
        float pretCalculat = client.calculeazaPretFinal(testTipClient, testPretInitial, testAniVechime);

        assertEquals(pretEstimat, pretCalculat, 0);
    }


}