object Q4{
    def main(args: Array[String]): Unit = {
        var account1 = new Account("200114404593", 2001, 34000);
        var account2 = new Account("200114404593", 2002, 35000);
        var account3 = new Account("200114404593", 2003, -36000);
        var account4 = new Account("200114404593", 2004, 25000);
        var account5 = new Account("200114404593", 2005, -34000);

        var Bank:List[Account] =List(account1, account2, account3, account4, account5);
        println("Accounts with negative balances: ");
        println(negativeBalanceAccount(Bank).foreach(Account => println(Account.accountNumber)));
        println("Sum of all Accounts: "+totalBalance(Bank));
        println("Final Balance After Adding Interest: " + finalBalance(Bank));
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

    def negativeBalanceAccount(accList:List[Account]): List[Account] = {
        accList.filter(account => account.accountBalance < 0);
    }

    def totalBalance(accList:List[Account]): Double = {
        var total:Double = 0;
        var balanceList: List[Double] = List();
        for (i <- accList) {
            balanceList = balanceList :+ i.accountBalance;
        }
        total = balanceList.sum;
        total
    }

    def finalBalance(accList:List[Account]): Any= {
        accList.map(account => {
            if(account.accountBalance > 0){
                account.accountBalance += account.accountBalance*0.05;
            }
            else{
                account.accountBalance += account.accountBalance*0.1;
            }
        });

        totalBalance(accList);
    }
}