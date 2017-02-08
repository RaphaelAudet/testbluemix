
//import com.ibm.watson.developer_cloud.language_translation.*;
import com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation;
import com.ibm.watson.developer_cloud.language_translation.v2.model.IdentifiableLanguage;

import java.util.List;

public class Application {

    public static void main(String[] args){
        String username=  "myusername";
        String password = "mypassword";
        com.ibm.watson.developer_cloud.language_translation.v2.LanguageTranslation service = new LanguageTranslation();
//        LanguageTranslator service = new LanguageTranslator();
        service.setUsernameAndPassword(username,password);
        List<IdentifiableLanguage> identifieableLanguages;
        identifieableLanguages = service.getIdentifiableLanguages().execute();
        System.out.println(identifieableLanguages.toString());
    }
}
