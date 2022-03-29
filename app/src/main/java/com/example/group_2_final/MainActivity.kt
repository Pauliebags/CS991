package com.example.group_2_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
public class MainActivity : AppCompatActivity() {
    private Button buttonLogin, buttonRegister;

    lateinit var bottomNav: BottomNavigationView
    lateinit var navController: NavController
    lateinit var drawerLayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        buttonLogin = findViewById(R.id.button_login);
        buttonRegister = findViewById(R.id.button_register);
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNav = bottom_navigation
        navController = findNavController(R.id.hostFragment)
        setupBottomNavigation()
        drawerLayout = drawer_layout
        appBarConfiguration = AppBarConfiguration(navController.graph,drawerLayout)
        NavigationUI.setupActionBarWithNavController(this,navController,drawerLayout)
        NavigationUI.setupWithNavController(navigation_view,navController)
    }

    override fun onSupportNavigateUp(): Boolean {

        return NavigationUI.navigateUp(navController,appBarConfiguration)

    }

    private fun setupBottomNavigation() {
        bottomNav.setupWithNavController(navController)
    }

    public fun buttonLogin(view: View) {
        Toast.makeText(, this,"Login Successful!", Toast.LENGTH_SHORT).show()
        Intent i = new Intent(applicationContext(), ProfileFragment.class);
        startActivity(i);
    }
    public fun buttonRegister(view: View){}
        Toast.makeText(, this,"Registration Successful!", Toast.LENGTH_SHORT).show()
        Intent i = new Intent(applicationContext(), RegisterFragment.class);
        startActivity(i);
}