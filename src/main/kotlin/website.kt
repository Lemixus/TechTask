fun main() {
    val str =
        "Volvo released a new car with the following spec: V6 236HP. It will cost \$22647 and going to be sold in New York only"

    println(
        "Article: $str\n" +
        "Title: ${shortTitle(str)}")
}


fun shortTitle(article: String): String {
    var str = ""
    var spaceCount = 0

    return if (article.length > 25) {
        for (char in article) {
            if (char == ' ')
                spaceCount += 1
            if (spaceCount == 4)
                break
            else
                str += char
        }
        str += "..."
        str
    } else
        article
}