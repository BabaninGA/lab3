//В данной программе пользователь вводит с клавиатуры некоторую строку, предположительно, содержащую дату.
//Программа проверяет, является ли данная строчка датой в формате dd/mm/yyyy, начиная с 1900 года до 9999 года.

import java.util.Scanner;
import java.util.regex.*;

public class Task_1 {
    public static void main(String[] args) {
        String text = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры некоторую дату в формате dd/mm/yyyy");
        text = in.next();
        in.close();
        String pattern = "(\\d\\d/\\d\\d/\\d\\d\\d\\d)";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.matches() == true) {
            pattern = "(0[1-9]|[12]\\d|3[01])/\\d\\d/\\d\\d\\d\\d";
            p = Pattern.compile(pattern);
            m = p.matcher(text);
            if (m.matches() == true) {
                pattern = "(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[012])/\\d\\d\\d\\d";
                p = Pattern.compile(pattern);
                m = p.matcher(text);
                if (m.matches() == true) {
                    pattern = "(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[012])/(19|[2-9][0-9])\\d\\d";
                    p = Pattern.compile(pattern);
                    m = p.matcher(text);
                    if (m.matches() == true) {
                        System.out.println("Вами введена дата в формате dd/mm/yyyy, начиная с 1900 года до 9999 года");
                    } else {
                        System.out.println("Введённая Вами дата не находится в диапазоне с 1900 года до 9999 года");
                    }
                } else {
                    System.out.println("Не существует ввёденого Вами месяца в году");
                }
            } else {
                System.out.println("Не существует ввёденого Вами дня в месяце");
            }
        } else {
            System.out.println("Введенная Вами дата не соответсвует формату dd/mm/yyyy");
        }
    }
}