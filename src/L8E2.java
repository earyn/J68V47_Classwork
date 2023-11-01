public class L8E2 {
    public static void main(String[] args) {
        Integer [] score = {45,93,78,26,98,47,68,89,83,97};
        for (int value : score) {
            System.out.println(value);
        }
            int total = score[0]+score[1]+score[2]+score[3]+score[4]+score[5]+score[6]+score[7]+score[8]+score[9];
            System.out.println("The average score is " + total / score.length);

    }
}
