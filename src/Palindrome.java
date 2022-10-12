public class Palindrome 
{
    public static void main(String[] args) // основной метод main
    {
        for (int i = 0; i < args.length; i++) // перебор аргументов для записи
        {
            String word = args[i]; // запись слова из аргументов
            System.out.println(word + " " + isPalindrome(word)); // вывод результата
        }
    }

    public static String reverseString(String str) // метод REverseString, принимает строку str и возвращает перевернутую версию
    {
        String temp = ""; // временный контейнер для записи перевернутого str
        for (int i = str.length() - 1; i >= 0; i--) // перебор всех букв в str с конца в начало
        {
            temp += str.charAt(i); // добавляем в temp по букве
        }
        return temp;
    }

    public static boolean isPalindrome(String word) // метод isPalindrome, принимает строку word
    {
        return word.equals(reverseString(word)); // если word равен своей перевернутой версии, то возвращается true, в другом случае false
    }
}
