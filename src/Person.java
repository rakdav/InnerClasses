public class Person
{
    private String name;
    private Account account;

    public Person(String name, String pass,int count) {
        this.name = name;
        this.account = new Account(pass,count);
    }
    public void displayPerson()
    {
        System.out.println("Имя:"+name+" Пароль:"+account.password+" Количество:"+account.count);
    }

    public class Account
    {
        private String password;
        private int count;

        public Account(String password, int count) {
            this.password = password;
            this.count = count;
        }
        public void displayAccount()
        {
            System.out.println("Имя:"+Person.this.name+" Пароль:"+password+" Количество:"+count);
        }
    }
}
