package Chapter15.xmlsomething;

//import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

public class Accounts {

//    @XmlElement(name="account")
    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }

}
