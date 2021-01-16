import java.util.Scanner;

public class MainCl
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Math.Factorial factorial=Math.getFactorial(n);
        System.out.println("Факториал числа:"+factorial.getKey()+" равен:"+factorial.getResult());
        Person Tom=new Person("Tom","1123",23);
        Tom.displayPerson();
        Person.Account Jorn=Tom.new Account("1123",23);
        Jorn.displayAccount();
        class NumberPhone{
            private String phone;
            public NumberPhone(String p)
            {
                phone=p;
            }
            public boolean validate()
            {
                if(phone.startsWith("+7")&&phone.length()==12) return true;
                return false;
            }
        }
        int number;
        int zero;
        try {
            number = 1;
            zero = 0;
            int result = number / zero;
            System.out.println("Message1");
        } catch (ArithmeticException e) {
            System.out.println("Message2");
        }
        System.out.println("Message3");
    }


}
