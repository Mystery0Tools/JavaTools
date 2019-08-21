package vip.mystery0.tools.kotlin.model.exception

/**
 * @author mystery0
 * @date 2019-08-21
 */
class CollectionException :RuntimeException{
    constructor()

    constructor(message: String) : super(message)

    constructor(message: String, cause: Throwable) : super(message, cause)
}