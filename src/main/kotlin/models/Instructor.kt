package org.example.models

class Instructor {
    private val nom: String
    private var anysExp: Int
    private var cotxe: Cotxe

    constructor(nom: String, anysExp: Int, cotxe: Cotxe){
        this.nom = nom
        this.anysExp = anysExp
        this.cotxe = cotxe
    }

    public fun getNom(): String{
        return this.nom
    }

    public fun assignarPractica(alumne: Alumne
                                , practica: Practica): Boolean{
        var practicaAssignada: Boolean = false

        if (alumne.getTeorica()) { // Té teòrica aprovada
            practica.setAlumne(alumne)
            practicaAssignada = true
        }

        return practicaAssignada
    }

    public fun consultarNombrePractiques(practiques: MutableList<Practica>): Int{
        var numPractiques: Int = 0

        for (practica in practiques){
            var instructorPractica: Instructor
            instructorPractica = practica.getInstructor()

            if (instructorPractica.getNom() == this.nom){
                numPractiques++
            }

        }

        return numPractiques
    }

    override fun equals(unAltreInstructor: Any?): Boolean {
        if (this === unAltreInstructor) return true
        if (javaClass != unAltreInstructor?.javaClass) return false

        unAltreInstructor as Instructor

        if (anysExp != unAltreInstructor.anysExp) return false
        if (nom != unAltreInstructor.nom) return false
        if (cotxe != unAltreInstructor.cotxe) return false

        return true
    }

}