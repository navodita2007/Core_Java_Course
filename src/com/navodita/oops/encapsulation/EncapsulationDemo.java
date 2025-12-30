package com.navodita.oops.encapsulation;

// To implement banking functionality like deposit and withdraw money from the bank.
class Account {

    private String customerName;
    private int amount;
    private String accno;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public String getAccno() {
        return accno;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}

class BankFunctions {
    void deposit(Account acc, int depositAmount) {
        int total = acc.getAmount() + depositAmount;
        acc.setAmount(total);
    }


    void withdraw(Account acc, int withDrawAmount) {
        int total = acc.getAmount() - withDrawAmount;
        acc.setAmount(total);
    }

}

class AccountMain {

    public static void main(String[] args) {
        Account ob1 = new Account();
        ob1.setCustomerName("Navodita");
        ob1.setAccno("11111");
        ob1.setAmount(300000);

        Account ob2 = new Account();
        ob2.setCustomerName("Bhupendra");
        ob2.setAccno("22222");
        ob2.setAmount(200000);

        BankFunctions bf = new BankFunctions();
        bf.deposit(ob1, 5000);
        bf.withdraw(ob1, 3000);

        bf.deposit(ob2, 10000);
        bf.withdraw(ob2, 5000);

        System.out.println("Customer Name : " + ob1.getCustomerName() + " ,Account Number : " + ob1.getAccno() + " ,Balance Amount : " + ob1.getAmount());
        System.out.println("Customer Name : " + ob2.getCustomerName() + " ,Account Number : " + ob2.getAccno() + " ,Balance Amount : " + ob2.getAmount());
    }
}


