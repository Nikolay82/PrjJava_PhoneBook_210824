/***
 Задание
 Реализуйте структуру телефонной книги с помощью HashMap.
 Программа также должна учитывать, что в во входной структуре будут повторяющиеся имена
 с разными телефонами, их необходимо считать, как одного человека с разными телефонами.
 Вывод должен быть отсортирован по убыванию числа телефонов.
 */


public class App {
    public static void main(String[] args) {
        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add("Вася", "999-111-45-67");
        myPhoneBook.add("Петя", "999-222-45-67");
        myPhoneBook.add("Петя", "999-333-45-67");
        myPhoneBook.add("Петя", "999-444-45-67");
        myPhoneBook.add("Вася", "999-555-45-67");
        myPhoneBook.add("Вася", "999-666-45-67");
        myPhoneBook.add("Вася", "999-777-45-67");
        myPhoneBook.add("Маша", "999-888-45-67");
        myPhoneBook.print();
    }
}
