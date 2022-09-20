

public class Main {
    public static void main(String args[]) {
        BinarySearch ob = new BinarySearch();
        String[] arr = {"Anthony", "Boby", "Conan", "Maurice", "Patrice", "Zurfu"};
        int n = arr.length;
        String search = "anThOny";
        String position = ob.binarySearch(arr, 0, n, search);
        System.out.println(position);
    }
}
