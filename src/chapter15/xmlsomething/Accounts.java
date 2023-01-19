package Chapter15.xmlsomething;

import java.util.List;
//import javax.xml.bind.annotation.XmlElement;

public class Accounts {

//    @XmlElement(name="account")
    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

}
