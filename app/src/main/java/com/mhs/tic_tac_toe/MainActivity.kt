package com.mhs.tic_tac_toe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity(),View.OnClickListener {

    val playerOneSelections = arrayListOf<Int>()
    val playerTwoSelections = arrayListOf<Int>()

    private var isActiveP1 = true
    private var isActiveP2 = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btnTryAgain.setOnClickListener(this)
    }

    private fun isWinner(pOne : ArrayList<Int>,pTwo : ArrayList<Int>){

        //Check Winner
        if(playerOneSelections.size ==3 || playerTwoSelections.size == 3){
            var winner = 0

            //Row 1
            if(pOne.contains(1) && pOne.contains(2) && pOne.contains(3))
                winner = 1
            if(pTwo.contains(1) && pTwo.contains(2) && pTwo.contains(3))
                winner = 2

            //Row 2
            if(pOne.contains(4) && pOne.contains(5) && pOne.contains(6))
                winner = 1
            if(pTwo.contains(4) && pTwo.contains(5) && pTwo.contains(6))
                winner = 2

            //Row 3
            if(pOne.contains(7) && pOne.contains(8) && pOne.contains(9))
                winner = 1
            if(pTwo.contains(7) && pTwo.contains(8) && pTwo.contains(9))
                winner = 2


            //Col 1
            if(pOne.contains(1) && pOne.contains(4) && pOne.contains(7))
                winner = 1
            if(pTwo.contains(1) && pTwo.contains(4) && pTwo.contains(7))
                winner = 2

            //Col 2
            if(pOne.contains(2) && pOne.contains(5) && pOne.contains(8))
                winner = 1
            if(pTwo.contains(2) && pTwo.contains(5) && pTwo.contains(8))
                winner = 2

            //Col 3
            if(pOne.contains(3) && pOne.contains(6) && pOne.contains(9))
                winner = 1
            if(pTwo.contains(3) && pTwo.contains(6) && pTwo.contains(9))
                winner = 2


            //cross 1
            if(pOne.contains(1) && pOne.contains(5) && pOne.contains(9))
                winner = 1
            if(pTwo.contains(1) && pTwo.contains(5) && pTwo.contains(9))
                winner = 2

            //cross 1
            if(pOne.contains(3) && pOne.contains(5) && pOne.contains(7))
                winner = 1
            if(pTwo.contains(3) && pTwo.contains(5) && pTwo.contains(7))
                winner = 2


            when(winner){
                1 -> {
                    Toast.makeText(this, "Won Player One", Toast.LENGTH_SHORT).show()
                }
                2 -> {
                    Toast.makeText(this, "Won Player Two", Toast.LENGTH_SHORT).show()
                }
                else ->{
                    Toast.makeText(this,"an even-game",Toast.LENGTH_SHORT).show()
                    btnTryAgain.isVisible = true
                }
            }
        }
    }

    override fun onClick(view : View) {
        when(view.id){
            R.id.btn1 -> {
                if(playerOneSelections.size != 3 && playerTwoSelections.size != 3){
                    if(isActiveP1){
                        isActiveP1 = false
                        isActiveP2 = true
                        playerOneSelections.add(1)
                        view.btn1.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                    }
                    else{ //active p2
                        isActiveP1 = true
                        isActiveP2 = false
                        playerTwoSelections.add(1)
                        view.btn1.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
                    }
                }
                view.btn1.isEnabled = false
                isWinner(playerOneSelections, playerTwoSelections)
            }
            R.id.btn2 -> {
                if(playerOneSelections.size != 3 && playerTwoSelections.size != 3){
                    if(isActiveP1){
                        isActiveP1 = false
                        isActiveP2 = true
                        playerOneSelections.add(2)
                        view.btn2.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                    }
                    else{ //active p2
                        isActiveP1 = true
                        isActiveP2 = false
                        playerTwoSelections.add(2)
                        view.btn2.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
                    }
                }

                view.btn2.isEnabled = false
                isWinner(playerOneSelections, playerTwoSelections)
            }
            R.id.btn3 -> {
                if(playerOneSelections.size != 3 && playerTwoSelections.size != 3){
                    if(isActiveP1){
                        isActiveP1 = false
                        isActiveP2 = true
                        playerOneSelections.add(3)
                        view.btn3.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                    }
                    else{ //active p2
                        isActiveP1 = true
                        isActiveP2 = false
                        playerTwoSelections.add(3)
                        view.btn3.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
                    }
                }

                view.btn3.isEnabled = false
                isWinner(playerOneSelections, playerTwoSelections)

            }
            R.id.btn4 -> {
                if(playerOneSelections.size != 3 && playerTwoSelections.size != 3){
                    if(isActiveP1){
                        isActiveP1 = false
                        isActiveP2 = true
                        playerOneSelections.add(4)
                        view.btn4.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                    }
                    else{ //active p2
                        isActiveP1 = true
                        isActiveP2 = false
                        playerTwoSelections.add(4)
                        view.btn4.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
                    }
                }

                view.btn4.isEnabled = false
                isWinner(playerOneSelections, playerTwoSelections)

            }
            R.id.btn5 -> {
                if(playerOneSelections.size != 3 && playerTwoSelections.size != 3){
                    if(isActiveP1){
                        isActiveP1 = false
                        isActiveP2 = true
                        playerOneSelections.add(5)
                        view.btn5.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                    }
                    else{ //active p2
                        isActiveP1 = true
                        isActiveP2 = false
                        playerTwoSelections.add(5)
                        view.btn5.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
                    }
                }

                view.btn5.isEnabled = false
                isWinner(playerOneSelections, playerTwoSelections)

            }
            R.id.btn6 -> {
                if(playerOneSelections.size != 3 && playerTwoSelections.size != 3){
                    if(isActiveP1){
                        isActiveP1 = false
                        isActiveP2 = true
                        playerOneSelections.add(6)
                        view.btn6.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                    }
                    else{ //active p2
                        isActiveP1 = true
                        isActiveP2 = false
                        playerTwoSelections.add(6)
                        view.btn6.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
                    }
                }

                view.btn6.isEnabled = false
                isWinner(playerOneSelections, playerTwoSelections)

            }
            R.id.btn7 -> {
                if(playerOneSelections.size != 3 && playerTwoSelections.size != 3){
                    if(isActiveP1){
                        isActiveP1 = false
                        isActiveP2 = true
                        playerOneSelections.add(7)
                        view.btn7.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                    }
                    else{ //active p2
                        isActiveP1 = true
                        isActiveP2 = false
                        playerTwoSelections.add(7)
                        view.btn7.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
                    }
                }

                view.btn7.isEnabled = false
                isWinner(playerOneSelections, playerTwoSelections)
            }
            R.id.btn8 -> {
                if(playerOneSelections.size != 3 && playerTwoSelections.size != 3){
                    if(isActiveP1){
                        isActiveP1 = false
                        isActiveP2 = true
                        playerOneSelections.add(8)
                        view.btn8.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                    }
                    else{ //active p2
                        isActiveP1 = true
                        isActiveP2 = false
                        playerTwoSelections.add(8)
                        view.btn8.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
                    }
                }
                view.btn8.isEnabled = false
                isWinner(playerOneSelections, playerTwoSelections)

            }
            R.id.btn9 -> {
                if(playerOneSelections.size != 3 && playerTwoSelections.size != 3){
                    if(isActiveP1){
                        isActiveP1 = false
                        isActiveP2 = true
                        playerOneSelections.add(9)
                        view.btn9.setBackgroundColor(resources.getColor(android.R.color.holo_red_dark))
                    }
                    else{ //active p2
                        isActiveP1 = true
                        isActiveP2 = false
                        playerTwoSelections.add(9)
                        view.btn9.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
                    }
                }
                view.btn9.isEnabled = false
                isWinner(playerOneSelections, playerTwoSelections)
            }

            R.id.btnTryAgain -> {
                playerOneSelections.clear()
                playerTwoSelections.clear()

                isActiveP1 = true
                isActiveP2 = false

                //reset color
                btn1.setBackgroundColor(resources.getColor(R.color.grey))
                btn2.setBackgroundColor(resources.getColor(R.color.grey))
                btn3.setBackgroundColor(resources.getColor(R.color.grey))
                btn4.setBackgroundColor(resources.getColor(R.color.grey))
                btn5.setBackgroundColor(resources.getColor(R.color.grey))
                btn6.setBackgroundColor(resources.getColor(R.color.grey))
                btn7.setBackgroundColor(resources.getColor(R.color.grey))
                btn8.setBackgroundColor(resources.getColor(R.color.grey))
                btn9.setBackgroundColor(resources.getColor(R.color.grey))

                //enable btns
                btn1.isEnabled = true
                btn2.isEnabled = true
                btn3.isEnabled = true
                btn4.isEnabled = true
                btn5.isEnabled = true
                btn6.isEnabled = true
                btn7.isEnabled = true
                btn8.isEnabled = true
                btn9.isEnabled = true
            }
        }

        println("p1 $playerOneSelections")
        println("p2 $playerTwoSelections")
    }
}
