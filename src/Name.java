public class Name {
    public static void main(String[] args) {
        String firstName = "ajay";
        String lastName = "";
        System.out.println(getUserName(firstName, lastName));
    }

    public static String getUserName(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return stringCaptialiseletter(lastName) + ", " + stringCaptialiseletter(firstName);
        } else if (lastName == null) {
            return stringCaptialiseletter(firstName);
        }
        return stringCaptialiseletter(lastName) + ", " + stringCaptialiseletter(firstName);
    }

    public static String stringCaptialiseletter(String name) {
        if (name == null || name.length() < 1) {
            return name;
        }
        char[] chars = name.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return String.valueOf(chars);
    }
}
