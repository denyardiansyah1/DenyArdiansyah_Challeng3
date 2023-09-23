package com.example.denyardiansyah_challeng2.baru.data

import com.example.denyardiansyah_challeng2.R

object DataDummy {
    private val image= arrayOf(
        R.drawable.ayam_bakar,
        R.drawable.ayam_goreng,
        R.drawable.cheesespagheti,
        R.drawable.sateayam,
        R.drawable.spicychickenwings,
        R.drawable.sushi,
        R.drawable.burger,
        R.drawable.chickengarlic,
        R.drawable.dumplings,
        R.drawable.fricepotato,
        R.drawable.pizza,



    )
    private val name= arrayOf(
        "Ayam Bakar",
        "Ayam Goreng",
        "Cheese Spaghetti",
        "Sate Ayam",
        "Spicy Chicken Wings",
        "Sushi",
        "Burger",
        "Chicken Garlic",
        "Dumplings",
        "Frice Potato",
        "Pizza"

    )
    private val price= arrayOf(
        "Rp. 10.000",
        "Rp. 20.000",
        "Rp. 30.000",
        "Rp. 40.000",
        "Rp. 50.000",
        "Rp. 60.000",
        "Rp. 70.000",
        "Rp. 80.000",
        "Rp. 90.000",
        "Rp. 20.000",
        "Rp. 50.000"
    )
    private val rating= arrayOf(
        4.8,
        4.5,
        4.7,
        4.4,
        4.6,
        4.9,
        4.3,
        4.7,
        4.9,
        4.5,
        4.6
    )


    val listData: ArrayList<DataList>
        get() {
            val list= arrayListOf<DataList>()
            for (position in name.indices){
                list.add(
                    DataList(
                        image[position],
                        name[position],
                        price[position],
                        rating[position]
                    )
                )
            }
            return list
        }

}