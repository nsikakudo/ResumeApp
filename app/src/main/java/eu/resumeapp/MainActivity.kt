package eu.resumeapp

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import java.util.*


class   MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnExperience: Button = findViewById(R.id.btnExperience)
        val btnSkills: Button = findViewById(R.id.btnSkills)
        val btnProject: Button = findViewById(R.id.btnProject)
        val btnContact: Button = findViewById(R.id.btnContact)
        val btnEdu : Button = findViewById(R.id.btnEdu)

        btnExperience.setOnClickListener {
            val intent = Intent(this, ExperienceActivity::class.java)
            startActivity(intent)
        }

        btnSkills.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        btnContact.setOnClickListener {
            val intent = Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }

        btnProject.setOnClickListener {
            val intent = Intent(this, ProjectActivity::class.java)
            startActivity(intent)
        }
        btnEdu.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }
    }

}