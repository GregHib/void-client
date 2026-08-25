package awt

actual object MediaTrackerStatus {
    actual val LOADING: Int = 1
    actual val ABORTED: Int = 2
    actual val ERRORED: Int = 4
    actual val COMPLETE: Int = 8
}
