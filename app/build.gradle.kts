plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.kapt")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.adoptadog"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.adoptadog"
        minSdk = 29
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11

    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("com.google.firebase:firebase-analytics") {
        exclude(group = "com.google.android.gms", module = "play-services-measurement")
        exclude(group = "com.google.android.gms", module = "play-services-measurement-sdk-api")
    }

    implementation("com.google.firebase:firebase-auth")
    implementation("com.google.firebase:firebase-firestore")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.15.1")
    kapt("com.github.bumptech.glide:compiler:4.15.1")

    // RecyclerView
    implementation("androidx.recyclerview:recyclerview:1.3.1")

    // Room
    implementation("androidx.room:room-runtime:2.5.0")
    kapt("androidx.room:room-compiler:2.5.0")
    implementation("androidx.room:room-ktx:2.5.0")

    // Volley
    implementation("com.android.volley:volley:1.2.0")
}
