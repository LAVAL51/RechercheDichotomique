public class BinarySearch {
    String binarySearch(String[] arr, int lowerElement, int hightElement, String search) {
        if (hightElement >= lowerElement && lowerElement < arr.length) {
            int mid = lowerElement + (hightElement - lowerElement) / 2;
            String test = arr[mid];
            int compare = search.compareToIgnoreCase(test);

            if (compare == 0) {
                return arr[mid] + "yess";
            }

            if (arr[arr.length - 1].equals(arr[mid]) || arr[0].equals(arr[mid])) {
                return "No element found";
            } else {
                if (compare < 0) {
                    return binarySearch(arr, lowerElement, mid, search);
                } else {
                    return binarySearch(arr, mid, hightElement, search);
                }
            }
        }
        return "No element found";
    }
}
