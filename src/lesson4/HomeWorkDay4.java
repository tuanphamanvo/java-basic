package lesson4;

import java.util.Objects;

public class HomeWorkDay4 {
    public static void main(String[] args) {
        /*Exercise 01
        Given input string: "2hrs and 5 minutes"
        Please calculate how many minutes in total
        */

//        String time = "2hrs and 5 minutes";
//        String [] tempString = time.split("hrs and | hr and");
//        int hour = Integer.parseInt(tempString[0]);
//        String [] tempMinute = tempString[1].split("minutes | minute");
//        int minute = Integer.parseInt(tempMinute[0]);
//        int hourInMinute = hour*60;
//        System.out.println("There are "+ (minute + hourInMinute) + " minutes");

        /*Exercise 02
        String myPassword = "password123";
        Allow user to input maximum 3 times
        */

//        String myPassword = "password123";
//        String inputPassword = "";
//        Scanner scanner = new Scanner(System.in);
//        int attempt = 0;
//        while (!inputPassword.equals(myPassword)){
//            if (attempt==3){
//                System.out.println("You exceeded max try time, goodbye!!");
//                break;
//            }
//            System.out.println("Input your password:");
//            inputPassword = scanner.nextLine();
//            attempt++;
//            if (inputPassword.equals(myPassword)){
//                System.out.println("Correct password, Welcome to the system!!");
//                break;
//            } else System.out.println("You input incorrect password!!");
//        }


        /*Exercise 03
        String myStr = "100 minutes";
        NOT using REGEX, extract digit character from that String
        Expected output: "100".
        EX: "12345n678" -> "12345678"
        */

        String myStr = "12345n678";
        char[] toChar = myStr.toCharArray();
        for (char c : toChar) {
            switch (String.valueOf(c)) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                case "0":
                    break;
                default:
                    myStr = myStr.replace(String.valueOf(c), "");
            }
        }
        System.out.println("Output String is: " +myStr);

        /*Exercise 04
        String url = "https://google.com.vn";
        Check http OR https; domain name, .com OR .net
        */

        String fullUrl = "http://google.net";
        String[] splitUrlParts = fullUrl.split("://");
        String protocol = splitUrlParts[0];
        if(protocol.equals("http")){
            System.out.println("Your website is not secured by a SSL certificate");
        } else {
            System.out.println("Your website is secured with SSL!!");
        }

        if(fullUrl.indexOf(".com") == (fullUrl.length()-4))
        {
            System.out.println("Your domain name is in .COM");
        }
        if(fullUrl.indexOf(".net") == (fullUrl.length()-4))
        {
            System.out.println("Your domain name is in .NET");
        }

    }
}

