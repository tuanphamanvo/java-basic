package lesson6;

public class DomainBuilder {
    public static String buildURL(String domainName, SSL_TYPE sslType, DOMAIN_TYPE domainType){
        String urlPrefix ="";
        String domainSpec ="";
        String fullURL="";
        switch (sslType){
            case TRUE:
                urlPrefix = "https";
                break;
            case FALSE:
                urlPrefix = "http";
                break;
            default:
                System.out.println("Wrong option");
        }
        switch (domainType){
            case COM:
                domainSpec = "com";
                break;
            case NET:
                domainSpec="net";
                break;
            case VIP:
                domainSpec="vip";
                break;
            case IO:
                domainSpec= "io";
                break;
            default:
                System.out.println("Not supported domain spec");
        }
        return (urlPrefix.concat("://").concat(domainName).concat(".").concat(domainSpec));
    }

    public static void main(String[] args) {
        String finalString = buildURL("sdet", SSL_TYPE.TRUE, DOMAIN_TYPE.COM);
        System.out.println(finalString);
    }
}
