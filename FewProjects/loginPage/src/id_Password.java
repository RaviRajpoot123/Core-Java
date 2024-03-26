import java.util.HashMap;

public class id_Password {
    HashMap <String,String> login_Info = new HashMap<String,String>();
    id_Password(){
        login_Info.put("hello", "world");
        login_Info.put("rahul1", "001");
        login_Info.put("ravi2", "002");

    }
   protected HashMap getLoginInfo(){
        return login_Info;
    }
}
