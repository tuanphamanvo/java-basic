package lesson6;

import java.util.Locale;
import java.util.Scanner;

public class HomeWorkDay6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SSL_TYPE isSSL = inputSSLType();
        String domainName = inputDomainName();
        DOMAIN_TYPE domainType = inputDomainType();
        String fullDomainName = buildDomainName(isSSL, domainName, domainType);
        System.out.println("Your Website URL is: "+fullDomainName);

    }

    private static DOMAIN_TYPE inputDomainType() {
        Scanner scanner = new Scanner(System.in);
        boolean validDomainType = false;
        DOMAIN_TYPE domainType = null;
        while (!validDomainType){
            System.out.println("Enter your Domain Type (Ex: http://www.Google.com has domain type is 'COM'");
            String input = scanner.nextLine().toUpperCase();
            domainType.values();
            for (DOMAIN_TYPE type : DOMAIN_TYPE.values()){
                if (type.toString().equals(input.toUpperCase())){
                    domainType = type;
                    validDomainType = true;
                    break;
                }
            }
            System.out.println("Please enter supported domain type!!!");
        }
        return domainType;
    }

    private static String inputDomainName() {
        Scanner scanner = new Scanner(System.in);
        boolean validDomainName = false;
        String domainName = null;
        while (!validDomainName){
            System.out.println("Enter your Website name (Ex: http://www.Google.com has name is 'Google'");
            String input = scanner.nextLine();
            if(input.matches("[a-zA-Z0-9]*")){
                domainName = input;
                validDomainName = true;
                break;
            } else System.out.println("Domain name only contains numbers and letters");
        }
        return domainName;
    }

    private static SSL_TYPE inputSSLType() {
        Scanner scanner = new Scanner(System.in);
        boolean validSSL = false;
        SSL_TYPE isSSL = null;
        while(!validSSL) {
            System.out.println("Your website will use SSL? (Y/N)");
            String input = scanner.nextLine();
            if(input.equals("Y")||input.equals("y")){
                isSSL = SSL_TYPE.TRUE;
                validSSL = true;
                break;
            }
            if(input.equals("n")||input.equals("N")){
                isSSL = SSL_TYPE.TRUE;
                validSSL=true;
                break;
            } else System.out.println("Incorrect answer!!");
        }
        return isSSL;
    }

    private static String buildDomainName(SSL_TYPE sslType, String domainName, DOMAIN_TYPE domainType){
        String protocol;
        switch (sslType){
            case TRUE:
                protocol="https";
                break;
            case FALSE:
                protocol="http";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + sslType);
        }
        String domainSpec = domainType.toString();
        String fullDomainName = protocol.concat("://www.").concat(domainName).concat(".").concat(domainSpec.toLowerCase());
        return fullDomainName;
    }
}
