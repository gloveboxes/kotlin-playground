

import com.xenomachina.argparser.ArgParser
import com.xenomachina.argparser.SystemExitException
import com.xenomachina.argparser.default
import com.xenomachina.argparser.mainBody
import java.io.File


enum class OptimizationMode { GOOD, FAST, CHEAP }

/**
 * These are the arguments to our program. Each of the properties uses a delegate from an ArgParser, which maps it to
 * option(s) or positional argument(s).
 */
class ExampleArgs(parser: ArgParser) {
//    val verbose by parser.flagging("-v", "--verbose",
//        help = "enable verbose mode")
//
//    val name by parser.storing("-N", "--name",
//        help = "name of the widget").default("John Doe")

    val size by parser.storing("-s", "--size",
        help = "size of the plumbus") { toInt() }

//    val includeDirs by parser.adding("-I",
//        help = "directory to search for header files") { File(this) }
//
//    val optimizeFor by parser.mapping(
//        "--good" to OptimizationMode.GOOD,
//        "--fast" to OptimizationMode.FAST,
//        "--cheap" to OptimizationMode.CHEAP,
//        help = "what to optimize for")
//
//    val sources by parser.positionalList("SOURCE",
//        help = "source filename",
//        sizeRange = 1..Int.MAX_VALUE)
//
//    val destination by parser.positional("DEST",
//        help = "destination filename")
}


fun main (args : Array<String>) {

    println("hello")

    val parsedArgs = ArgParser(args).parseInto(::ExampleArgs)



    var dave = Person("Dave", age = 56)
    dave.display()
}






class Person (var name: String, var age: Int){
    var numbers = listOf<Int>(0,1,2,3,4,5,6,7,8,9,10)
    fun display(){
        println("Hello $name, you are $age years old")

        for ( i:Int in numbers) println(i)
    }
}