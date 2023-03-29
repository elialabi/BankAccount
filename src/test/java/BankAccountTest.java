import org.example.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
public class BankAccountTest {

    //        Testing the getters and setters
   private BankAccount bankAccount;
    @BeforeEach
    public void setup(){ bankAccount = new BankAccount;}
    @Test
    public void correctFullgName() {
        BankAccount bankAccount = new BankAccount();
        String expected = bankAccount.fullNameAccount();
        String actual = "This is ElizabethAlabi";
        assertThat(actual).isEqualTo(expected);

        }


    }


//Cannot run test