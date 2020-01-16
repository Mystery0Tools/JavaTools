import java.io.File

/**
 * @author mystery0
 * Create at 2019/12/25
 */
object PublishConfig {
    const val POM_GROUP_ID = "vip.mystery0.tools"
    const val POM_ARTIFACT_ID = "java.tools"
    const val POM_VERSION = "1.2.6"

    const val POM_REPO_NAME = "tools"
    const val POM_USER_ORG = "mystery00"
    const val POM_UPLOAD_NAME = "JavaTools"
    const val POM_DESC = "Java 后台开发常用工具类"
    const val POM_WEBSITE = "https://github.com/Mystery0Tools/JavaTools"

    lateinit var sourceFiles: Set<File>
}