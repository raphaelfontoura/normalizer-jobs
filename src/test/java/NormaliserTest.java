import core.Normaliser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class NormaliserTest {

    @Test
    public void shouldReturnSoftwareEngineer_whenInputIsJavaEngineer() {
        //arrange
        String jt = "Java engineer";
        Normaliser n = new Normaliser();

        //act
        String normalizedTitle = n.normalise(jt);

        //assert
        Assertions.assertEquals("Software engineer", normalizedTitle);
    }

    @Test
    public void shouldReturnSoftwareEngineer_whenInputIsCSharpEngineer() {
        //arrange
        String jt = "C# engineer";
        Normaliser n = new Normaliser();

        //act
        String normalizedTitle = n.normalise(jt);

        //assert
        Assertions.assertEquals("Software engineer", normalizedTitle);
    }

    @Test
    public void shouldReturnAccountant_whenInputIsAccountant() {
        //arrange
        String jt = "Accountant";
        Normaliser n = new Normaliser();

        //act
        String normalizedTitle = n.normalise(jt);

        //assert
        Assertions.assertEquals("Accountant", normalizedTitle);
    }

    @Test
    public void shouldReturnAccountant_whenInputIsChiefAccountant() {
        //arrange
        String jt = "Chief Accountant";
        Normaliser n = new Normaliser();

        //act
        String normalizedTitle = n.normalise(jt);

        //assert
        Assertions.assertEquals("Accountant", normalizedTitle);
    }

    @Test
    public void shouldReturnSoftwareEngineer_whenInputHasMistypeEngineer() {
        //arrange
        String jt = "Java enginerr";
        String ct = "CSharp eengineer";
        String pt = "python nengeieerr";
        Normaliser n = new Normaliser();

        //act
        String normalizedJt = n.normalise(jt);
        String normalizedCt = n.normalise(ct);
        String normalizedPt = n.normalise(pt);

        //assert
        Assertions.assertEquals("Software engineer", normalizedJt);
        Assertions.assertEquals("Software engineer", normalizedCt);
        Assertions.assertEquals("Software engineer", normalizedPt);

    }

    @Test
    public void shouldReturnAccountant_whenInputMistypeAccountant() {
        //arrange
        String cacc = "Chief Acountant";
        String acc = "Accuontatn";
        Normaliser n = new Normaliser();

        //act
        String normalizedCacc = n.normalise(cacc);
        String normalizedAcc = n.normalise(acc);

        //assert
        Assertions.assertEquals("Accountant", normalizedCacc);
        Assertions.assertEquals("Accountant", normalizedAcc);
    }

    @Test
    public void shouldReturnNotFound_whenInputHasNoSimilar() {
        String unknowJob = "Master chef";
        Normaliser n = new Normaliser();

        String result = n.normalise(unknowJob);

        Assertions.assertEquals("Not found", result);
    }
}
