package replace;

public class HW_TaskSix {
    public static void main(String[] args) {
        /*
        Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented
        programming» (не учитываем регистр символов) на «OOP».
         */
        String str = "Object-oriented programming is a programming language model organized around\n" +
                "objects rather than \"actions\" and data rather than logic. Object-oriented programming\n" +
                "blabla. Object-oriented programming bla.";
        String whatFind = "Object-oriented programming";


        ReplaceWord rw = new ReplaceWord();
        rw.replaceWordInString(str, "OOP", whatFind);
    }
}
