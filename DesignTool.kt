package com.example.designtool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // visibility modifier test
        var child = Child()
        child.callVariables()

        // call 'Parent' class directly
        var parent = Parent()
        Log.d("visibility","Parent: the value of defaultVal is ${parent.defaultVal}")
        Log.d("visibility","Parent: the value of internalVal is ${parent.internalVal}")
    }
}

// design 'abstract' class
abstract class Animal {
    fun walk() {
        Log.d("abstract","I am walking")
    }
    abstract fun move()
}
// realization
class Bird: Animal() {
    override fun move() {
        Log.d("abstract","fly and move")
    }
}
// design 'interface'
interface InterfaceKotlin {
    var variable: String
    fun get()
    fun set()
}
// realization
class KotlinImpl: InterfaceKotlin {
    override var variable: String = "init value"
    override fun get() {
        Log.d("interface","I got 'get' function")
    }

    override fun set() {
        Log.d("interface","I got 'set' function")
    }
}
// parent class for visibility modifier test
open class Parent {
    private val privateVal = 1
    protected open val protectedVal = 2
    internal val internalVal = 3
    val defaultVal = 4
}
// child class
class Child: Parent() {
    fun callVariables() {
        // privateVal is not working
        Log.d("visibility","the value of child: protectedVal is ${protectedVal}")
        Log.d("visibility","the value of child: internalVal is ${internalVal}")
        Log.d("visibility","the value of child: defaultVal is ${defaultVal}")
    }
}