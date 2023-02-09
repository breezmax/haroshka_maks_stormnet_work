public class Test {

    public static void main(String []args){
        String str1 = "13579";
        String str2 = "2468";

        String res = "";
        for(int i = 0; i< str1.length(); i++)
        {

            char a1 = str1.charAt(i);

            if (i<str2.length()) {
                char a2 = str2.charAt(i);
                res = res + a1 + a2;

            }
            else res = res + a1;
        }

        System.out.println(res);
    }
}
