import scala.io.StdIn.readInt;

def Normal(hours:Int): Int = hours*250;
def OT(hours:Int) : Int = hours * 85;
def income(normalHours:Int,otHours:Int):Int= Normal(normalHours) + OT (otHours);
def tax(income:Int):Double =income*.12;
def takeHomeSalary(h1:Int,h2:Int):Double =
income(h1,h2)-tax(income(h1,h2))

@main
def run()={
    printf("Enter no of nomal Hours: ")
    var normalH = readInt()
    printf("Enter the no.of OT hours: ")
    var otH = readInt ()
    println(takeHomeSalary(normalH, otH))
}
