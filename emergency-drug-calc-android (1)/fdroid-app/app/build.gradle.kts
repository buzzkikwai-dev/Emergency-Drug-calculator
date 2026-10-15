plugins { id("com.android.application") }
android {
    namespace = "io.github.yourname.emergencydrugcalc"
    compileSdk = 34
    defaultConfig {
        applicationId = "io.github.yourname.emergencydrugcalc"   // change to your own ID
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes { release { isMinifyEnabled = false } }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
    dependenciesInfo { includeInApk = false; includeInBundle = false }
}
