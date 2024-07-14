case class Book (title:String, author:String, isbn:String)

var updatedSet = Set.empty[Book]
var i=0
var flag = false

val book1 = Book("Title1", "Author1", "ISBN1")
val book2 = Book("Title2", "Author2", "ISBN2")
val book3 = Book("Title3", "Author3", "ISBN3")
val book5 = Book("Title5", "Author2", "ISBN5")

var bookSet = Set(book1, book2, book3, book5)

def addBook(x:Book) = bookSet=bookSet+x //to add a book to a set

def removeBook(isbn:String) = { // to remove a book from a set
  
  bookSet.foreach{book => if(book.isbn != isbn) updatedSet = updatedSet + book  }

}

def findBook(isbn:String) = {//search for a specific book

  bookSet.foreach{book => if(book.isbn == isbn) flag=true}
  status(flag)

}

def status(flag:Boolean) = if (flag==true) println("Book is in the library") else println("Book is not in the library")

def Display() = {
  
  bookSet.foreach{ book => println("Title : "+ book.title + " " + " | Author : " + book.author + " " + " | ISBN : "+ book.isbn)  }

}

def searchByTitle(title:String) = {

  bookSet.foreach{book => if(book.title == title) println("Title : "+ book.title + " " + " | Author : " + book.author + " " + " | ISBN : "+ book.isbn)  }

}

def searchByAuthor(author:String) = {

  bookSet.foreach{book => if(book.author == author) println("Title : "+ book.title + " " + " | Author : " + book.author + " " + " | ISBN : "+ book.isbn)  }

}


val book4 = Book("Title4", "Author4", "ISBN4")//create a new book

//addBook(book4)       //added the book to set
//removeBook("ISBN3") //removed the book
//print(updatedSet)   //to print new set
//findBook("ISBN1")  //to find a book in the library
//Display()         //to display current book list
//searchByTitle("Title2")      //to search a book by title
searchByAuthor("Author2")      //to search a book by author
