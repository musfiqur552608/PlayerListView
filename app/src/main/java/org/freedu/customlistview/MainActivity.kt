package org.freedu.customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var listView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listView = findViewById(R.id.listView)

        val playerList:ArrayList<Player> = ArrayList<Player>()

        playerList.add(Player(R.drawable.messi_img, "Leonel Messi", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.de_maria_img, "Angel De Maria", "He is the GOAT",R.string.leo))
        playerList.add(Player(R.drawable.parades_img, "Parades", "He is the GOAT",R.string.leo))
        playerList.add(Player(R.drawable.de_paul_img, "De Paul", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.molina_img, "Molina", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.martinaze_img, "Lartino Martinaze", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.martinaze_img, "Emi Martinaze", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.corra_img, "Corra", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.neo_paz_img, "Neco Paz", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.granacho_img, "Granacho", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.otamendi_img, "Otamendi", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.romero_img, "Romero", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.lisandro_img, "Lisandro Martinaz", "He is the GOAT", R.string.leo))
        playerList.add(Player(R.drawable.enzo_img, "Enzo Farnendaz", "He is the GOAT", R.string.leo))

        val playerAdapter = PlayerAdapter(this, playerList)

        listView.adapter = playerAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("playername", playerList[position].playerName)
            intent.putExtra("playerdetails", playerList[position].playerDetailsLong)
            intent.putExtra("playerimage", playerList[position].playerImage)

            startActivity(intent)
        }

    }
}