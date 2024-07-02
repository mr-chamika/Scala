val num1 = 5
val num2 = 8

def Mean(num1:Int, num2:Int):Float = BigDecimal((num1 + num2)/2).setScale(2,BigDecimal.RoundingMode.HALF_UP).toFloat
          
val x = Mean(num1,num2)  
println(f"$x%.2f")
