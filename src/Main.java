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
        for (int i = 10;sum<n; i++) {
            String n1=Integer.toString(i);
            int length=n1.length();
          int num=i%10;
          int num1=i/10;
          while(num1>0){
              total+=Math.pow(num,length);
              if (num1<10)
                  total+=Math.pow(num1,length);
            num=num1%10;
              num1=num1/10;
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