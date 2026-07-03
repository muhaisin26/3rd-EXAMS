public class Testprogram {
    public class Main {
    public static void main(String[] args) {

        Customer c = new Customer("John");

        SavingsAccount s =
            new SavingsAccount("S001", 1000, 5);

        CurrentAccount cur =
            new CurrentAccount("C001", 500, 300);

        c.addAccount(s);
        c.addAccount(cur);

        s.addInterest();

        cur.withdraw(700);

        System.out.println(s.generateStatement());
        System.out.println(cur.generateStatement());

        System.out.println(
            "Total Worth = " + c.totalWorth());
    }
}
}
