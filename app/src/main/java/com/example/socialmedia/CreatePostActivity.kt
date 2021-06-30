package com.example.socialmedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialmedia.daos.PostDao
import com.example.socialmedia.databinding.ActivityCreatePostBinding

class CreatePostActivity : AppCompatActivity() {

    private lateinit var postDao: PostDao
    private lateinit var binding: ActivityCreatePostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreatePostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        postDao = PostDao()

        binding.postButton.setOnClickListener {
            val input = binding.postInput.text.toString().trim()
            if(input.isNotEmpty()){
                postDao.addPost(input)
                finish()
            }

        }

    }
}