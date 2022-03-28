/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */
buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }

    dependencies {
        classpath(libs.kotlinGradlePlugin)
        classpath(libs.androidGradlePlugin)
        classpath(libs.googleServicesGradlePlugin)
        classpath(libs.mokoGradlePlugin)
        classpath(libs.mobileMultiplatformGradlePlugin)
        classpath(libs.kotlinSerializationGradlePlugin)
    }
}
allprojects {
    plugins.withId("org.gradle.maven-publish") {
        group = "dev.icerock.moko"
        version = libs.versions.mokoGeoVersion.get()
    }
}

tasks.register("clean", Delete::class).configure {
    delete(rootProject.buildDir)
}
