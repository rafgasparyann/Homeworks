public class Main {
    public static void main(String[] args) {
//        1) ----------------------------------------------------------------------
//
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4 - i; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 5; j < array.length - 1; j++) {
//                if (array[j] < array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//        II) ----------------------------------------------------------------------
//
//        int[] array = {1, 2, 3, 4, 5, -6, 7, 8, 9, 10};
//        int index = 0;
//        int sum = 0;
//        boolean found = false;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                found = true;
//                index = i;
//                break;
//            }
//        }
//        if (found == false) {
//            System.out.println("In array hasn't negative number");
//        } else {
//            for (int i = 0; i < index; i++) {
//                sum += array[i];
//            }
//            System.out.println(sum);
//        }
//
//        3) ----------------------------------------------------------------------
//
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                sum1 += array[i];
//            }
//            else {
//                sum2 += array[i];
//            }
//        }
//        System.out.println("Sum even of index elements: " + sum1 + " " + "Sum odd of value elements: " + sum2);
//
//        4) ----------------------------------------------------------------------
//
//        int[] array = {1, 2, 3, 4, 5, -6, 7, 8, 9};
//        int averageOfPositiveElements = 0;
//        int sum = 0;
//        int positiveElements = 0;
//        int count = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0) {
//                sum += array[i];
//                positiveElements++;
//                averageOfPositiveElements = sum / positiveElements;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] < 0) {
//                array[i] = array[i] * -1;
//            }
//            if (array[i] > averageOfPositiveElements) {
//                count++;
//            }
//        }
//        System.out.println("Count: " + count);
//
//        Triangles ***********************************************************************
//
//        1) ----------------------------------------------------------------------
//
//        int n = 7;
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print("  ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j + " ");
//            }
//            for (int j = 2; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//        Pattern A) ----------------------------------------------------------------------
//
//        int n = 7;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//        Pattern B) ----------------------------------------------------------------------
//
//        int n = 7;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//        Pattern C) ----------------------------------------------------------------------
//
//        int n = 7;
//        for (int i = 1; i <= n; i++) {
//            for (int j = n; j > i; j--) {
//                System.out.print("   ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//        Pattern D) ----------------------------------------------------------------------
//
//        int n = 7;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//
//        Daniel Liang ***********************************************************************
//
//        ex. 7.17 (page 302) ----------------------------------------------------------------------
//
//        int numberOfStudents = 5;
//        Student[] students = new Student[numberOfStudents];
//
//        students[0] = new Student("Alice", 88);
//        students[1] = new Student("Bob", 95);
//        students[2] = new Student("Charlie", 78);
//        students[3] = new Student("David", 92);
//        students[4] = new Student("Eve", 85);
//
//        for (int i = 0; i < numberOfStudents - 1; i++) {
//            for (int j = 0; j < numberOfStudents - 1 - i; j++) {
//                if (students[j].score < students[j + 1].score) {
//                    Student temp = students[j];
//                    students[j] = students[j + 1];
//                    students[j + 1] = temp;
//                }
//            }
//        }
//
//        System.out.println("Students in decreasing order of their scores:");
//        for (Student student : students) {
//            System.out.println(student.name + ": " + student.score);
//        }
//
//        ex.7.18 ----------------------------------------------------------------------
//
//        double[] numbers = {34.5, 23.4, 45.6, 12.2, 89.9, 78.1, 56.6, 67.7, 34.1, 90.2};
//
//        System.out.println("Original array:");
//        for (double num : numbers) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        BubbleSort.bubbleSort(numbers);
//        System.out.println("Sorted array:");
//        for (double num : numbers) {
//            System.out.print(num + " ");
//        }
    }
}