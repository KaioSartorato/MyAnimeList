package com.example.myanimelist

import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.myanimelist.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar)) // Configurando a toolbar
        initNavigation()

        // Encontrando o ícone do perfil na toolbar
        val profileIcon = findViewById<FrameLayout>(R.id.profile)

        // Adicionando um OnClickListener ao ícone do perfil
        profileIcon.setOnClickListener {
            // Navegar para o fragmento de perfil
            navController.navigate(R.id.fragment_profile)
        }
    }

    private fun initNavigation() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.btnv, navController)

        // Encontrando o ícone do perfil na toolbar
        val profileIcon = findViewById<FrameLayout>(R.id.profile)

        // Adicionando um OnClickListener ao ícone do perfil
        profileIcon.setOnClickListener {
            // Navegar para o fragmento de perfil
            navController.navigate(R.id.fragment_profile)
        }

    }

}