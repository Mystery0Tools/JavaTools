package vip.mystery0.tools.kotlin.utils

/**
 * @author mystery0
 * @date 2019-07-22
 */
fun <R> doByTry(`try`: (Unit) -> R): Pair<R?, Exception?> = Unit.doByTry(`try`)
fun <R> doByTry(`try`: (Unit) -> R, finally: (() -> Unit)?): Pair<R?, Exception?> = Unit.doByTry(`try`, finally)

fun <T : Any?, R> T.doByTry(`try`: (T) -> R): Pair<R?, Exception?> = doByTry(`try`, null)
fun <T : Any?, R> T.doByTry(`try`: (T) -> R, finally: (() -> Unit)?): Pair<R?, Exception?> = try {
    val r = `try`(this)
    Pair(r, null)
} catch (e: Exception) {
    Pair(null, e)
} finally {
    finally?.invoke()
}

fun <R> doNoException(`try`: (Unit) -> R): R? = Unit.doNoException(`try`)
fun <R> doNoException(`try`: (Unit) -> R, finally: (() -> Unit)?): R? = Unit.doNoException(`try`, finally)

fun <T : Any?, R> T.doNoException(`try`: (T) -> R): R? = doNoException(`try`, null)
fun <T : Any?, R> T.doNoException(`try`: (T) -> R, finally: (() -> Unit)?): R? = try {
    `try`(this)
} catch (e: Exception) {
    e.printStackTrace()
    null
} finally {
    finally?.invoke()
}

fun tryOrBoolean(`try`: (Unit) -> Unit) = Unit.tryOrBoolean(`try`)
fun tryOrBoolean(`try`: (Unit) -> Unit, finally: (() -> Unit)?) = Unit.tryOrBoolean(`try`, finally)

fun <T : Any?> T.tryOrBoolean(`try`: (T) -> Unit): Boolean = tryOrBoolean(`try`, null)
fun <T : Any?> T.tryOrBoolean(`try`: (T) -> Unit, finally: (() -> Unit)?): Boolean = try {
    `try`(this)
    true
} catch (e: Exception) {
    e.printStackTrace()
    false
} finally {
    finally?.invoke()
}