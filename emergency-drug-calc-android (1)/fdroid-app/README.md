# Emergency Drug Calculator (Android, F-Droid ready)

Offline paediatric emergency drug dose calculator. A native Android shell (one Activity, no dependencies, no permissions) displays the bundled page in `app/src/main/assets/index.html`. Doses are edited in that file.

## Before you publish
1. **Pick an app ID** and replace `io.github.yourname.emergencydrugcalc` in `app/build.gradle.kts`, the Java package folders and `metadata/*.yml`.
2. **Add a LICENSE file** with an OSI-approved licence (F-Droid requires one; the draft metadata says GPL-3.0-or-later) and keep the same value in the metadata file.
3. **Check rights to the dose data.** The doses come from the STRS (NHS) Emergency Drug Calculator card. Ask STRS for permission or credit them as the source, and confirm any local rules for publishing clinical software.
4. **Check the dose arithmetic.** Infusion "mg in 50 ml" amounts were derived from the card's "1 ml/hr = X" definitions. Have a clinician or pharmacist verify them.

## Build
Open in Android Studio (JDK 17) and run, or from the command line:
```
gradle wrapper        # one time, creates ./gradlew (commit it)
./gradlew assembleDebug
```
APK: `app/build/outputs/apk/debug/`.

## Publish on F-Droid
1. Push to a public Git host (GitHub, GitLab or Codeberg), commit `gradlew` and `gradle/wrapper`, and tag `v1.0`.
2. Fork https://gitlab.com/fdroid/fdroiddata, add `metadata/io.github.yourname.emergencydrugcalc.yml` (edit the URLs), and open a merge request. Reviewers build it from source.
3. The store listing text comes from `fastlane/metadata/android/en-US/`. Add a 512px `images/icon.png` and screenshots under `phoneScreenshots/` there when you have them.

## Get an APK without installing anything
Push this folder to a GitHub repository. The workflow in `.github/workflows/build-apk.yml` builds a debug APK automatically: open the repository's Actions tab, open the latest "Build APK" run, and download the `emergency-drug-calculator-debug-apk` artifact. Install it on a phone by opening the file (allow installs from your browser or file manager when asked). Debug APKs are fine for testing; F-Droid builds and signs its own release.
