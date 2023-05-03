
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {

    val compose_ui_version by extra("1.2.0")
    repositories {
        google()
        mavenCentral()
    }


    dependencies {
        classpath(Build.androidBuildTools)
        classpath(Build.hiltAndroidGradlePlugin)
        classpath(Build.kotlinGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}
plugins {
    id("org.jmailen.kotlinter") version "3.7.0" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}