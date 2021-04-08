package com.example.inheritanceandextension

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Call 'Parent' Class Directly
        var parent = Parent()
        parent.sayHello()
        // 2. Call 'Child' Class
        var child = Child()
        child.myHello()

        testStringExtension()
    }
    // String Extension Test
    fun testStringExtension() {
        var original = "Hello"
        var added = " Guys~"
        // Using 'plus' method, we can add string
        Log.d("Extension","if we add variable 'added', the value is ${original.plus(added)}")
    }
}
// Inheritance Test
open class Parent {
    var hello: String = "Hello!!"
    fun sayHello() {
        Log.d("Extension","${hello}")
    }
}
class Child: Parent() {
    fun myHello() {
        hello = "Hello~~"
        sayHello()
    }
}

// Method Override Test
open class BaseClass {
    open fun opened() {
    }
    fun not0pend() {
    }
}
class ChildClass: BaseClass() {
    override fun opened() {
    }
    // override fun not0pend() makes error
}

// Property Override Test
open class BaseClass2 {
    open var opened: String = "I am"
}
class ChildClass2: BaseClass2() {
    override var opened: String ="You are"
}

// Extension Example
fun String.plus(word: String): String{
    return this + word
}