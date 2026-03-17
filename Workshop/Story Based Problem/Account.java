public class Account {
        static String bankName = "Global Standard Bank";
        String accountNumber;
        double balance;
        Account(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
        void calculateInterest() {
            System.out.println("No specific interest rate defined for generic account.");
        }

        void displayDetails() {
            System.out.println("Bank: " + bankName);
            System.out.println("Account: " + accountNumber + " | Balance: $" + balance);
        }
    }


    class SavingsAccount extends Account {
        SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        void calculateInterest() {
            double interest = balance * 0.04;
            System.out.println("Savings Interest (4%): $" + interest);
        }
    }


    class CurrentAccount extends Account {
        CurrentAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }

        @Override
        void calculateInterest() {
            double interest = balance * 0.02;
            System.out.println("Current Interest (2%): $" + interest);
        }
    }


    public class BankSystem {
        public static void main(String[] args) {

            Account mySavings = new SavingsAccount("SA1001", 5000.0);
            Account myCurrent = new CurrentAccount("CA2001", 5000.0);

            System.out.println("--- Processing Savings ---");
            mySavings.displayDetails();
            mySavings.calculateInterest();

            System.out.println("\n--- Processing Current ---");
            myCurrent.displayDetails();
            myCurrent.calculateInterest();
        }
    }
}
