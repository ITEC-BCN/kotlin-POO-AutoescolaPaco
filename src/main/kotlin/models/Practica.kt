package org.example.models

import java.util.Date

class Practica {
    private var alumne: Alumne
    private val instructor: Instructor
    private val data: Date
    private var durada: Int

    constructor(alumne: Alumne, instructor: Instructor, data: Date){
        this.alumne = alumne
        this.instructor = instructor
        this.data = data
        this.durada = 0
    }

    fun setDurada(durada: Int){
        this.durada = durada
    }

    fun getAlumne(): Alumne{
        return this.alumne
    }

    fun setAlumne(alumne: Alumne){
        this.alumne = alumne
    }
}