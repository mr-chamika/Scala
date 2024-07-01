var i = 0

def getInput()={

  print("Enter a string : ")
  val string = scala.io.StdIn.readLine();

  i = string.length
  Reverse(string)

}


def Reverse(string:String):Any={
    
 i= i-1
 print(string(i))
 if(i!=0) (Reverse(string))

 

}

getInput()
println("\n")
