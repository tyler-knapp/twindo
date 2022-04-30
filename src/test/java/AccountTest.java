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
    
    @Test
    public void accountBalanceDoesNotGoOverMaximumBalanceAmount(){
        Account account = new Account();
        account.addMoneyToAccount(5001);
        
        Assert.assertEquals(0, account.getBalance(), 0);
    }
    
    @Test
    public void cannotAddNegativeDollarsToAccount(){
        Account account = new Account();
        account.addMoneyToAccount(-50);
        
        Assert.assertEquals(0, account.getBalance(), 0);
    }
    
}
