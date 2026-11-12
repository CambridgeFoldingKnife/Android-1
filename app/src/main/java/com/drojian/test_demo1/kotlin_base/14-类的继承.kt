package com.drojian.test_demo1.kotlin_base

fun main() {
    val dog = Dog("旺财")
    dog.makeSound()

    val cat = Cat("小猫")
    cat.makeSound()
}

/**
 * 创建一个Animal类，并定义一个makeSound()方法。
 */
open class Animal(val name: String) {
    open fun makeSound() {
        println("$name 正在发出声音")
    }
}

/**
 * 创建一个Dog类，继承自Animal类，并重写makeSound()方法。
 */
class Dog(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name 正在汪汪大叫")
    }
}

/**
 * 创建一个Cat类，继承自Animal类，并重写makeSound()方法。
 */
class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name 正在喵喵叫")
    }
}
