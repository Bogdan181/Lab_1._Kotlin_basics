fun requireValidString(text: String?): String {
    return text ?: throw IllegalArgumentException("Text cannot be null")
}