// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply true
    alias(libs.plugins.googleGmsGoogleServices) apply true


}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:8.0.0")
        classpath ("com.google.gms:google-services:4.4.2")

    }
}
