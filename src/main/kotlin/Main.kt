import edu.hm.cs.coolpile.util.runOnHost
import java.io.File

fun main() {
    val codeFile = File("code")
    val ret = runOnHost("./zefix.sh")
    println(ret)
}

