import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put("Bro", "Pizza");
        logininfo.put("Keno", "PASSWORD");
        logininfo.put("Scot", "ABC123");

    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
