package com.example.androidstudy.board

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.androidstudy.R
import com.example.androidstudy.databinding.ActivityBoardWriteBinding
import com.example.androidstudy.utils.FBAuth
import com.example.androidstudy.utils.FBRef
import com.example.androidstudy.utils.Time

class BoardWriteActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBoardWriteBinding

    private val TAG = BoardWriteActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_board_write)

        binding.writeBtn.setOnClickListener {

            var title = binding.titleArea.text.toString()
            var content = binding.contentArea.text.toString()
            val uid = FBAuth.getUid()
            val time = Time.getTime()

            Log.d(TAG, title)
            Log.d(TAG, content)

            FBRef.boardRef
                .push()
                .setValue(BoardModel(title, content, uid, time))


        }

    }
}