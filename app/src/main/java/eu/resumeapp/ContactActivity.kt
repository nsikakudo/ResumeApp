package eu.resumeapp

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val btnEmail : Button = findViewById(R.id.btnEmail)
        val btnPhone : Button = findViewById(R.id.btnPhone)
        val btnTwitter : Button = findViewById(R.id.btnTwitter)
        val btnBehance : Button = findViewById(R.id.btnBehance)
        val btnLinkedin : Button = findViewById(R.id.btnLinkedin)

        btnEmail.setOnClickListener {
            val emailIntent = Intent(Intent.ACTION_SENDTO,
            Uri.fromParts("mailto", "udonsikak@email.com", null))
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }

        btnPhone.setOnClickListener {
            val url = "tel:+2348052138136"
            val callIntent = Intent(Intent.ACTION_DIAL)
            callIntent.data =Uri.parse(url)
            startActivity(callIntent)
        }

        btnTwitter.setOnClickListener {
            val url = "https://twitter.com/UdoNsikak3?t=7mfb8FIKEPziuwMwrKCCqQ&s=09"
            val openLink = Intent(Intent.ACTION_VIEW)
            openLink.data = Uri.parse(url)
            startActivity(openLink)
        }

        btnBehance.setOnClickListener {
            val url = "https://www.behance.net/nsikakudo"
            val openLink = Intent(Intent.ACTION_VIEW)
            openLink.data = Uri.parse(url)
            startActivity(openLink)
        }

        btnLinkedin.setOnClickListener {
            val url = "https://www.linkedin.com/authwall"
            val openLink = Intent(Intent.ACTION_VIEW)
            openLink.data = Uri.parse(url)
            startActivity(openLink)
        }

    }


    }
