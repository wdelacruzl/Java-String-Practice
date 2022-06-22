import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Learn string handling";
        String allUpper = "LEARN STRING HANDLING";
        boolean isTrue = false;

        //This will return the first char of the string
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(4);

        if(str.equalsIgnoreCase(allUpper)) {
        }else {
        }

        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("Character at 1 index is: " + ch2);
        System.out.println("Character at 4 index is: " + ch3);

        System.out.println("Are str and allUpper equal: " + true);

        // 1) Using the string "Learn string handling": what index is the last letter in the string?
        char ch21 = str.charAt(20);
        System.out.println("Character at 20 index is: " + ch21);
        // 2) Using the same string as above, what character is located at the 10th index?
        char ch11 = str.charAt(10);
        System.out.println("Character at 10 index is: " + ch11);
        // 3)Do a check to see if the character at index 10 and 15 the same?
        System.out.println(ch11);
        char ch16 = str.charAt(15);
        System.out.println(ch16);
        if (ch16 == ch11){
            System.out.println("Both characters are the same");
        } else {
            System.out.println("Both characters are different");
        }
        // 4) Create a scenario that returns false if the character at the 0 index equals the 5 index
        char ch6 = str.charAt(5);
        if (ch6 == ch1){
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        //length()
        System.out.println("This is the length of the string: " + str.length());
        //contains()
        System.out.println("Does the string contains the word 'hello' ? " + str.contains("Hello"));
        //substring()
        System.out.println(str.substring(0,7));
        //startsWith
        System.out.println("Does the string begins with the letter 'l'? " +  str.startsWith("L"));
        //endsWith
        System.out.println("Does the string ends with the letter 'h'? " + str.endsWith("H"));
        //toLowerCase()
        System.out.println(allUpper.toLowerCase(Locale.ROOT));
        //toUpperCase()
        System.out.println(str.toUpperCase());
    }
}
