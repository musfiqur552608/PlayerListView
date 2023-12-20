package org.freedu.customlistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private lateinit var listView:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        listView = findViewById(R.id.listView)

        val playerList:ArrayList<Player> = ArrayList<Player>()

        playerList.add(Player(R.color.black, "Leonal Messi", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Angel De Maria", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Parades", "He is the GOAT"))
        playerList.add(Player(R.color.black, "De Paul", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Molina", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Lartino Martinaze", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Emi Martinaze", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Corra", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Neco Paz", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Granacho", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Otamendi", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Romero", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Lisandro Martinaz", "He is the GOAT"))
        playerList.add(Player(R.color.black, "Enzo Farnendaz", "He is the GOAT"))

        val playerAdapter = PlayerAdapter(this, playerList)

        listView.adapter = playerAdapter

    }
}