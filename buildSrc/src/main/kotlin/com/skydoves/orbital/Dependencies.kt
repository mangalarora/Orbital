package com.skydoves.orbital

object Versions {
  internal const val ANDROID_GRADLE_PLUGIN = "7.3.0"
  internal const val ANDROID_GRADLE_SPOTLESS = "6.7.0"
  internal const val GRADLE_NEXUS_PUBLISH_PLUGIN = "1.1.0"
  internal const val KOTLIN = "1.7.20"
  internal const val KOTLIN_GRADLE_DOKKA = "1.7.10"
  internal const val KOTLIN_BINARY_VALIDATOR = "0.12.1"

  internal const val COMPOSE = "1.3.1"
  internal const val COMPOSE_COMPILER = "1.3.2"
  internal const val COROUTINES = "1.6.4"

  internal const val RULES = "1.4.0"
  internal const val ANDROIDX_TEST = "1.4.0"
  internal const val ANDROIDX_JUNIT = "1.1.3"

  internal const val HILT = "2.42"
  internal const val MATERIAL = "1.5.0"
  internal const val COMPOSE_ACTIVITY = "1.4.0"
  internal const val COMPOSE_CONSTRAINT = "1.0.0"

  internal const val LANDSCAPIST_GLIDE = "2.1.0"

  internal const val ANDROIDX_TEST_VERSION = "1.4.0"
  internal const val BASE_PROFILE_VERSION = "1.2.0"
  internal const val MACRO_BENCHMARK_VERSION = "1.1.0"
  internal const val ANDROIDX_UI_AUTOMATOR_VERSION = "2.2.0"
}

object Dependencies {
  const val androidGradlePlugin =
    "com.android.tools.build:gradle:${Versions.ANDROID_GRADLE_PLUGIN}"
  const val gradleNexusPublishPlugin =
    "io.github.gradle-nexus:publish-plugin:${Versions.GRADLE_NEXUS_PUBLISH_PLUGIN}"
  const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
  const val spotlessGradlePlugin =
    "com.diffplug.spotless:spotless-plugin-gradle:${Versions.ANDROID_GRADLE_SPOTLESS}"
  const val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.KOTLIN_GRADLE_DOKKA}"
  const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.HILT}"
  const val kotlinBinaryValidator =
    "org.jetbrains.kotlinx:binary-compatibility-validator:${Versions.KOTLIN_BINARY_VALIDATOR}"

  const val material = "com.google.android.material:material:${Versions.MATERIAL}"
  const val composeUI = "androidx.compose.ui:ui:${Versions.COMPOSE}"
  const val composeRuntime = "androidx.compose.runtime:runtime:${Versions.COMPOSE}"
  const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.COMPOSE}"
  const val composeFoundationLayout =
    "androidx.compose.foundation:foundation-layout:${Versions.COMPOSE}"
  const val composeActivity = "androidx.activity:activity-compose:${Versions.COMPOSE_ACTIVITY}"
  const val composeMaterial = "androidx.compose.material:material:${Versions.COMPOSE}"
  const val composeMaterialIcon =
    "androidx.compose.material:material-icons-extended:${Versions.COMPOSE}"
  const val composeAnimation = "androidx.compose.animation:animation:${Versions.COMPOSE}"
  const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE}"
  const val composeConstraintLayout =
    "androidx.constraintlayout:constraintlayout-compose:${Versions.COMPOSE_CONSTRAINT}"
  const val landscapistGlide = "com.github.skydoves:landscapist-glide:${Versions.LANDSCAPIST_GLIDE}"

  const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"

  const val testRules = "androidx.test:rules:${Versions.RULES}"
  const val androidTestRunner = "androidx.test:runner:${Versions.ANDROIDX_TEST}"
  const val androidTestJunit = "androidx.test.ext:junit-ktx:${Versions.ANDROIDX_JUNIT}"
  const val composeJunitTest = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE}"

  const val BASE_PROFILE =
    "androidx.profileinstaller:profileinstaller:${Versions.BASE_PROFILE_VERSION}"
  const val MACRO_BENCHMARK =
    "androidx.benchmark:benchmark-macro-junit4:${Versions.MACRO_BENCHMARK_VERSION}"
  const val ANDROIDX_UI_AUTOMATOR =
    "androidx.test.uiautomator:uiautomator:${Versions.ANDROIDX_UI_AUTOMATOR_VERSION}"
  const val ANDROIDX_TEST_RUNNER = "androidx.test:runner:${Versions.ANDROIDX_TEST_VERSION}"
}
