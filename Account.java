package OnlineBankingSystem;

public class Account {
    private String username;
    private String fullName;
    private String birthday;
    private String birthplace;
    private String address;
    private String mobileNumber;
    private String accountType;
    private String password;
    private double balance;
    private String accountNumber;
    private String favoriteColor;
    private String securityAnswer;

    public Account(String username, String fullName, String birthday, String birthplace, String address,
                   String mobileNumber, String accountType, String password, double balance,
                   String favoriteColor, String securityAnswer) {
        this.username = username;
        this.fullName = fullName;
        this.birthday = birthday;
        this.birthplace = birthplace;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.password = password;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
        this.favoriteColor = favoriteColor;
        this.securityAnswer = securityAnswer;
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to generate a unique account number
    private String generateAccountNumber() {
        return "ACCT" + (int) (Math.random() * 1000000);
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount, boolean showBalance) {
        if (amount > 0) {
            balance += amount;
            if (showBalance) {
                System.out.println("Deposited " + amount + " to your account. New balance: " + balance);
            }
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
