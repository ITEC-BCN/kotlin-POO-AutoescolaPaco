package org.example.models

import java.time.LocalDate
import java.util.Date

class Practica {
    private var alumne: Alumne
    private val instructor: Instructor
    private val data: LocalDate
    private var durada: Int

    constructor(alumne: Alumne, instructor: Instructor, data: LocalDate){
        this.alumne = alumne
        this.instructor = instructor
        this.data = data
        this.durada = 0
    }

    public fun setDurada(durada: Int){
        this.durada = durada
    }

    public fun getAlumne(): Alumne{
        return this.alumne
    }

    public fun setAlumne(alumne: Alumne){
        this.alumne = alumne
    }

    public fun getInstructor(): Instructor{
        return this.instructor
    }
}