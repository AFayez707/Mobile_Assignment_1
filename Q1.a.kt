fun firstandlast(i: Int){

    var last= i%10
    var first = i
    while(first>=10){
        first/=10
    }
   println("First is $first and last is $last")
}

fun main(){
    firstandlast(1245)
}
