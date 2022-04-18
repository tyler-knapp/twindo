import com.twindo.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    
    @Test
    public void addMoneyToAccountIncreasesAccountBalance(){
        Account account = new Account();
        account.addMoneyToAccount(50);
    
        Assert.assertEquals(50, account.getBalance(), 0);
    }
    
}
