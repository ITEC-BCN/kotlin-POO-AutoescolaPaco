package org.example.models

class Cotxe {
    private val marca: String
    private val model: String
    private var cv: Int
    private var cc: Float

    constructor(marca: String, model: String, cv: Int, cc: Float){
        this.marca = marca
        this.model = model
        this.cv = cv
        this.cc = cc
    }
}