public class HW_TaskFive {
    public static void main(String[] args) {
        /*
        Даны два предложения посчитать сколько слов совпадает.
         */
        int result = 0;
        System.out.println("\n5) Посчитать сколько слов совпадает в двух строках:");
        String firstRow = "Зачем козе Баян?";
        String secondRow = "Зачем слону баян?";

        String[] firstArr = firstRow.split(" ");
        String[] secondArr = secondRow.split(" ");

        for (String s : firstArr){
            for (String s2 : secondArr) {
                if (s.equals(s2)) {
                    result++;
                }
            }

        }
        System.out.println(result);
    }
}
