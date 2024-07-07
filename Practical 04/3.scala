def toUpper(string:String) = string.toUpperCase()

/////////////////////////////////////////////////////

def toLower(string:String) = string.toLowerCase()

/////////////////////////////////////////////////////

var i=0

////////////////////////////////////////////////////

def formatNames(string:String,name:String) = { // string.length should equal to name.length

  var list = List.empty[Int]

  if(string.length == name.length){

    for(i <- 0 to name.length-1){

      if(name(i).isUpper) list:+=i else list:+=100

    }

    for(i <- 0 to name.length-1){
    
      if(list(i) != 100){

        print((string(list(i))).toUpper) 

      }else{

        print(string(i))

      }

    }
    println("")

  }else{

    println("String lengths are not equal")

  }

}

println("Using toUpper to 'Benny' => " + toUpper("Benny"))
println("")

print("Using 'ABcdefgh' format to 'Niroshan' => ")
formatNames( "Niroshan","ABcdefgh")
println("")

println("Using toLower to 'Saman' => " + toLower("Saman"))
println("")

print("Using 'AbcdeF' format to 'Kumara' => ")
formatNames("Kumara","AbcdeF")
println("")

