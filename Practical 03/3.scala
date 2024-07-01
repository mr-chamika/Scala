val num1 = 5.4
val num2 = 8.9

def Mean(num1:Double, num2:Double):Float = BigDecimal((num1 + num2)/2).setScale(2,BigDecimal.RoundingMode.HALF_UP).toFloat
          
println(Mean(num1,num2))
