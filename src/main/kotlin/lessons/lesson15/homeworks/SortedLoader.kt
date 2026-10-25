package org.example.lessons.lesson15.homeworks

class SortedLoader: Materials() {
    fun addSorted(material: String) {
        val existing = extractMaterials()
        val all = existing + material
        all.sorted().forEach { addMaterial(it) }
    }
}