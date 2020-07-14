package sample

fun Kaijyo(n: Long) : Long {
    return if (n <= 1) {
        n
    } else {
        n * Kaijyo(n - 1)
    }
}
fun main(){
    println(Kaijyo(5))
}