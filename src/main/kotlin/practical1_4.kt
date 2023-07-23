fun main() {
    print("Enter the number to check odd or even : ")
    var num = readLine()!!.toInt()
    if(num %2 ==0)
    {
        println("Number is even.")
    }
    else
    {
        println("Number is odd.")
    }
}
