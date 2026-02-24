package hello.world

import Screen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    data class Screen(val title: String, val screen: String)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Screen()
        }
    }
}

/*
 = "org.jetbrains.compose.animation:animation:1.10.1"
 = "org.jetbrains.compose.animation:animation-graphics:1.10.1"
 = "org.jetbrains.compose.components:components-resources:1.10.1"
 = "org.jetbrains.compose.desktop:desktop:1.10.1"
 = "org.jetbrains.compose.components:components-animatedimage:1.10.1"
 = "org.jetbrains.compose.components:components-splitpane:1.10.1"
 = "org.jetbrains.compose.desktop:desktop-jvm-windows-x64:1.10.1"
 = "org.jetbrains.compose.desktop:desktop-jvm-linux-arm64:1.10.1"
 = "org.jetbrains.compose.desktop:desktop-jvm-linux-x64:1.10.1"
 = "org.jetbrains.compose.desktop:desktop-jvm-macos-arm64:1.10.1"
 = "org.jetbrains.compose.desktop:desktop-jvm-macos-x64:1.10.1"
 = "org.jetbrains.compose.ui:ui-test-junit4:1.10.1"
 = "org.jetbrains.compose.desktop:desktop-jvm-windows-x64:1.10.1"
 = "org.jetbrains.compose.foundation:foundation:1.10.1"
 = "org.jetbrains.compose.html:html-core:1.10.1"
 = "org.jetbrains.compose.html:html-svg:1.10.1"
 = "org.jetbrains.compose.html:html-test-utils:1.10.1"
 = "org.jetbrains.compose.material:material:1.10.1"
 = "org.jetbrains.compose.material3:material3:1.10.1"
 = "org.jetbrains.compose.ui:ui-tooling-preview:1.10.1"
 = "org.jetbrains.compose.runtime:runtime:1.10.1"
 = "org.jetbrains.compose.runtime:runtime-saveable:1.10.1"
 = "org.jetbrains.compose.ui:ui:1.10.1"
 = "org.jetbrains.compose.ui:ui-test:1.10.1"
 = "org.jetbrains.compose.ui:ui-tooling:1.10.1"
 = "org.jetbrains.compose.hot-reload:hot-reload-runtime-api:1.0.0-rc01"
'*/
