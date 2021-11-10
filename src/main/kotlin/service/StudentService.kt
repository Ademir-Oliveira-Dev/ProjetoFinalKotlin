package service

import model.Student
import java.util.HashMap
import model.Course

class StudentService {
    private val students: MutableMap<String?, Student> = HashMap()
    fun subscribeStudent(student: Student) {
        students[student.id] = student
    }

    fun findStudent(studentId: String?): Student? {
        return if (students.containsKey(studentId)) {
            students[studentId]
        } else null
    }

    fun isSubscribed(studentId: String?): Boolean {
        if (students.containsKey(studentId)){
            students[studentId]
        }
        return false
    }

    fun showSummary() {
        println("A quantidade de alunos são: ${students.size}")
        println("${students.toList()}")
    }

    fun enrollToCourse(studentId: String?, course: Course?) {
        if (students.containsKey(studentId)) {
            students[studentId]!!.enrollToCourse(course)
        }
    }
}