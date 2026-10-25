package org.example.lessons.lesson15.homeworks

class DictionaryLoader : Materials() {
    fun addFromDictionary(dictionary: Map<String, String>) {
        val existing = extractMaterials()

        // ключи в обратном порядке — в начало
        dictionary.keys.reversed().forEach { addMaterial(it) }
        // существующие материалы
        existing.forEach { addMaterial(it) }
        // значения — в конец
        dictionary.values.forEach { addMaterial(it) }
    }
}