plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.car.launcher"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.car.launcher"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation("com.github.lavalike:commons:0.0.3")
    implementation("com.github.lavalike:darkstatusbar:1.0.0")
    implementation("com.github.lavalike:network:0.0.3")
    implementation("com.github.lavalike:adapter:0.2.0")
    implementation("com.github.lavalike:permission:0.0.3")
    implementation("com.github.lavalike:circle-imageview:0.0.1")
    implementation("com.github.lavalike:utils:0.0.2")
    implementation("com.github.lavalike:dynamic-blur:1.0.4")


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}