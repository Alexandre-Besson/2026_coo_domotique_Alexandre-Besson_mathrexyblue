public class TelecomandeTest{
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {

    public void testAjouterLampe_TelecommandeVide() {
        Telecommande tele = new Telecommande();
        Lampe lampe1 = new Lampe("Lampe1");
        tele.ajouterLampe(lampe1);
        assertEquals(1, tele.nbLampes());
        assertEquals("Lampe1: Off", tele.getLampe(0).toString());
    }

    public void testAjouterLampeALaTelecommande() {
        Telecommande tele = new Telecommande();
        Lampe lampe1 = new Lampe("Lampe1");
        Lampe lampe2 = new Lampe("Lampe2");
        tele.ajouterLampe(lampe1);
        tele.ajouterLampe(lampe2);
        assertEquals(2, tele.nbLampes());
        assertEquals("Lampe2: Off", tele.getLampe(1).toString());
    }

    public void testActiverLampe_Position0() {
        Telecommande tele = new Telecommande();
        Lampe lampe1 = new Lampe("Lampe1");
        tele.ajouterLampe(lampe1);
        tele.activerLampe(0);
        assertTrue(tele.getLampe(0).isAllume());
    }

    public void testActiverLampe_Position1() {
        Telecommande tele = new Telecommande();
        Lampe lampe1 = new Lampe("Lampe1");
        Lampe lampe2 = new Lampe("Lampe2");
        tele.ajouterLampe(lampe1);
        tele.ajouterLampe(lampe2);
        tele.activerLampe(1);
        assertFalse(tele.getLampe(0).isAllume());
        assertTrue(tele.getLampe(1).isAllume());
    }

    public void testActiverLampe_Inexistante() {
        Telecommande tele = new Telecommande();
        tele.activerLampe(0);
        assertEquals(0, tele.nbLampes());
    }
}



}