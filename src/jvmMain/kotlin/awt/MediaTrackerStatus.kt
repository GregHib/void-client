package awt

import java.awt.MediaTracker

actual object MediaTrackerStatus {
    actual val LOADING: Int = java.awt.MediaTracker.LOADING
    actual val ABORTED: Int = java.awt.MediaTracker.ABORTED
    actual val ERRORED: Int = java.awt.MediaTracker.ERRORED
    actual val COMPLETE: Int = MediaTracker.COMPLETE
}
