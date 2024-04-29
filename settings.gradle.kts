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

rootProject.name = "team1"
include(":app")
include(":core:common")

include(":core:ui")
include(":data:local")

include(":data:signIn")
include(":domain:signIn")
include(":feature:signIn")

include(":data:memoPage")
include(":domain:memoPage")
include(":feature:memoPage")

include(":data:signUp")
include(":domain:signUp")
include(":feature:signUp")
include(":feature:clippingPage")
include(":feature:searchPage")
include(":feature:myPage")
