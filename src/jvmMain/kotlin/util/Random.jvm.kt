package util

actual typealias Random = java.util.Random

actual fun random(): Double = Math.random()