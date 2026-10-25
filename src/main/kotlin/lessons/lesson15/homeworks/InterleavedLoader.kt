package org.example.lessons.lesson15.homeworks

class InterleavedLoader : Materials() {
    fun addInterLeaved(newItems: List<String>){
        val existing = extractMaterials()
        val maxSize = maxOf(newItems.size, existing.size)
        for(k in 0 .. maxSize){
            if (k < newItems.size) addMaterial(newItems[k])
            if (k < existing.size) addMaterial(existing[k])
        }

    }
}