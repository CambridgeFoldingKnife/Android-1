package com.drojian.test_demo1.kotlin_base


fun main() {
    val man = Person4("wang5", 100)
    //man.intro()

    val women = Person5("lili", 18)
    women.intro2()

    val women2 = Person5("jingjing")
    women2.intro()
}


//1、次构造函数-无主构造函数
class Person4 {
    var name: String = ""
    var age: Int = 1

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun intro() {
        println("姓名：${name},年龄：${age}")
    }
}

//2、次构造函数-有主构造

class Person5(var name: String) {
    var age: Int? = 0
    var city: String = ""

    //init只会帮你交验主构造函数时候的属性值，这里的age不再主构造中，无法交验
    //对象初始化时候先主、再init、再次构造
    init {
        //require 是前面是条件为false时候抛出异常。
        require(name.isEmpty()) { "姓名不能为空！" }
        //require(age > 18) { "年龄需要大于18岁！" }
    }

    //若类有主构造函数，所有次构造函数必须直接或间接委托给主构造（使用 this()）
    constructor(name: String, age: Int) : this(name) {
        this.age = age//额外初始化。
    }

    constructor(name: String, age: Int, city: String) : this(name) {
        this.age = age//额外初始化。
        this.city = city
    }

    fun intro() {
        println("姓名：${name}")
    }

    fun intro2() {
        println("姓名：${name},年龄：${age}")
    }

    fun intro3() {
        println("姓名：${name},年龄：${age},城市：${city}")
    }
}