//В данной программе пользователь вводит с клавиатуры некоторый пароль
//Программа проверяте, надежно ли составлен пароль
//Пароль считается надежным, если он состоит из 8 или более символов
//Символом может быть цифра, английская буква, знак подчеркивания
//Пароль должен содержать хотя бы одну цифру, одну маленькую букву и одну заглавную букву

import java.util.Scanner;
import java.util.regex.*;

public class Task_2 {
    public static void main(String[] args) {
        String text = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры Ваш пароль");
        text = in.next();
        in.close();
        String pattern = "[^(a-zA-Z0-9_)]";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        if (m.find() == false) {
            pattern = "[(a-zA-Z0-9_)]{8,}";
            p = Pattern.compile(pattern);
            m = p.matcher(text);
            if (m.find() == true) {
                pattern = "[0-9]";
                p = Pattern.compile(pattern);
                m = p.matcher(text);
                if (m.find() == true) {
                    pattern = "[a-z]";
                    p = Pattern.compile(pattern);
                    m = p.matcher(text);
                    if (m.find() == true) {
                        pattern = "[A-Z]";
                        p = Pattern.compile(pattern);
                        m = p.matcher(text);
                        if (m.find() == true) {
                            System.out.println("Пароль составлен надёжно");
                        } else {
                            System.out.println("Пароль составлен НЕнадёжно (пароль не содержит ни одной заглавной буквы)");
                        }
                    } else {
                        System.out.println("Пароль составлен НЕнадёжно (пароль не содержит ни одной маленькой буквы)");
                    }
                } else {
                    System.out.println("Пароль составлен НЕнадёжно (пароль не содержит ни одной цифры)");
                }
            } else {
                System.out.println("Пароль составлен НЕнадёжно (пароль содержит менее 8 символов/знаков)");
            }
        } else {
            System.out.println("Пароль содержит недопустимые символы/знаки");
        }
    }
}