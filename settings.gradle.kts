pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Team1"
include(":app")
include(":data:auth")
include(":domain:auth")
include(":core:common")
include(":feature:auth")
include(":core:ui")

include(":data:mainPage")
include(":domain:mainPage")
include(":feature:mainPage")

include(":data:myPage")
include(":feature:myPage")
include(":domain:myPage")

