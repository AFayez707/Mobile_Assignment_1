fun SquareOdd(arr: IntArray):Int{
    var sum = 0
    for(i in arr)
    {
        if(i%2!=0)
            sum += i*i
    }
    return sum
}

fun main(){
    print (SquareOdd(intArrayOf(1, 2, 3, 4, 6, 5)))
}