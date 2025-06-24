public class strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Concatenating strings
        String result1 = str1 + " " + str2;
        System.out.println("Using + operator: " + result1);
        
        System.out.println("Printing the string one char at a time: ");
        for (int i = 0; i < str1.length(); i++) {
            System.out.print(str1.charAt(i) + " ");
        }

        System.out.println();
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Using concat() method: " + result2);

        // Comparison of strings
        String str3 = "Hello";
        String str4 = "hello";
        System.out.println("Comparing strings using equals(): " + str3.equals(str4));
        System.out.println("Comparing strings using equalsIgnoreCase(): " + str3.equalsIgnoreCase(str4));
        System.out.println("Comparing strings using compareTo(): " + str3.compareTo(str4));
        System.out.println("Comparing strings using compareToIgnoreCase(): " + str3.compareToIgnoreCase(str4)); 
        System.out.println("Comparing strings using == operator: " + (str3 == str4));

        // substring example
        String str5 = "Hello, World!";
        String subStr1 = str5.substring(0, 5);
        String subStr2 = str5.substring(7);
        System.out.println("Substring of '" + str5 + "': " + subStr1 + " and " + subStr2);
    }
}