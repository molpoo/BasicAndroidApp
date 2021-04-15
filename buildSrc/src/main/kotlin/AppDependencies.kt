import org.gradle.api.artifacts.dsl.DependencyHandler

object AppDependencies {
    //std lib
    private const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    //android ui
    private const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    private const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    private const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
    private const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    private const val material = "com.google.android.material:material:${Versions.material}"
    private const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    private const val viewmodelLifecycleKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleKtx}"
    private const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtx}"
    private const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    private const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    // dagger
    const val dagger = "com.google.dagger:hilt-android:${Versions.dagger}"

    const val daggerCompiler = "com.google.dagger:hilt-compiler:${Versions.dagger}"

    //test libs
    private const val junit = "junit:junit:${Versions.junit}"
    private const val extJUnit = "androidx.test.ext:junit:${Versions.extJunit}"
    private const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    val appLibraries = arrayListOf<String>().apply {
        add(kotlinStdLib)
        add(coreKtx)
        add(fragmentKtx)
        add(appcompat)
        add(constraintLayout)
        add(material)
        add(timber)
        add(viewmodelLifecycleKtx)
        add(lifecycleKtx)
        add(navigationFragment)
        add(navigationUI)
    }

    val androidTestLibraries = arrayListOf<String>().apply {
        add(extJUnit)
        add(espressoCore)
    }

    val testLibraries = arrayListOf<String>().apply {
        add(junit)
    }
}

//util functions for adding the different type dependencies from build.gradle.kts file
fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}