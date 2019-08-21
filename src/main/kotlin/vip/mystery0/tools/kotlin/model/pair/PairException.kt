package vip.mystery0.tools.kotlin.model.pair

/**
 * @author mystery0
 * @date 2019-07-20
 */
open class PairException : RuntimeException {
    constructor()

    constructor(message: String) : super(message)

    constructor(message: String, cause: Throwable) : super(message, cause)
}

internal class NoSuchKeyException : PairException {
    constructor()

    constructor(message: String) : super(message)

    constructor(message: String, cause: Throwable) : super(message, cause)
}
