package service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class CourseTest {

    val testeFun = CourseService()

    @Test
    fun showSummaryTest (){
        var Sum = CourseService()

        Assertions.assertEquals(null, Sum.getCourse("INTRO-CS-666"))

    }
}