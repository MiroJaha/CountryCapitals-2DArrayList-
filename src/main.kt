fun main(){
    val answers= arrayListOf<ArrayList<String>>()
    var country:String
    var capital:String

    println("Please Enter 3 Countries With its Capital")
    for(i in 1..3){
        print("Please Enter Country Number $i: ")
        country= readLine().toString()
        print("Please Enter The Capital of $country: ")
        capital= readLine().toString()
        answers.add(arrayListOf(country,capital))
    }

    println("\nThe Countries you Entered With Capitals Are:")
    for(i in answers)
        println(i)
}