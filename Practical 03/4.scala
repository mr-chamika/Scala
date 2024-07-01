var i=0
var sum,k = 0
var list = List.empty[Int]

def Start() = {//take the size of the list from user

  print("Enter the size of the list : ") 
  var x = scala.io.StdIn.readInt()

  Get(x)

}


def Get(no:Int) = {//get values from the user

  val size = no

  for(i <- 0 to no-1){

    print("Enter number "+(i+1)+" : ") 
    var y = scala.io.StdIn.readInt()

    Set(y)
 
  }

  getSumOfEven(size)

  
}


def Set(num:Int) = {// put int values to the list entered by the user

    list:+=num

}

def getSumOfEven(no:Int) = {

  for(i <- 0 to no-1){

    if(list(i) % 2 ==0) sum = sum + list(i)
  
  }
  
  println("Sum of the even integers in the list : " + sum)

}

Start()

