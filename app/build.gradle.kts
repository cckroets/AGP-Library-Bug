plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.composedynamicfeaturebug"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.composedynamicfeaturebug"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(project(":mylibrary"))
    implementation(libs.androidx.junit)
    androidTestImplementation("junit:junit:4.12")
    androidTestImplementation(libs.androidx.activity.compose)
    androidTestImplementation("androidx.test:rules:1.4.0")
}
