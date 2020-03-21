package vip.mystery0.tools.kotlin.utils

/**
 * @author mystery0
 * Create at 2020/3/21
 */
private val CHN_NUMBER: Array<String> = arrayOf("零", "一", "二", "三", "四", "五", "六", "七", "八", "九")

/**
 * 权位
 */
private val CHN_UNIT = arrayOf("", "十", "百", "千")

/**
 * 节权位
 */
private val CHN_UNIT_SECTION = arrayOf("", "万", "亿", "万亿")

/**
 * 数字转为大写
 * @return 大写
 */
fun Int.toChinese(): String = toLong().toChinese()

fun Long.toChinese(): String {
    var numberValue = this
    val returnStr = StringBuilder()
    var needZero = false
    //节权位的位置
    var pos = 0
    if (numberValue == 0L) {
        //如果num为0，进行特殊处理。
        returnStr.insert(0, CHN_NUMBER[0])
    }
    while (numberValue > 0) {
        //是否是首位，首位特殊处理10
        val isFirst = numberValue < 10000
        val section = numberValue % 10000
        if (needZero) {
            returnStr.insert(0, CHN_NUMBER[0])
        }
        var sectionToChn = sectionNumToChn(section, isFirst)
        //判断是否需要节权位
        sectionToChn += if (section != 0L) CHN_UNIT_SECTION[pos] else CHN_UNIT_SECTION[0]
        returnStr.insert(0, sectionToChn)
        //判断section中的千位上是不是为零，若为零应该添加一个零。
        needZero = section in 1..999
        pos++
        numberValue /= 10000
    }
    return returnStr.toString()
}

/**
 * 将四位的section转换为中文数字
 */
private fun sectionNumToChn(section: Long, isFirst: Boolean): String {
    var sectionValue = section
    val isTwoLength = sectionValue in 10..19
    val returnStr = StringBuilder()
    //节权位的位置编号，0-3依次为个十百千;
    var unitPos = 0
    var zero = true
    while (sectionValue > 0) {
        val isFirstUnit = sectionValue < 10
        val v = (sectionValue % 10).toInt()
        if (v == 0) {
            if (!zero) {
                //需要补0，zero的作用是确保对连续的多个0，只补一个中文零
                zero = true
                returnStr.insert(0, CHN_NUMBER[v])
            }
        } else {
            //至少有一个数字不是0
            zero = false
            //数字v所对应的中文数字
            val tempStr = StringBuilder()
            if (isFirstUnit && isFirst) {
                if (!isTwoLength) {
                    tempStr.append(CHN_NUMBER[v])
                }
            } else {
                tempStr.append(CHN_NUMBER[v])
            }
            //数字v所对应的中文权位
            tempStr.append(CHN_UNIT[unitPos])
            returnStr.insert(0, tempStr)
        }
        //移位
        unitPos++
        sectionValue /= 10
    }
    return returnStr.toString()
}