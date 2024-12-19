// Top-level build file where you can add configuration options common to all sub-projects/modules.
dependencies {
    classpath 'com.google.gms:google-services:4.4.0' // Or latest version
}

plugins {

    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}