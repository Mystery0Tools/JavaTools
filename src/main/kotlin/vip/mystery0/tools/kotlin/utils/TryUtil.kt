package vip.mystery0.tools.kotlin.utils

/**
 * @author mystery0
 * @date 2019-07-22
 */
fun doByTry(trys: () -> Unit): Exception? = doByTry(trys, null)

fun doByTry(trys: () -> Unit, finally: (() -> Unit)?): Exception? {
    return try {
        trys.invoke()
        null
    } catch (e: Exception) {
        e
    } finally {
        finally?.invoke()
    }
}

fun tryOrBoolean(trys: () -> Unit): Boolean = tryOrBoolean(trys, null)

fun tryOrBoolean(trys: () -> Unit, finally: (() -> Unit)?): Boolean {
    return try {
        trys.invoke()
        true
    } catch (e: Exception) {
        e.printStackTrace()
        false
    } finally {
        finally?.invoke()
    }
}

fun tryBoolean(trys: () -> Boolean): Boolean = tryBoolean(trys, null)

fun tryBoolean(trys: () -> Boolean, finally: (() -> Unit)?): Boolean {
    return try {
        trys.invoke()
    } catch (e: Exception) {
        e.printStackTrace()
        false
    } finally {
        finally?.invoke()
    }
}