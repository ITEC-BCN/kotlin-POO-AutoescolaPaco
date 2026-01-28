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

    public fun incrementarPractiques(){
        this.quantPractiques++
    }

    public fun getQuantPractiques(): Int{
        return this.quantPractiques
    }

    public fun aprovarTeorica(){
        this.teorica = true
    }

    public fun getTeorica(): Boolean{
        return this.teorica
    }
}