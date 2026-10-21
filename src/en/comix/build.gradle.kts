import io.github.keiyoushi.gradle.api.ContentWarning

plugins {
    alias(kei.plugins.extension)
}

keiyoushi {
    // Separate name (and so source ID) and package so this test build can be
    // installed next to the official Comix extension
    name = "Comix (PR test)"
    pkgName = "en.comixtest"
    versionCode = 55
    contentWarning = ContentWarning.MIXED
    libVersion = "1.6"

    source {
        lang = "en"
        baseUrl {
            mirrors(
                "https://comix.to",
                "https://comix.ws",
            )
        }
    }

    deeplink {
        host("comix.to")
        host("www.comix.to")
        host("comix.ws")
        host("www.comix.ws")
        path("/title/..*")
    }
}
