public class Main {
    public static void main(String[] args) {
        int n = 3; // מספר המספרים הנרקיסיסטיים לחיפוש
        int[] narcissisticNumbers = findNarcissisticNumbers(n);

        // הדפסת המספרים הנרקיסיסטיים שנמצאו
        for (int num : narcissisticNumbers) {
            System.out.println(num);
        }
    }

    // פעולה למציאת n המספרים הנרקיסיסטיים הראשונים
    public static int[] findNarcissisticNumbers(int n) {
        // TODO: השלם את הלוגיקה למציאת המספרים הנרקיסיסטיים
        int sum = 0;
        int total = 0;
        int[] r = new int[n];
        for (int i = 10; sum < n; i++) {
            String n1 = Integer.toString(i);
            int num = n1.length();
            for (int j = 0; j < num; j++) {
                total += Math.pow(n1.charAt(j), num);

            }

            if (i == total) {
                r[sum] = i;
                sum++;
            }
            total = 0;
        }

        return r; // החזרה זמנית // החזרה זמנית
    }

}