public class Project10 {
    // Write a program to print out duplicate elements from
    //an Array of Strings?
    public static void main(String[] args) {
        String[] names = { "Kate", "John", "Charlie", "Bob", "David", "John" };

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate elements are " +names[i]);
                }
            }
        }
    }
}
