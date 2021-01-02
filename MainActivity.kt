package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number1 : Int? =null
    var number2 : Int? =null
    var result_ : Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun topla(view : View){
         number1 = firstNumber.text.toString().toIntOrNull()
         number2 = secondNumber.text.toString().toIntOrNull()

        if(number1 == null || number2 == null) textView2.text="Please enter number:  "
        else {
             result_=number1!!+number2!!
            textView2.text="result  : ${result_}"
        }

    }
    fun cikart(view : View){
         number1 = firstNumber.text.toString().toIntOrNull()
         number2 = secondNumber.text.toString().toIntOrNull()

        if(number1 == null || number2 == null) textView2.text="Please enter number:  "
        else {
            result_=number1!!-number2!!
            textView2.text="result  : ${result_}"
        }

    }
    fun bol(view : View){
         number1 = firstNumber.text.toString().toIntOrNull()
         number2 = secondNumber.text.toString().toIntOrNull()
         var result4 : Double?

        if(number1 == null || number2 == null) textView2.text="Please enter number:  "
        else {
             result4=number1!!.toDouble()/number2!!.toDouble()
            textView2.text="result  : ${result4}"
        }

    }
    fun carp(view : View){
         number1 = firstNumber.text.toString().toIntOrNull()
         number2 = secondNumber.text.toString().toIntOrNull()

        if(number1 == null || number2 == null) textView2.text="Please enter number:  "
        else {
             result_=number1!!*number2!!
            textView2.text="result  : ${result_}"
        }
    }
    fun mod(view : View){
        number1 = firstNumber.text.toString().toIntOrNull()
        number2 = secondNumber.text.toString().toIntOrNull()

        if(number1 == null || number2 == null) textView2.text="Please enter number:  "
        else {
            result_=number1!! % number2!!
            textView2.text="result  : ${result_}"
        }

    }
    fun exponentmod(view : View){//Long a çevirdiğimde number!=0 kontrolü yapamıyorum !!!!!!
        var number3 = firstNumber.text.toString().toIntOrNull()
        var number4 = secondNumber.text.toString().toIntOrNull()
        var result_2 : Long =1
        if(number3 == null || number4==null){ textView2.text="Please enter number:  "
            return }
        else{
            while (number4 !=0){
                result_2 *= number3!!.toLong()
                number4=number4!!-1
                println(number4)
            }
            textView2.text="result  : ${result_2}"
        }
    }
    fun factorialmod(view : View){
        var result3 : Long?
        number1 = firstNumber.text.toString().toIntOrNull()
        result3=number1!!.toLong()
        println(result3)
        if(number1 == null){ textView2.text="Please enter number:  "
        return }
        else {
            number1 = number1!!-1
            while (number1 !=0){
                result3= result3!! * (number1!!.toLong())
                println(result3)
                number1=number1!!-1
            }
        }
        textView2.text="result  : ${result3}"
    }
}