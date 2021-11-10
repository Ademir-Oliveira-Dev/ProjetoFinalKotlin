package model

import java.util.*

class Student(id: String?, name: String?, email: String?, birthDate: Date?) : Person(id, name, email, birthDate),
    Evaluation {
    private val average = 0.0

    private val courses: List<Course> = ArrayList()
    private val approvedCourses: MutableMap<String?, Course?> = HashMap()

    override fun getAverage(): Double {
        return average;
    }

    val addAlunoCurso = hashMapOf<String?, String>()
    fun enrollToCourse( course: Course?) {
        addAlunoCurso.put(id.toString()!!, courses.toString()!!)
    }

    fun registerApprovedCourse(course: Course) {
        approvedCourses[course.code] = course
    }

    fun isCourseApproved(courseCode: String?): Boolean {
        return (approvedCourses.contains(id))
    }

    fun isAttendingCourse(courseCode: String?): Boolean {
        return (addAlunoCurso.contains(id))
    }

    override fun getApprovedCourses(): List<Course>? {
        return ArrayList()
    }

    override fun toString(): String {
        return "Student {" + super.toString() + "}"
    }
}
