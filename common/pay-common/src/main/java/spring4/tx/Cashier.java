package spring4.tx;

import java.util.List;

public interface Cashier {

    void checkout(String username, List<String> isbns);

}
