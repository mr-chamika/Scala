val items = Array("Rice", "Tea", "Sugar", "Dried coconuts")
var quantity = Array(100, 350, 400, 1000)

var i = 0
var flag = false//to check whether relevant item is exists or not
var x =0 
/////////////////////////////////////////////////////////////////////////////////////////////////////
def displayInventory() = { //displayin all items with their quantities

  for(i <- 0 to items.length-1){

    println("Item name : " + items(i) + "|  Quantity : " + quantity(i))

  }

}
/////////////////////////////////////////////////////////////////////////////////////////////////////
def restockItem(item:String, quant:Int) = {// add quantities to exists items

  for(i <- 0 to items.length-1){ //checking item exists or not
  
    if(items(i) == item){

      flag = true
      x=i

    }

  }

  if (flag == true) {// if exists, update quantities

    quantity(x)+=quant 

    print("Updated quantities : ")


    for(i <- 0 to items.length-1){

      print(quantity(i) + " " )

    }

    println("")

  }else {//if item does not exists, display below msg

    println("The item " + item + "does not exists")

  }

}
///////////////////////////////////////////////////////////////

def sellItem(item:String, quant:Int)={//substract item quantities if enough

  for(i <- 0 to items.length-1){//check item exist

    if(items(i) == item){

      flag = true
      x=i

    }

  }
  
  if (flag == true) { //if exists and enough quantity  update quantities
    
    if(quant < quantity(x)){

      quantity(x)-=quant 

      print("Updated quantities : ")


      for(i <- 0 to items.length-1){

        print(quantity(i) + " " )

      } 

      println("")
   
    }else{//if not enough quantity displat msg

      println("Not enough quantity to sell ")

    }

  }else{//if item does not exist display the msg

    println("The item '" + item + "' does not exists")

  }

}

displayInventory()
println("")

restockItem("Rice",30)
println("")

sellItem("Rice",50)
println("")

