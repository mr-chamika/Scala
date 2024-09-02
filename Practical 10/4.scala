class Account(private var balance: Double) {

  def deposit(amount: Double): Unit = {
    require(amount > 0, "Deposit amount must be positive.")
    balance += amount
  }

  def withdraw(amount: Double): Unit = {
    require(amount > 0, "Withdrawal amount must be positive.")
    require(amount <= balance, "Insufficient funds.")
    balance -= amount
  }

  def transfer(amount: Double, toAccount: Account): Unit = {
    require(amount > 0, "Transfer amount must be positive.")
    withdraw(amount)  
    toAccount.deposit(amount)  
  }

  def getBalance: Double = balance

  def applyInterest(): Unit = {
    balance match {
      case b if b > 0 => balance += b * 0.05  
      case b if b < 0 => balance -= Math.abs(b) * 0.10  
      case _ => 
    }
  }

  override def toString: String = f"Balance: ${balance}%.2f"
}

class Bank(private val accounts: List[Account]) {

  def accountsWithNegativeBalances: List[Account] = {
    accounts.filter(account => account.getBalance < 0)
  }

  def totalBalance: Double = {
    accounts.map(_.getBalance).sum
  }

  def applyInterestToAll(): Unit = {
    accounts.foreach(_.applyInterest())
  }

  def getAllAccounts: List[Account] = accounts
}

object Main extends App {
  val account1 = new Account(1000.0)
  val account2 = new Account(500.0)
  val account3 = new Account(-200.0)
  val account4 = new Account(-50.0)

  val bank = new Bank(List(account1, account2, account3, account4))

  println("Accounts with negative balances:")
  bank.accountsWithNegativeBalances.foreach(println)  

  println("Total balance before applying interest: "+bank.totalBalance)  

  bank.applyInterestToAll()

  println("Accounts after applying interest:")
  bank.getAllAccounts.foreach(println)  
}
