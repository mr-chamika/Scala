///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

val interest  = (amount:Double) =>{ //declaration of the lambda function
  
  var output = 0.0

  if(amount <= 20000){

    output = amount * 0.02

  }else if (amount <= 200000){

    output = amount * 0.04

  }else if(amount <= 2000000){

    output = amount * 0.035

  }else{

    output = amount * 0.065

  }

  output

}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

def getdata():Double={ // getting the deposit amount from the user and calling lambda function(interest)

  print("Enter the deposit amount : ")
  val x = scala.io.StdIn.readDouble()

  x

}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

val y = getdata() 
val interestValue = interest(y)

println("Interest amount for Rs." + y + " : Rs." + interestValue)
