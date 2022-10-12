public class Primes
{
    public static void main(String[] args) // метод main для перебора значения num 
    {
        int num; // число на проверку
        for (num = 2; num <= 100; num++) // перебор чисел с 2 до 100
        {
            if(isPrime(num)) // проверка на простое число
            {
                System.out.println(num + " is prime"); // вывод числа
            }
            else
            {
                System.out.println(num + " not prime");
            }
        }
    }
    public static boolean isPrime(int n) // метод isPrime, принимает число n и проверяет, является ли оно простым числом
    {
        for (int i = 2; i < n; i++) // перебор всех чисел от 2 до n
        {
            if((n % i) == 0) // если n делится на i без остатка, значит у n есть делитель, кроме 1 и самого числа => n не простое число
            {
                return false;
            }
        }
        return true;
    }
}
