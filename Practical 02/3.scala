def normalSalary(nMoney:Double,workingHours:Int) = nMoney*workingHours//250(nMoney) per normal hour and 40 hours for a week, 160 fora  month

def otSalary(otMoney:Double,otHours:Int) = otMoney*otHours //85(otMoney) per OT hour and 30 hours for a week, 120 for a month

def totalMonthlySalary(nMoney:Double, workingHours:Int, otMoney:Double, otHours:Int) = normalSalary(nMoney,workingHours*4) + otSalary(otMoney,otHours*4)

def tax(rate:Double, nMoney:Double, workingHours:Int, otMoney:Double, otHours:Int) = totalMonthlySalary(nMoney, workingHours, otMoney, otHours) * rate

def takeHomeSalary(rate:Double, nMoney:Double, workingHours:Int, otMoney:Double, otHours:Int) ={

  totalMonthlySalary(nMoney, workingHours, otMoney, otHours) - tax(rate, nMoney, workingHours, otMoney, otHours)

}

println("Monthly take home salary : Rs." + takeHomeSalary(0.12, 250, 40, 85, 30))
