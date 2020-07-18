package com.belinda.notekeeper

import org.junit.Test

import org.junit.Assert.*

class DataManagerTest {

    @Test
    fun addNote() {
        val course = DataManager.courses.get("android_async")!!
        val noteTitle = "This is a title"
        val noteText = "This is a text"

        val index = DataManager.addNote(course, noteTitle, noteText)
        val note = DataManager.notes[index]

        assertEquals(course, note.course)
        assertEquals(noteTitle, note.title)
        assertEquals(noteText, note.text)



    }
}