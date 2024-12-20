pluginManagement {
    repositories {
        google() // Ensure this line works for Android dependencies
        mavenCentral() // For Kotlin and other libraries
        gradlePluginPortal() // For Gradle plugins
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Disallow repositories in individual module files
    repositories {
        google() // Primary repository for Android dependencies
        mavenCentral() // For other libraries
    }
}

rootProject.name = "listingApp"
include(":app")
