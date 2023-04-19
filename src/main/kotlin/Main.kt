import kotlin.math.max

fun main() {
 val equals =evenNums(listOf(2,3,1,6,8,10))
    println(equals)
   val hasA= startsA(listOf("Joan","Allan","Abdul","Ian","Ted"))
    println(hasA)
    val double=doubleItems(mutableListOf(2,5,9,3))
    println(double)
    val result=maxMin(listOf(21,12,4,5,2))
    println(result)
    val bets=alphaBet(listOf("Joan","Gloria","Talia","Joy","Carol","Kathomi"))
    println(bets)
    val multiply = productNums(listOf(3,2,1,4,5))
    println(multiply)


}
//Write a function that takes a list of integers and returns the sum of all the even numbers in the list.
fun evenNums(nums:List<Int>):Int{
    var sum=0
    for (n in nums){
        if (n%2==0){
            sum+=n
        }
    }
    return sum
}
//Write a function that takes a list of strings and returns a new list with all the strings that start
// with the letter "A".
fun startsA(sent:List<String>):List<String>{
    var listA= mutableListOf<String>()
    for (s in sent){
        if (s.startsWith('A')){
          listA.addAll(listOf(s))
        }
    }
    return listA
}

//Write a function that takes a list of integers and returns a new list with all the elements doubled.

fun doubleItems(numbers:List<Int>):List<Int>{
    var doubledList= mutableListOf<Int>()
    for (num in numbers){
        doubledList.addAll(listOf(num*2))
    }
    return doubledList

}

//Write a function that takes two lists of integers and returns a new list with all the elements that
// are present in both lists.
//fun checkPresent(list1:List<Int>,list2:List<Int>):List<Int>{

//}

//Write a function that takes a list of integers and returns the maximum and minimum values in
// the list as a Pair.
fun maxMin(numerals:List<Int>):Pair<Int,Int>{
    var maximum= numerals.max()
    var minimum=numerals.min()
    return Pair(maximum,minimum)
}

//Write a function that takes a list of strings and returns a new list with all the strings
// sorted in alphabetical order.
fun alphaBet(names:List<String>):List<String>{
    var sortedList= mutableListOf<String>()
    sortedList.addAll(names.sorted())
    return sortedList
}

//Write a function that takes a list of integers and returns the product of all the numbers in the list.
fun productNums(numb:List<Int>):Int{
    var product=1
    for (n in numb){
        product*=n
    }
    return product
}
//Write a function that takes a list of strings and returns the length of the longest string in the list.
fun giveLength(len:List<String>):Int{
for (l in len){
    l.length
}
}

//Write a function that takes a list of strings and a delimiter and returns a new string that concatenates
// all the strings in the list with the delimiter between them.

//fun concatString(con:List<String>){

//}