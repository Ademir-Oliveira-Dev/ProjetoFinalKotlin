package service

import model.Student
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class StudentTest {

    val testes = StudentService()

    @Test
    fun findStudentTest() {

        val findStudent = StudentService()

        val estudante = Student("1001", "Gabriel Santos", "Gabriel.Santos@teste.com",
            null)

        findStudent.subscribeStudent(estudante)

        assertNotEquals(null, findStudent.findStudent("1001"))
    }

}