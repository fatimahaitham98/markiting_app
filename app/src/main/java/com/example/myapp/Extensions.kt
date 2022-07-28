package com.example.myapp

import com.example.myapp.data.domin.HomeItem
import com.example.myapp.data.domin.Post
import com.example.myapp.data.domin.enumm.HomeItemType

fun Post.toHomeItem():HomeItem<Any>{
    return HomeItem(this,HomeItemType.TYPE_POST)
}