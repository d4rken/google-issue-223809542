package sdmaid.test.pkg.issue5272

import android.accessibilityservice.AccessibilityService
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class ACSService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        Log.i("ACSService", "event=$event")
    }

    override fun onInterrupt() {
        Log.w("ACSService", "onInterrupt")
    }
}