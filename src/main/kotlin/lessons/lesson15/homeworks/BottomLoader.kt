package org.example.lessons.lesson15.homeworks

class BottomLoader : Materials() {
    fun addToBottom(material: String) {
        val existing = extractMaterials()          // забираем всё
        addMaterial(material)                      // кладём новую строку
        existing.forEach { addMaterial(it) }       // возвращаем старое поверх
    }
}