package org.freedu.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class DetailsActivity : AppCompatActivity() {

    private lateinit var playerImage:CircleImageView
    private lateinit var playerName:TextView
    private lateinit var playerDetails:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        playerImage = findViewById(R.id.playerImage)
        playerName = findViewById(R.id.playerName)
        playerDetails = findViewById(R.id.playerDetails)

        playerImage.setImageResource(intent.getIntExtra("playerimage", 0))
        playerName.text = intent.getStringExtra("playername")
        playerDetails.setText(intent.getIntExtra("playerdetails", 0))
    }
}


