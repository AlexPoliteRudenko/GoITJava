package core.module09.practice;

import java.util.HashMap;
import java.util.Map;

public class UserPersonApp {
    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";
    public static final String EMAIL = "email";

    public static void main(String[] args) {
        //create data
        Map<String,String> requestParams = new HashMap<>();
        requestParams.put(FIRST_NAME,"Pavlo");
        requestParams.put(LAST_NAME,"Pot");
        requestParams.put(EMAIL,"111@gmail.com");
        Map<String,String> requestParams2 = new HashMap<>();
        requestParams.put(FIRST_NAME,"Alex");
        requestParams.put(LAST_NAME,"Rudenko");
        requestParams.put(EMAIL,"222@gmail.com");


        //execute code
        PersonController controller = new PersonController();
//        PersonController.save(requestParams);
//        PersonController.save(requestParams2);

        String name = controller.findByEmail(requestParams);
        //result

        System.out.println("Result is " + name.equals("Pavlo"));
    }
}
