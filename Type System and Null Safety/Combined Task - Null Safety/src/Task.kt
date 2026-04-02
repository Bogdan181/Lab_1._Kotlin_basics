fun generateGreeting(name: String?): String {
    val displayName = name?.takeIf { it.isNotEmpty() } ?: "Guest"
    return "Welcome, $displayName!"
}