package com.drojian.test_demo1.kotlin_base

fun main() {
    //listDemo()
    mapDemo()
}

fun listDemo() {
    //1、只读列表--listof
    val types = listOf<String>("Android", "java", "kotlin")
    println(types[0])
    println(types.size)
    println(types.last())


    //可变数组-- mutablelistof
    val mutableList = mutableListOf<String>("android", "java")
    mutableList.add("kotlin")
    mutableList.remove("java")
    mutableList[0] = "android2"
    println(mutableList)

}

fun mapDemo() {
    //1、只读map 键和值都支持任何数据存储
    val score = mapOf("jack" to 90, "tom" to 60, true to 80)
    println(score.keys)
    println(score.values)
    println(score["tom"])

    //2、可修改map
    // Map<String, List<TimeItem> >
    val mutableScore = mutableMapOf("jams" to 50)
    mutableScore["zhangsan"] = 100  //新加一个健值对
    println(mutableScore)



}

