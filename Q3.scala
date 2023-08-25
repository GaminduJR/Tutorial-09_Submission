object Q3{
    def main(args: Array[String]): Unit = {
        var account1 = new Account("200114404593", 2001, 34000);
        account1.Deposit(16000);
        account1.Withdraw(5000);
        account1.Transfer(2002, 5000);

        println("Account Balance at the end of all Transactions: "+account1.accountBalance);

    }

    class Account(nic: String, accNo: Int, balance: Double){
        var NIC = nic;
        var accountNumber = accNo;
        var accountBalance = balance;
        var message = "";

        def Deposit(amount: Double) = this.accountBalance = this.accountBalance + amount ;
        def Withdraw(amount: Double) = this.accountBalance = this.accountBalance - amount ;
        def Transfer(accNumber:Int, amount: Double) = {
            this.accountBalance = this.accountBalance - amount ;
            println("The " + amount + " SUCCESSFULLY TRANSFERRED to " + accNumber + " account.");
        }
    
    }
}