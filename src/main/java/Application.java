
import com.ibm.watson.developer_cloud.language_translator.v2.LanguageTranslator;
import com.ibm.watson.developer_cloud.language_translator.v2.model.IdentifiableLanguage;

import java.util.List;

public class Application {

    public static void main(String[] args){
        String username=  "username";
        String password = "password";
        LanguageTranslator service = new LanguageTranslator();
        service.setUsernameAndPassword(username,password);
        List<IdentifiableLanguage> identifieableLanguages;
        identifieableLanguages = service.getIdentifiableLanguages().execute();
        System.out.println(identifieableLanguages.toString());
    }
}
