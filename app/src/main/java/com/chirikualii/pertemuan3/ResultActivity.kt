package com.chirikualii.pertemuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chirikualii.pertemuan3.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding : ActivityResultBinding

    var resultA = ""
    var resultB = ""

    var scoreA = 0
    var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * TODO
          tampilkan data dari activity match seperti pada layout [activity_result.XML]
         **/

        resultA = intent.getStringExtra("timA") ?: "teamA"
        resultB = intent.getStringExtra("timB") ?: "teamB"

        scoreA = intent.getIntExtra("scoreA", 0) ?: 0
        scoreB = intent.getIntExtra("scoreB", 0) ?: 0

        binding.tvResultA.text = "$resultA : $scoreA"
        binding.tvResultB.text = "$resultB : $scoreB"
    }
}