package mailbox.kotlin

import java.util.*

fun main(args: Array<String>) {
    println("歡迎使用郵局便利箱")
    var scanner = Scanner(System.`in`)
    print("請輸入想寄送物品的長度(cm)：")
    var length = scanner.nextFloat()
    print("請輸入想寄送物品的寬度(cm)：")
    var width = scanner.nextFloat()
    print("請輸入想寄送物品的高度(cm)：")
    var height = scanner.nextInt()
    val box3 = Box3();
    val box5 = Box5();
    if (box3.validate(length, width, height)) {
        println("請使用Box3便利箱")
    } else if (box5.validate(length, width, height)){
        println("請使用Box5便利箱")
    } else {
        println("請使用其他便利箱")
    }

}

open class Box(var length: Float, var width: Float, var height: Int) {

    open fun validate(length : Float, width : Float, height : Int) : Boolean =
        (this.length >= length && this.width >= width && this.height >= height)

}

class Box3 : Box(23f, 14f, 13)

class Box5 : Box(39.5f, 27.5f, 23)