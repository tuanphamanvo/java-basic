package lesson4;

public class StringLearning {
    public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        System.out.println(s1==s2);
        String s3 = new String("Cat");
        System.out.println(s3==s2);

        String myPassword = "123Password";
        char[] myCharacters = myPassword.toCharArray();
        int totalDigits = 0;
        int totalLowerCases = 0;
        int totalUpperCases = 0;
        for(char character : myCharacters) {
            if(Character.isDigit(character))
                totalDigits++;
            if (Character.isUpperCase(character))
                totalUpperCases++;
            if(Character.isLowerCase(character))
                totalLowerCases++;
        }

        if(totalDigits==0||totalLowerCases==0||totalUpperCases==0){
            System.out.println("Password is NOT as requirement");
        } else {
            System.out.println("Password meet requirement");
        }


        //Replacement
        String badWordsContainer = " phuc, puxy, chipu";
        String filteredString = badWordsContainer.replace("phuc", "***");
        System.out.println(filteredString.trim());
        ///Study more about trim

        //Sub-string, index, split
        String myUrl = "https://sdetpro.com";

        String [] myUrlSplitResult = myUrl.split(""); //multiple regex???
        for(String s :  myUrlSplitResult) {
            System.out.println(s);
        }

        String [] myUrlParts = myUrl.split("://");
        for (String s : myUrlParts) {
            System.out.println(s);
        }

        //index
        System.out.println(myUrl.indexOf("a"));
        System.out.println(myUrl.indexOf("pro")); ///Index of 1st appearance, so how to see all indexes?

        //Sub-string
        System.out.println(myUrl.substring(8,15)); //7th char to 15th char
        System.out.println(myUrl.substring(8)); //7th char to the end
        System.out.println(myUrl.substring(myUrl.indexOf("s"),myUrl.indexOf("com"))); //index of is exclusive. So not include "com"


        //Concatenation | + | String Builder
        String hello = "Hello";
        String world = "world";
        System.out.println(hello+ " " +world);
        System.out.println(hello.concat(world).concat(" my name is").concat("Teo"));

        int[] myIntArray = {1,2,4,2,4,6,7,4,5,7,3,2};
        for(int elementIndex = 0; elementIndex < myIntArray.length; elementIndex++){
            System.out.println("Position: " + (elementIndex+1) + " value is: " + myIntArray[elementIndex]);
        }

        //Regex
        String priceString = "Item price: 999 VND";
        String taxString = "Tax: 99 VND";
        String totalPrice = "Total price: 1898 VND";
        String priceNumberTxt = priceString.replaceAll("[^0-9]","");
        System.out.println(priceNumberTxt);
        int priceNumber = Integer.parseInt(priceNumberTxt);
        System.out.println("Regex output: "+ priceNumber);



    }
}
