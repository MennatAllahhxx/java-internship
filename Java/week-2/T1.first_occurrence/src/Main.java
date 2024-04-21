public class Main {
    public static void main(String[] args) {

        int [] arr;
        arr = new int[]{5, 6, 11, 7, 0, 3, 22, 5, 8, 19};

        int searchFor = 5;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchFor) {
                if (i < 5) continue;
                System.out.println("number " + searchFor + " is found at index: " + i);
                break;
            } else if (i == arr.length - 1) System.out.println("not found");
        }
    }
}