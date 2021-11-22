package lesson6;

public class MethodReturnType {
    public static void main(String[] args) {
        String fullUrl = buildPageURL(true, "sdetpro", "com");
        System.out.println(fullUrl.concat("main called"));
    }

    public static String buildPageURL(boolean isSSL, String domainName, String domain){
        String preFix ="http";
        if(isSSL){
            preFix="https";
        }
        String fullURL = preFix + "://" + domainName + "." + domain;
        return fullURL;
    }
}
