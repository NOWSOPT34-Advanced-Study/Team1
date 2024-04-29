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
include(":data:signIn")
include(":domain:signIn")
include(":core:common")
include(":feature:signIn")
include(":core:ui")

include(":data:mainPage")
include(":domain:mainPage")
include(":feature:mainPage")

include(":data:signUp")
include(":feature:signUp")
include(":domain:signUp")

