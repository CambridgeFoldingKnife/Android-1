package com.drojian.test_demo1.kotlin_base

import java.util.Locale

//输入一个车，输入汽车返回“四个轮子”。 输入“自行车”。返回“两个轮子“


fun main() {
    val car = Vehicle("小轿车")
    car.intro()

    val car2 = Vehicle("小轿车", 10)
    car2.intro()
}


class Vehicle(var type: String) {
    var wheels: Int = 0

    init {
        wheels = when (type) {
            "小轿车" -> 4
            "大货车" -> 8
            "自行车" -> 2
            else -> 0
        }
    }

    //次级构造函数中，委托给主构造的参数 也能进入init代码块中进行校验。
    //所以这个type会进入init中
    constructor(type: String, wheels: Int) : this(type) {
        this.wheels = wheels
    }

    fun intro() {
        println("车辆类型：${type},轮胎数量：${wheels}")
    }
}