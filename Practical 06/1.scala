import scala.collection.mutable

var inventry1 = mutable.Map.empty[Int,Item]
var inventry2 = mutable.Map.empty[Int,Item]
var flag,flagID = false

case class Item (name:String, quantity:Int, price:Double)
var size,i =0

def getData(map:mutable.Map[Int,Item],num:Int):mutable.Map[Int,Item]={//getting inputs from the user

  var newMap = map

  print("Enter the number of items in the inventory "+ num +" : ")
  size = scala.io.StdIn.readInt()
  print("\n")

  for(i<-0 to size-1){

    print("Enter item name : ")
    var name = scala.io.StdIn.readLine()
  
    print("Enter quantity : ")
    var quantity = scala.io.StdIn.readInt()
  
    print("Enter price : ")
    var price = scala.io.StdIn.readDouble()

    println("\n")

    var item1 = Item(name,quantity,price)

    newMap = newMap + (i->item1);


  }

  newMap

}

def retrieve(inventry:mutable.Map[Int,Item],num:Int) = {//retrieve all product names


  for(i<-0 to inventry.size-1){

    println("Inventory "+num +" Item "+ (i+1) + " : Name - " + inventry(i).name +"| Quantity - " + inventry(i).quantity /*+"| Price -  "+ inventry(i).price*/)

  }

}

def totalValue(inventry:mutable.Map[Int,Item],num:Int)={//get the value of all items

  var total = 0.0

  for(i<-0 to inventry.size-1){
    
    total = total + inventry(i).price*inventry(i).quantity

  }

  if(total!=0) println("The total value of the inventory "+num+" is : " +  f"$total%.2f" )

}

def checkEmptyOrNot(inventry:mutable.Map[Int,Item],num:Int)={
  
  val flag = inventry.isEmpty

  if(flag == true) println("Inventory "+num+" is empty") else println("Inventory "+num+" is not empty")

}

def merge(inventry1:mutable.Map[Int,Item],inventry2:mutable.Map[Int,Item]):mutable.Map[Int,Item] = {

   var mergedInventry= mutable.Map.empty[Int,Item]

   mergedInventry = inventry1

   for(i<-0 to inventry2.size-1){

      mergedInventry = mergedInventry + ((i+inventry1.size)->inventry2(i))
  
   }

  mergedInventry

}

def updateQuantity(map:mutable.Map[Int,Item]):mutable.Map[Int,Item]={

  print("Enter the key value of your updating product : ")
  val x = scala.io.StdIn.readInt()

  for(i<-0 to map.size-1){

    if(map.contains(x)){

      flag = true

    }
  }

  if(flag == true){
   
      print("Enter new quantity : ")
      var Nquantity = scala.io.StdIn.readInt()

      val newItem = Item(map(i).name,Nquantity,map(i).price)

      map(i) = newItem
 
  }else{

      println("The item you are looking for does not exists")
  }


  map

}

def highestPrice(map:mutable.Map[Int,Item]){

  var max = map(i).price

  for(i<-0 to map.size-1){

    if(max <= map(i).price){

        max = map(i).price

    }

  }

  println("Highest price is : Rs. " + max)

}

def checkIdExists(map:mutable.Map[Int,Item],num:Int)={

    print("Enter the ID you are looking for : ")
    val ID = scala.io.StdIn.readInt()

  for(i<-0 to map.size-1){

    if(map.contains(ID)) flagID=true
    
  }

    if(flagID) println("Inventory "+num +" Item "+ (ID+1) + " : Name - " + map(ID).name +"| Quantity - " + map(ID).quantity +"| Price -  "+ map(ID).price) else println("Item does not exists")

}

var inventry_1 = getData(inventry1,1)
var inventry_2 = getData(inventry2,2)

println("")

retrieve(inventry_1,1)
retrieve(inventry_2,2)

println("")

var y = totalValue(inventry_1,1)
var z = totalValue(inventry_2,2)


println("")

checkEmptyOrNot(inventry_1,1)
checkEmptyOrNot(inventry_2,2)


println("")

var merged = merge(inventry_1,inventry_2)

retrieve(merged,3)

println("")

print(merged)

println("\n")

val updated = updateQuantity(merged)

println("\n\nAfter update the quantity : ")

retrieve(updated,3)

println("\n")

highestPrice(merged)

checkIdExists(inventry_1,1)
