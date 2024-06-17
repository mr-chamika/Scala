def shippingCost(a:Int):Double=if(a<=50) a*3 else (a-50)*0.75 + 50*3
def discount(x:Int,y:Double):Double=x*y*0.4
def TotalCoverPrice(l:Int,m:Double)=l*m
  
println("Total wholesale cost is = Rs. " + (TotalCoverPrice(60,24.95) + shippingCost(60) - discount(60,24.95)))
