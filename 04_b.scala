import scala.io.StdIn.readInt

def attendeesCount(tPrice:Int):Int=120+(15-tPrice)/5*20
def revenue(tPrice:Int):Int = attendeesCount (tPrice)*tPrice
def calculateCost(tPrice:Int):Int=500+ 3*attendeesCount(tPrice)
def calculateProfit(tPrice:Int):Int = revenue(tPrice)- calculateCost(tPrice)

@main
def run()= {
    printf("Enter the ticket price: ")
    var ticketPrice = readInt ()
    println(calculateProfit(ticketPrice))
    //print(calculateProfit(5), calculateProfit(10), calculateProfit(15), calculateProfit(20))
}