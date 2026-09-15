actual fun devCredential(name: String): String? = System.getenv(name)?.takeIf { it.isNotBlank() }
