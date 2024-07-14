var list = List.empty[String]
var i=0

def getProductList() = {

  var x = ""

  while(x != "done"){

  print("Enter an item : ")
  x = scala.io.StdIn.readLine();
 
  if(x != "done"){

  list = list :+ x

  }

  }

}

def printProductList(list:List[String])={

  for(i <- 0 to list.length-1){

    println(i+1 + " : " + list(i))

  }

}

def getTotalProducts(list:List[String])= list.length

getProductList();
printProductList(list);
println("Total number of products in the list : " + getTotalProducts(list))
