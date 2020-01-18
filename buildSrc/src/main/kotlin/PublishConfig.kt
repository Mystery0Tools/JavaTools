import java.io.File

/**
 * @author mystery0
 * Create at 2019/12/25
 */
object PublishConfig {
    const val POM_GROUP_ID = "vip.mystery0.tools"
    const val POM_ARTIFACT_ID = "java.tools"
    const val POM_VERSION = "1.2.7"

    const val POM_REPO_NAME = "tools"
    const val POM_USER_ORG = "mystery00"
    const val POM_UPLOAD_NAME = "JavaTools"
    const val POM_DESC = "Java 后台开发常用工具类"
    const val POM_WEBSITE = "https://github.com/Mystery0Tools/JavaTools"

//        const val POM_SNAPSHOT = true
    const val POM_SNAPSHOT = false
    //    const val NEXUS_URL = "http://nexus3.mystery0.vip"
    const val NEXUS_URL = "http://192.168.2.80:8081"

    lateinit var sourceFiles: Set<File>
}