package com.belinda.notekeeper

object DataManager {

    val courses = mutableMapOf<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    fun addNote(course: CourseInfo, noteTitle: String, noteText: String): Int {
        val note = NoteInfo(course, noteTitle, noteText)
        notes.add(note)
        return notes.lastIndex
    }


    private fun initializeCourses(){

        var course = CourseInfo(course_id = "android_intents", title = "Android Programming with Intents")
        courses.set(course.course_id, course)

        course = CourseInfo(course_id = "android_async", title = "Android Async Programming and Services" )
        courses.set(course.course_id, course)

        course = CourseInfo(course_id = "java_lang", title = "Java Fundamentals")
        courses.set(course.course_id, course)

        course = CourseInfo(course_id = "java_core", title = "The Core Platform")
        courses.set(course.course_id, course)

    }

    private fun initializeNotes(){
        var course = courses["android_intents"]
        var note = NoteInfo(course, "Dynamic intent resolution", "This course is getting very interesting")
        notes.add(note)

        course = courses["android_async"]
        note = NoteInfo(course, "Manual intent resolution", text = "Still have a lot to learn")
        notes.add(note)

        course = courses["java_lang"]
        note = NoteInfo(course,"Fundamentals of Java", "Can't wait to dive in and see what is available")
        notes.add(note)

        course = courses["android_async"]
        note = NoteInfo(course, "Manual intent resolution", text = "Still have a lot to learn")
        notes.add(note)

        course = courses["java_lang"]
        note = NoteInfo(course,"Fundamentals of Java", "Can't wait to dive in and see what is available")
        notes.add(note)





    }

}