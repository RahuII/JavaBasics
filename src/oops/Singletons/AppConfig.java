package oops.Singletons;

public class AppConfig {
    AppConfig(){

    }
    private static  AppConfig obj = null;
    public static AppConfig getInstance() {
        if (obj == null){
            obj = new AppConfig();
        }
        return obj;
    }
}
