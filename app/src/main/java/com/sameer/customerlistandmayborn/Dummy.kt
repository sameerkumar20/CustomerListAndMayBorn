package com.sameer.customerlistandmayborn

import com.sameer.customerlistandmayborn.vo.CustomerInfo

fun getCustomerList() : MutableList<CustomerInfo>{
    return mutableListOf(

        CustomerInfo(1,
            "https://images.pexels.com/photos/45201/kitty-cat-kitten-pet-45201.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "Ei Thiri Aung",
            "0994587349",
            "DOB 13 Jan 1992",
            "Active"),

        CustomerInfo(2,
            "https://images.pexels.com/photos/45201/kitty-cat-kitten-pet-45201.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "Kyaw Sitt Thway",
            "09287388549",
            "DOB 30 May 2000",
            "2 min ago"),
        CustomerInfo(3,
            "https://images.pexels.com/photos/45201/kitty-cat-kitten-pet-45201.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "Thaw De Zin",
            "09347377733",
            "DOB 13 Jan 1992",
            "10 min ago"),
        CustomerInfo(4,
            "https://images.pexels.com/photos/45201/kitty-cat-kitten-pet-45201.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "Shun Lae Hmue",
            "095303022",
            "DOB 8 May 1994",
            "7 hr ago"),
        CustomerInfo(5,
            "https://images.pexels.com/photos/45201/kitty-cat-kitten-pet-45201.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500",
            "Hsu Myat Htet",
            "095848833",
            "DOB 13 Jan 1992",
            "3 day ago")
    )
}
