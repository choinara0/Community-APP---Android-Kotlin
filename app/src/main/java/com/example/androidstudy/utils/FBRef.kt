package com.example.androidstudy.utils

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class FBRef {

    companion object{

        private lateinit var myRef : DatabaseReference
        private val database = Firebase.database
        val bookmarkRef = database.getReference("bookmark_list")

    }
}