package objectData;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;

import java.util.HashMap;
import java.util.Objects;

public class LoginObject {
    private String email;
    private String password;
    private String errormsg;

    public LoginObject(HashMap<String, String> testData) {
        prepareData(testData);
    }

    public void prepareData(HashMap<String, String> testData){
        for(String Key : testData.keySet()){
            switch (Key){
                case "email":
                    setEmail(testData.get(Key));
                    break;
                case "password":
                    setPassword(testData.get(Key));
                    break;
                case"errormsg":
                    setErrormsg(testData.get(Key));
                    break;
            }
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
}
