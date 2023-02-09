public class HW_TaskEight {


    public static void main(String[] args) {
        combineStrings();
    }

    static String s1 = "Test String";
    static String s2 = "You are amazing!";

    private static void combineStrings(){
        StringBuilder sBuilder = new StringBuilder();
        int maxLength = Math.max(s1.length(), s2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < s1.length()){
                sBuilder.append(s1.charAt(i));
            }
            if (i < s2.length()){
                sBuilder.append(s2.charAt(i));
            }
        }
        System.out.println(sBuilder);


    }

}
