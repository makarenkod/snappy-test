package dm

import org.xerial.snappy.Snappy

object Main {
  def main(args: Array[String]): Unit = {
    val input = "Hello snappy-java! Snappy-java is a JNI-based wrapper of Snappy, a fast compresser/decompresser."
    val compressed = Snappy.compress(input.getBytes("UTF-8"))
    val uncompressed = Snappy.uncompress(compressed)

    val result = new String(uncompressed, "UTF-8")
    println(result)
  }
}

