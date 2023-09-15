# Temperature Converter Library

The temperatureconverter library serves as demonstration for a cross-platform (iOS and Android) library developed with Kotlin.

## Requirements

- Android Studio Giraffe 2022.3
- Xcode 14 (if you want to build the library for iOS)
- JDK 17

## Development

**iOS:** Build the XCFramework and copy it to the iOS app.

```bash
./gradlew assembleXCFramework

```

**Android:** Publish the library to your local maven repo.

```bash
./gradlew publishAndroidDebugPublicationToMavenLocal
```

Add mavenLocal() to the 'dependencyResolutionManagement' section in your app's `settings.gradle`.

Then add the following line to the dependencies section in your app's `build.gradle`.

```
implementation("de.naemiluna.temperatureconverter:temperatureConverter-android:0.1.0")
```