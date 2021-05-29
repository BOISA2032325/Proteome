package TestLab;
import org.junit.Assert;
import org.junit.Test;

public class TestNomCourtEtAcideAmine {
    @Test
    public void validationAcideAmine() {
        String chaine1 = "AEEGH";
        Assert.assertTrue(chaine1,true);
        String chaine2 = "ZEEXHXZ";
        Assert.assertFalse(chaine2,false);
        String chaine3 = "DHGUOAAAAAAAAAAA";
        Assert.assertTrue(chaine3,true);
    }
}



