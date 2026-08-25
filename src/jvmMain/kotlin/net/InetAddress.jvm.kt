package net

actual typealias InetAddress = java.net.InetAddress

actual fun getByName(host: String?): InetAddress = InetAddress.getByName(host)