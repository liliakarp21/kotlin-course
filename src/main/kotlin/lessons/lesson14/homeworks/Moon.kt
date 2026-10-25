package org.example.lessons.lesson14.homeworks

class Moon(val isVisible: Boolean, val phase: String) {
    fun showPhase(){
        println("Луна $isVisible, фаза луны $phase")
    }
}
