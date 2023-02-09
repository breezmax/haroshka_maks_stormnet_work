public class Main {
    public static void main(String[] args) {

        String hwStr1 = "Здрааа-а-а-авствуйте, Казак Виктор! Я Ваша тетя!";

        System.out.println("\n1) Вырезаем из строки все от первой \'а\' до последней \'в\'");
        int start = hwStr1.toLowerCase().indexOf("а");
        int end = hwStr1.toLowerCase().lastIndexOf("в");
        char[] dst = new char[end - start];
        hwStr1.getChars(start, end, dst, 0);
        System.out.println(dst);

        System.out.println("\n2) Заменяем все вхождения \'а\'(3) на символ \'З\'(0):");
        String rep1 = hwStr1.replace(hwStr1.charAt(3), hwStr1.charAt(0));
        System.out.println(rep1);

        System.out.println("\n3) Переворачиваем строку задом на перед:");
        StringBuffer buffer = new StringBuffer(hwStr1);
        buffer.reverse();
        System.out.println(buffer);

        System.out.println("\n4) Считаем кол-во слов в строке и на наличие полиндрома:");
        String[] countWords = hwStr1.split(" ");
        int i = 0;
        boolean polindrom = false;
        for (String s : countWords) {

            StringBuffer bufferRev = new StringBuffer(s);
            String rev = String.valueOf(bufferRev.reverse());
            if (s.length() > 1){
                if (s.compareToIgnoreCase(rev) == 0){
                    polindrom = true;
                }
            }
            i++;
        }
        System.out.printf("Предложение содержит %s слов(а)", i);
        if (polindrom){
            System.out.println("\nПредложение содержит полиндром!");
        } else {
            System.out.println("\nВ предложении нет полиндрома!");
        }

        }

}