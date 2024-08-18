 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

val PatternMatching = (integer:Int) => {

  if(integer <= 0){

    println("Negative/Zero")

  }else if(integer % 2 == 0){

    println("Even number")

  }else if(integer % 2 == 1){

    println("Odd number")

  }

}

def getdata():Int={

  print("Enter a integer : ")
  val num = scala.io.StdIn.readInt()

  num

}

val num = getdata()
PatternMatching(num)
