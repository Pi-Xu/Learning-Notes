import scala.collection.mutable

class ChecksumAccumulator {
    private var sum = 0
    def add(b: Byte): Unit = { sum += b }
    def checksum(): Int = ~ (sum & 0xFF) + 1
}

object ChecksumAccumulator {
    
    private val cache = mutable.Map.empty[String, Int]
    
    def calculate(s: String): Int =
        if (cache.contains(s))
            cache(s) // checks the cache to see if the passed string is already contained as a key in the map
        else {
            val acc = new ChecksumAccumulator
            for (c <- s)
                // s is a string
                acc.add(c.toByte)
                val cs = acc.checksum()
                cache += (s -> cs)
                cs
        }
}

