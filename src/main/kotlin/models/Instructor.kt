package org.example.models

class Instructor {
    private val nom: String
    private var anysExp: Int
    private var cotxe: Cotxe

    constructor(nom: String, cotxe: Cotxe){
        this.nom = nom
        this.anysExp = 0
        this.cotxe = cotxe
    }

    fun assignarPractica(alumne: Alumne, practica: Practica): Boolean{
        var practicaAssignada: Boolean = false

        if (alumne.getTeorica()) {
            practica.setAlumne(alumne)
            practicaAssignada = true
        }

        return practicaAssignada
    }
}