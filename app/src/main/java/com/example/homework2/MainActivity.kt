package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var cost: TextView
    //Pokeball Costs
    private val pokeballCost =200
    private val greatballCost = 600
    private val ultraballCost = 800
    private val masterballCost = 100000
    //Potion Costs
    private val potionCost = 200
    private val superpotionCost = 700
    private val hyperpotionCost = 1500
    private val maxpotionCost = 2500
    //TM Costs
    private val voltswitchCost = 25000
    private val hyperbeamCost = 50000
    private val thunderpunchCost = 50000
    private val gigadrainCost = 100000

    //totalCost
    private var totalCost = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemImage1 = findViewById<ImageView>(R.id.itemimage1)
        val itemImage2 = findViewById<ImageView>(R.id.itemimage2)
        val itemImage3 = findViewById<ImageView>(R.id.itemimage3)
        val itemImage4 = findViewById<ImageView>(R.id.itemimage4)
        val pokeball_1 = findViewById<CheckBox>(R.id.pokeball_1)
        cost = findViewById(R.id.Cost)

        /***********POKEBALLS CHECKBOX ********************/

        //Pokeball 1

        pokeball_1.setOnClickListener {
            // This code will be executed when pokeball_1 is clicked
            if (pokeball_1.isChecked) {
                totalCost += pokeballCost
                itemImage1.setImageResource(R.drawable.pokeball)
            } else {
                totalCost -= pokeballCost
                itemImage1.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        //Pokeball 2
        val pokeball_2 = findViewById<CheckBox>(R.id.pokeball_2)

        pokeball_2.setOnClickListener {
            // This code will be executed when pokeball_2 is clicked
            if (pokeball_2.isChecked) {
                totalCost += greatballCost
                itemImage2.setImageResource(R.drawable.greatball)
            } else {
                totalCost -= greatballCost
                itemImage2.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        //Pokeball 3
        val pokeball_3 = findViewById<CheckBox>(R.id.pokeball_3)

        pokeball_3.setOnClickListener {
            // This code will be executed when pokeball_3 is clicked
            if (pokeball_3.isChecked) {
                totalCost += ultraballCost
                itemImage3.setImageResource(R.drawable.ultraball)
            } else {
                totalCost -= ultraballCost
                itemImage3.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        //Pokeball 4
        val pokeball_4 = findViewById<CheckBox>(R.id.pokeball_4)

        pokeball_4.setOnClickListener {
            // This code will be executed when pokeball_3 is clicked
            if (pokeball_4.isChecked) {
                totalCost += masterballCost
                itemImage4.setImageResource(R.drawable.masterball)
            } else {
                totalCost -= masterballCost
                itemImage4.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        /***********POTIONS CHECKBOX ********************/

        //Potion 1

        val potion_1 = findViewById<CheckBox>(R.id.potion_1)
        potion_1.setOnClickListener {
            // This code will be executed when potion_1 is clicked
            if (potion_1.isChecked) {
                totalCost += potionCost
                itemImage1.setImageResource(R.drawable.potion)
            } else {
                totalCost -= potionCost
                itemImage1.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        //potion 2
        val potion_2 = findViewById<CheckBox>(R.id.potion_2)

        potion_2.setOnClickListener {
            // This code will be executed when potion_2 is clicked
            if (potion_2.isChecked) {
                totalCost += superpotionCost
                itemImage2.setImageResource(R.drawable.superpotion)
            } else {
                totalCost -= superpotionCost
                itemImage2.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        //potion 3
        val potion_3 = findViewById<CheckBox>(R.id.potion_3)

        potion_3.setOnClickListener {
            // This code will be executed when potion_3 is clicked
            if (potion_3.isChecked) {
                totalCost += hyperpotionCost
                itemImage3.setImageResource(R.drawable.hyperpotion)
            } else {
                totalCost -= hyperpotionCost
                itemImage3.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        //Potion 4
        val potion_4 = findViewById<CheckBox>(R.id.potion_4)

        potion_4.setOnClickListener {
            // This code will be executed when potion_4 is clicked
            if (potion_4.isChecked) {
                totalCost += maxpotionCost
                itemImage4.setImageResource(R.drawable.maxpotion)
            } else {
                totalCost -= maxpotionCost
                itemImage4.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }


        /***********TMS CHECKBOX ********************/

        //TMS 1

        val TM_1 = findViewById<CheckBox>(R.id.PP_Up)
        TM_1.setOnClickListener {
            // This code will be executed when PP_up is clicked
            if (TM_1.isChecked) {
                totalCost += voltswitchCost
                itemImage1.setImageResource(R.drawable.ppup)
            } else {
                totalCost -= voltswitchCost
                itemImage1.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        //TM_2
        val TM_2 = findViewById<CheckBox>(R.id.Ether)

        TM_2.setOnClickListener {
            // This code will be executed when Ether is clicked
            if (TM_2.isChecked) {
                totalCost += hyperbeamCost
                itemImage2.setImageResource(R.drawable.ether)
            } else {
                totalCost -= hyperbeamCost

                itemImage2.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        //TM_3
        val TM_3 = findViewById<CheckBox>(R.id.MaxRevive)

        TM_3.setOnClickListener {
            // This code will be executed when MaxReview is clicked
            if (TM_3.isChecked) {
                totalCost += thunderpunchCost
                itemImage3.setImageResource(R.drawable.maxrevive)
            } else {
                totalCost -= thunderpunchCost
                itemImage3.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        //TM_4
        val TM_4 = findViewById<CheckBox>(R.id.RareCandy)

        TM_4.setOnClickListener {
            // This code will be executed when RareCandy is clicked
            if (TM_4.isChecked) {
                totalCost += gigadrainCost
                itemImage4.setImageResource(R.drawable.rarecandy)
            } else {
                totalCost -= gigadrainCost
                itemImage4.setImageResource(R.drawable.white)
            }

            // Format the total cost and set it to the TextView
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)
        }

        /*****************RADIO GROUP BUTTONS*******************/
        val storeRadioGroup: RadioGroup = findViewById(R.id.Store)


        storeRadioGroup.setOnCheckedChangeListener { _, checkedId ->
            //reset price
            totalCost = 0
            cost.text = "Cost: ₽%.2f".format(totalCost / 1.0)

            //uncheck all boxes
            uncheckAllCheckboxes()

            // Hide all dropdowns
            hideAllDropdowns()

            // Show the dropdown corresponding to the selected RadioButton
            when (checkedId) {
                R.id.pokeballButton -> showDropdown(R.id.pokeballDropdown)
                R.id.potionButton -> showDropdown(R.id.potionDropdown)
                R.id.specialButton -> showDropdown(R.id.specialDropdown)

            }
        }
    }

    /*****************FUNCTIONS*******************/

    private fun hideAllDropdowns() {
        val pokeballDropdown: LinearLayout = findViewById(R.id.pokeballDropdown)
        val potionDropdown: LinearLayout = findViewById(R.id.potionDropdown)
        val tmDropdown: LinearLayout = findViewById(R.id.specialDropdown)

        // Hide all dropdowns
        pokeballDropdown.visibility = LinearLayout.GONE
        potionDropdown.visibility = LinearLayout.GONE
        tmDropdown.visibility = LinearLayout.GONE

    }

    private fun showDropdown(dropdownId: Int) {
        val dropdownView: LinearLayout = findViewById(dropdownId)
        dropdownView.visibility = LinearLayout.VISIBLE
    }

    private fun uncheckAllCheckboxes() {

        ///Pokeball Ids
        val pokeball_1 = findViewById<CheckBox>(R.id.pokeball_1)
        val pokeball_2 = findViewById<CheckBox>(R.id.pokeball_2)
        val pokeball_3 = findViewById<CheckBox>(R.id.pokeball_3)
        val pokeball_4 = findViewById<CheckBox>(R.id.pokeball_4)

        //Potion Ids
        val potion_1 = findViewById<CheckBox>(R.id.potion_1)
        val potion_2 = findViewById<CheckBox>(R.id.potion_2)
        val potion_3 = findViewById<CheckBox>(R.id.potion_3)
        val potion_4 = findViewById<CheckBox>(R.id.potion_4)

        //Special Ids
        val PP_Up = findViewById<CheckBox>(R.id.PP_Up)
        val Ether = findViewById<CheckBox>(R.id.Ether)
        val MaxRevive = findViewById<CheckBox>(R.id.MaxRevive)
        val RareCandy = findViewById<CheckBox>(R.id.RareCandy)

        //Image Ids
        var itemImage1 = findViewById<ImageView>(R.id.itemimage1)
        var itemImage2 = findViewById<ImageView>(R.id.itemimage2)
        var itemImage3 = findViewById<ImageView>(R.id.itemimage3)
        var itemImage4 = findViewById<ImageView>(R.id.itemimage4)
        val imageRowLayout = findViewById<LinearLayout>(R.id.imageRow)
        imageRowLayout.visibility = View.VISIBLE

        //make all pics "dissappear"
        itemImage1.setImageResource(R.drawable.white)
        itemImage2.setImageResource(R.drawable.white)
        itemImage3.setImageResource(R.drawable.white)
        itemImage4.setImageResource(R.drawable.white)

        // Uncheck all checkboxes
        pokeball_1.isChecked = false
        pokeball_2.isChecked = false
        pokeball_3.isChecked = false
        pokeball_4.isChecked = false
        potion_1.isChecked = false
        potion_2.isChecked = false
        potion_3.isChecked = false
        potion_4.isChecked = false
        PP_Up.isChecked = false
        Ether.isChecked = false
        MaxRevive.isChecked = false
        RareCandy.isChecked = false

    }


    }

