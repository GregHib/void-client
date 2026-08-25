package awt

actual typealias Container = java.awt.Container

actual fun Container.getInsets(): Insets = Insets((this as java.awt.Container).insets)