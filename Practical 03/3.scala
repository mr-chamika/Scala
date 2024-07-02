val num1 = 5.4
val num2 = 8.9

def Mean(num1:Double, num2:Double):Float = BigDecimal((num1 + num2)/2).setScale(2,BigDecimal.RoundingMode.HALF_UP).toFloat
          
val x = Mean(num1,num2)  
println(f"$x%.2f")
