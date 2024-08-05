var i = 0

def filterEvenNumbers(list:List[Int]):List[Int] = {

    var newList = List.empty[Int]
  
    newList = list.filter(x=>(x%2==0))

  newList
}

def getList():List[Int] = {

  var firstList = List.empty[Int]

  print("Enter the size of the list : ")
  val size = scala.io.StdIn.readInt()

  for(i <- 0 to size-1){
  
    print("Enter the number " + (i+1) + " : ")
    var num = scala.io.StdIn.readInt()
    
    firstList:+=num

  }

  firstList

}

var l = getList()

print("Intput : " + l + "\n")

val returnList = filterEvenNumbers(l)

print("Output : " + returnList + "\n")
