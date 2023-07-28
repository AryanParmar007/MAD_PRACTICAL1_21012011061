 class car(
        Information: String,
        c_model: String,
        car_owner: String,
        miles_drive: Int,
        o_price: Double,
        c_price: Double
    ) {

     var Info:String = Information
     var mod:String = c_model
     var own:String = car_owner
     var md:Int = miles_drive
     var op:Double =o_price
     var cp:Double =c_price

     fun get_car_Info(){
         println("\n Car Information: $Info, $mod \n Car owner: $own \n miles_driven: $md \n Car original price:$op \n Current car price:$cp")
     }

 }

 fun main(){
     var car = arrayOf(car("BMW","2023","ARYAN",15466,5464.23,7944.5),
         car("BENZ","2020","DHRUV",15466,5464.23,7944.5),
         car("Rolls Royce","2021","KRISH",15466,5464.23,7944.5),
         car("Range Rover","2019","ANOS",15466,5464.23,7944.5))

     for(i in car){
         println("-----------------------------\n"+ i.get_car_Info())
     }

 }

