package final_easy;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        FinalExamEasyCorrectAnswer easy = new FinalExamEasyCorrectAnswer();
//        FinalExamEasy easy = new FinalExamEasy();

        System.out.println("\nQuestion 1");
        System.out.println(easy.checkIfANumberIsEven(10));
        System.out.println(easy.checkIfANumberIsEven(9));
        System.out.println(easy.checkIfANumberIsEven(101));

        System.out.println("\nQuestion 2");
        System.out.println(easy.getDayOfTheWeek(1));
        System.out.println(easy.getDayOfTheWeek(3));
        System.out.println(easy.getDayOfTheWeek(5));
        System.out.println(easy.getDayOfTheWeek(7));
        System.out.println(easy.getDayOfTheWeek(9));

        System.out.println("\nQuestion 3");
        System.out.println(easy.computePIWithSeriesExpansion(1));
        System.out.println(easy.computePIWithSeriesExpansion(3));
        System.out.println(easy.computePIWithSeriesExpansion(5));
        System.out.println(easy.computePIWithSeriesExpansion(21));

        System.out.println("\nQuestion 4");
        easy.Question4(4);
        easy.Question4(7);
        easy.Question4(8);

        System.out.println("\nQuestion 5");
        easy.Question5(4);
        easy.Question5(7);
        easy.Question5(8);

        System.out.println("\nQuestion 6");
        HashMap<String, MyData> hashMap1 = easy.Question6(3);
        System.out.println(hashMap1.get("One"));
        System.out.println(hashMap1.get("Two"));
        System.out.println(hashMap1.get("Three"));
        System.out.println(hashMap1.get("Four"));
        HashMap<String, MyData> hashMap2 = easy.Question6(10);
        System.out.println(hashMap2.get("One"));
        System.out.println(hashMap2.get("Two"));
        System.out.println(hashMap2.get("Three"));
        System.out.println(hashMap2.get("Four"));

        System.out.println("\nQuestion 7");
        MyData[] arrMyDataQ7 = new MyData[4];
        arrMyDataQ7[0] = new MyData(5);
        arrMyDataQ7[1] = new MyData(7);
        arrMyDataQ7[2] = new MyData(1);
        arrMyDataQ7[3] = new MyData(10);
        MyData[] sortedArray = easy.sortArrayUsingBubbleOrSelectionSort(arrMyDataQ7);
        System.out.println(arrMyDataQ7[0]);
        System.out.println(arrMyDataQ7[1]);
        System.out.println(arrMyDataQ7[2]);
        System.out.println(arrMyDataQ7[3]);
        System.out.println(sortedArray[0]);
        System.out.println(sortedArray[1]);
        System.out.println(sortedArray[2]);
        System.out.println(sortedArray[3]);

        System.out.println("\nQuestion 8");
        MyData[] arrMyDataQ8 = new MyData[4];
        arrMyDataQ8[0] = new MyData(2);
        arrMyDataQ8[1] = new MyData(16);
        arrMyDataQ8[2] = new MyData(3);
        arrMyDataQ8[3] = new MyData(9);
        System.out.println(easy.Question8(arrMyDataQ8));

        System.out.println("\nQuestion 9");
        MyData[] arrMyDataQ9 = new MyData[4];
        arrMyDataQ9[0] = new MyData(2);
        arrMyDataQ9[1] = new MyData(16);
        arrMyDataQ9[2] = new MyData(3);
        arrMyDataQ9[3] = new MyData(9);
        System.out.println(easy.Question9(arrMyDataQ9));

        System.out.println("\nQuestion 10");
        MyData[] arrMyDataQ10 = new MyData[4];
        arrMyDataQ10[0] = new MyData(2);
        arrMyDataQ10[1] = new MyData(-6);
        arrMyDataQ10[2] = new MyData(10);
        arrMyDataQ10[3] = new MyData(7);
        System.out.println(easy.Question10(arrMyDataQ10));
    }
}
