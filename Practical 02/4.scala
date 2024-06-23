def Decreasing(ticketPrice:Double, attendees:Int) = (ticketPrice - 5)*(attendees + 20)

def Increasing(ticketPrice:Double, attendees:Int)= (ticketPrice + 5)*(attendees - 20)

def cost(attendee:Int) = 500 + (3 * attendee)

def profitComparison(ticketPrice:Double, attendees:Int)={

  println("Profit when decreasing ticket price : Rs." + ( Decreasing(ticketPrice, attendees) - cost(attendees + 20) )) 
  println("Profit when increasing ticket price : Rs." + ( Increasing(ticketPrice, attendees) - cost(attendees - 20) )) 

}

profitComparison(15, 120)

