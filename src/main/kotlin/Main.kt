package org.example

import org.example.models.Alumne
import org.example.models.Cotxe
import org.example.models.Instructor
import org.example.models.Practica
import java.time.LocalDate

fun main() {
    var practiquesAutoescola: MutableList<Practica> = mutableListOf()
    var paco: Instructor = Instructor("Paco", 0, Cotxe("BMW", "S1", 200, 2000.0f))
    var maria: Instructor = Instructor("Maria", 10, Cotxe("BMW", "S3", 200, 2000.0f))
    var dani: Alumne = Alumne("Dani", 19)

    practiquesAutoescola.add(Practica(dani, paco, LocalDate.now()))
    practiquesAutoescola.add(Practica(dani, paco, LocalDate.now()))
    practiquesAutoescola.add(Practica(dani, maria, LocalDate.now()))

    print("L'instructor ${paco.getNom()} ha fet ${paco.consultarNombrePractiques(practiquesAutoescola)} pràctiques")
}

