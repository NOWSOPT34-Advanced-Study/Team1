plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.simhwa.team1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.simhwa.team1"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":core:ui"))
    implementation(project(":data:local"))
    implementation(project(":data:memoPage"))

    implementation(project(":data:signIn"))
    implementation(project(":domain:signIn"))
    implementation(project(":feature:signIn"))

    implementation(project(":data:signUp"))
    implementation(project(":domain:signUp"))
    implementation(project(":feature:signUp"))

    implementation(project(":data:memoPage"))
    implementation(project(":domain:memoPage"))
    implementation(project(":feature:memoPage"))

    implementation(project(":feature:clippingPage"))
    implementation(project(":feature:searchPage"))
    implementation(project(":feature:myPage"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.activity.ktx)

    // hilt
    kapt(libs.hilt.android.compiler)
    implementation(libs.hilt.android)
}