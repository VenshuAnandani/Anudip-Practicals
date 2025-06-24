public class stringreverse {
    public static String reverse(String input) {
        StringBuilder sb = new StringBuilder(input);
        for (int front = 0, back = sb.length() - 1; front < back; front++, back--) {
            char temp = sb.charAt(front);
            sb.setCharAt(front, sb.charAt(back));
            sb.setCharAt(back, temp);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }
}