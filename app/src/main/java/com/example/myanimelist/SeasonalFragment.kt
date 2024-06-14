package com.example.myanimelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class SeasonalFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar o layout deste fragment
        val view = inflater.inflate(R.layout.fragment_seasonal, container, false)

        // Inicializar o ListView e o ArrayAdapter
        val seasonalanime = arrayOf(
            "Kono Subarashii Sekai ni Shukufuku wo! 3", "Kimetsu no Yaiba: Hashira Geiko-hen",
            "Mushoku Tensei II: Isekai Ittara Honki Dasu Part 2", "Kaijuu 8-gou",
            "Tensei shitara Slime Datta Ken 3rd Season",
            "Boku no Hero Academia 7th Season", "Wind Breaker",
            "Ookami to Koushinryou: Merchant Meets the Wise Wolf",
            "Maou Gakuin no Futekigousha II: Shijou Saikyou no Maou no Shiso, Tensei shite Shison-tachi no Gakkou e Kayou Part 2",
            "Sentai Daishikkaku", "Tensei shitara Dainana Ouji Datta node, Kimama ni Majutsu wo Kiwamemasu",
            "Lv2 kara Cheat datta Motoyuusha Kouho no Mattari Isekai Life", "Maou no Ore ga Dorei Elf wo Yome ni Shitanda ga, Dou Medereba Ii?",
            "Mahouka Koukou no Rettousei 3rd Season", "Date A Live V", "Jiisan Baasan Wakagaeru", "Re:Monster",
            "Unnamed Memory", "Hananoi-kun to Koi no Yamai", "Bartender: Kami no Glass",
            "Yoru no Kurage wa Oyogenai", "Tensei Kizoku, Kantei Skill de Nariagaru", "Yozakura-san Chi no Daisakusen",
            "Sasayaku You ni Koi wo Utau"
        )

        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.item_textview, R.id.textViewItem, seasonalanime)
        val lista: ListView = view.findViewById(R.id.navList)
        lista.adapter = arrayAdapter

        return view
    }
}
