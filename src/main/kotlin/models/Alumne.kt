package org.example.models

class Alumne {
    private var nom: String
    private var edat: Int
    private var teorica: Boolean
    private var quantPractiques: Int

    constructor(nom: String, edat: Int){
        this.nom = nom
        this.edat = edat
        this.teorica = false
        this.quantPractiques = 0
    }

    fun incrementarPractiques(){
        this.quantPractiques++
    }

    fun getQuantPractiques(): Int{
        return this.quantPractiques
    }

    fun aprovarTeorica(){
        this.teorica = true
    }

    fun getTeorica(): Boolean{
        return this.teorica
    }
}