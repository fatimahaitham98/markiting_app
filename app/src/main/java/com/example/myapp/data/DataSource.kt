package com.example.myapp.data

import com.example.myapp.data.domin.Catogry
import com.example.myapp.data.domin.Post

object DataSource {
//fake data
    fun getPost():List<Post> = listOf(
        Post(1,"IQD 5,250","https://www.tamata.com/media/catalog/product/cache/d65899a294a8e7b1b602f108a6bde908/s/u/superhome20-4-2022-1.jpg","Paper napkin and stand mobile wallet"),
        Post(2,"IQD 1,800,000","https://www.tamata.com/media/catalog/product/cache/d65899a294a8e7b1b602f108a6bde908/t/a/taif-tec1-2-2022-1.jpg","MSI Sword 15.6 Inches Gaming Laptop - Intel Core i7-11800H - 16GB"),
        Post(3,"IQD 5,850,000","https://www.tamata.com/media/catalog/product/cache/d65899a294a8e7b1b602f108a6bde908/t/a/taif-f-5-12-2021-33_1.jpg","Gigabyte AERO RTX3080 OLED Core i9 -10980H OLED 15.6 Inches - 64GB"),
        Post(4,"IQD 15,000","https://www.tamata.com/media/catalog/product/cache/d65899a294a8e7b1b602f108a6bde908/c/u/cutebazaar220328_58n.jpg","R7A7S4 Masterpiece with beautiful design and distinctive 15.5*14.5*15.5cm"),
        Post(5,"IQD 6,000","https://www.tamata.com/media/catalog/product/cache/d65899a294a8e7b1b602f108a6bde908/b/l/blushworkx2021-5-29-38.jpg","Dolphin Machine Detergent Powder 2.5kg"),
        Post(6,"IQD 2,500","https://www.tamata.com/media/catalog/product/cache/d65899a294a8e7b1b602f108a6bde908/w/o/worldcenter26-5-2021-3.jpg","Bref Duo Cubes In Cistern Toilet Cleaner, 2 x 50g"),
        Post(7,"IQD 19,500","https://www.tamata.com/media/catalog/product/cache/d65899a294a8e7b1b602f108a6bde908/p/e/pearl1-7-2021-t47-white.jpg","Pearl Metal HB-4043 Kettle 1.6 L"),
        Post(8,"IQD 30,000","https://www.tamata.com/media/catalog/product/cache/d65899a294a8e7b1b602f108a6bde908/9/2/92811e62-f9ec-49ed-820b-512582d41aaa_2.jpg","Al Shallal Perfumes Mesk"),

    )
    fun getCatogryl():List<Catogry> = listOf(
        Catogry(1,"For you"),
        Catogry(2,"Fashion"),
        Catogry(3,"Home & Kichen"),
        Catogry(4,"Beauty & Health"),
        Catogry(5,"Food"),
        Catogry(6,"Gifts"),
      )
}