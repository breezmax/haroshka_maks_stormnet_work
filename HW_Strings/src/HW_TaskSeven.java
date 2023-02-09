public class HW_TaskSeven {
    static String s1 = "string";
    static String s2 = "code";
    static String s3 = "Practice";

    public static void main(String[] args) {
        middleSymbols(s1);
        middleSymbols(s2);
        middleSymbols(s3);
    }

    private static void middleSymbols(String mainString){
        int start = (mainString.length()/2) - 1;
        int end = (mainString.length()/2) + 1;
        String result = mainString.substring(start, end);
        System.out.println(result);
    }
}
