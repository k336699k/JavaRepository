package Lab21;

/**
 * Написать программу, выполняющую поиск в строке всех тегов абза-цев, в т.ч. тех,
 * у которых есть параметры, например <p id=”p1”>, и замену их на простые теги абзацев <p>.
 */
public class Lab21Main {
    public static void main(String[] args) {
        Lab21 lab = new Lab21();
        lab.searchTag("Регулярные выражения <p    p> используются некоторыми <p id=\"p1\"> текстовыми редакторами и утилитами для поиска <p id=\"p3\"> и подстановки текста");
    }
}