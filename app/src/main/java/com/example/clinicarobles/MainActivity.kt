package com.example.clinicarobles

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val btnSalir = findViewById<Button>(R.id.btnSalir)
        val especialidades = listOf(
            Especialidad(
                "Traumatología",
                listOf(
                    "Dr. Alberto García Cerna",
                    "Dr. Cruz Medina Martínez",
                    "Dr. Edison Abanto Arroyo",
                    "Dra. Sandra Robles Zanelli",
                    "Dra. Yessenia Zapata Delgado",
                    "Dr. Ciro Madrid Flores",
                    "Dr. Pablo Mego"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_traumatologia
            ),
            Especialidad(
                "Cardiología",
                listOf(
                    "Dr. Roberto Chavesta Bernal"
                ),
                "Lun a Vie - 9am a 6pm",
                R.drawable.ic_cardiologia
            ),
            Especialidad(
                "Cirugía Cardiovascular",
                listOf(
                    "Dr. Romel Zamudio Silva"
                ),
                "Lun a Vie - 9am a 6pm",
                R.drawable.ic_cirugia_cardiovascular
            ),
            Especialidad(
                "Cirugía General",
                listOf(
                    "Dr. Beto Miranda Sevillano",
                    "Dr. Piscina Jara Pesada",
                    "Dr. Jonnatan Uribe",
                    "Dr. Beltrany Lavado"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_cirugia_general
            ),
            Especialidad(
                "Dermatología",
                listOf(
                    "Dr. Jaime Vega Chavez",
                    "Dr. Italo Vegas Jaramillo"
                ),
                "Mar y Jue - 11am a 3pm",
                R.drawable.ic_dermatologia
            ),
            Especialidad(
                "Endocrinología",
                listOf(
                    "Dr. Juan Pinto Sanchez"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_endocrinologia
            ),
            Especialidad(
                "Gastroenterología",
                listOf(
                    "Dra. Kelly Casanova Lau"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_gastroenterologia
            ),
            Especialidad(
                "Ginecología",
                listOf(
                    "Dr. Jose Luis Espinoza Decena",
                    "Dra. Yulissa Paredes Padilla",
                    "Dr. Julio Ostolaza Rodríguez",
                    "Dra. Leslie Sosa De La Cruz"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_ginecologia
            ),
            Especialidad(
                "Medicina Física",
                listOf(
                    "Dr. Luis Vasquez"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_medicina_fisica
            ),
            Especialidad(
                "Medicina General",
                listOf(
                    "Dr. Elwis Laveriano Hoyos",
                    "Dra. Maria Cristina Saavedra"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_medicina_general
            ),
            Especialidad(
                "Medicina Interna",
                listOf(
                    "Dr. Luis Cabrera Cipiran",
                    "Dra. Rosa Casimiro Lau",
                    "Dra. Yuriko Zuñiga Lavado"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_medicina_interna
            ),
            Especialidad(
                "Neumología",
                listOf(
                    "Dra. Yessica Montoya Caldas",
                    "Dr. Walter Centurión Jaramillo"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_neumologia
            ),
            Especialidad(
                "Neurocirugía",
                listOf(
                    "Dr. Willy Caballero Grados"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_neurocirugia
            ),
            Especialidad(
                "Neurología",
                listOf(
                    "Dr. Rosnel Valdivieso Velarde"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_neurologia
            ),
            Especialidad(
                "Nutrición",
                listOf(
                    "Lic. Carmela Carbajal"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_nutricion
            ),
            Especialidad(
                "Odontología",
                listOf(
                    "Dr. Pedro Cipriano Alegre",
                    "Dra. Carolina Acuña Calderon"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_odontologia
            ),
            Especialidad(
                "Cirugía Maxilofacial",
                listOf(
                    "Dr. Julio Robles Zanelli"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_cirugia_maxilofacial
            ),
            Especialidad(
                "Otorrinolaringología",
                listOf(
                    "Dr. Jorge Bonilla Vargas"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_otorrinolaringologia
            ),
            Especialidad(
                "Oftalmología",
                listOf(
                    "Dra. Anita Vigo Arroyo"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_oftalmologia
            ),
            Especialidad(
                "Pediatría",
                listOf(
                    "Dr. Marcos Vasquez Tantas",
                    "Dr. Jaime Cabrera Pereda",
                    "Dr. Hugo Melendez Cuentas",
                    "Dr. Juan Solis Angeles",
                    "Dra. Rosa Angeldonis Hurtado",
                    "Dr. Edward Ramirez Alvear",
                    "Dr. Fernando Samame",
                    "Dra. Ana Lopez",
                    "Dr. Jose Lozano"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_pediatria
            ),
            Especialidad(
                "Psicología",
                listOf(
                    "Lic. Astrid Manrique Marron",
                    "Lic. Luz Vasquez Burgos"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_psicologia
            ),
            Especialidad(
                "Psiquiatría",
                listOf(
                    "Dra. Celmira Lazaro Loyola"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_psiquiatria
            ),
            Especialidad(
                "Reumatología",
                listOf(
                    "Dr. Frank Ocaña Vasquez"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_reumatologia
            ),
            Especialidad(
                "Urología",
                listOf(
                    "Dr. Carlos Morales Flores",
                    "Dr. Luis Pascual Plasencia",
                    "Dr. Jose Acosta Fuentes"
                ),
                "Lun a Vie - 8am a 5pm",
                R.drawable.ic_urologia
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EspecialidadAdapter(especialidades) { especialidad ->
            val doctoresTexto = especialidad.doctores.joinToString(separator = "\n")

            AlertDialog.Builder(this)
                .setTitle(especialidad.nombre)
                .setMessage("Doctores:\n$doctoresTexto\n\nHorario: ${especialidad.horario}")
                .setPositiveButton("Cerrar") { dialog, _ -> dialog.dismiss() }
                .show()
        }

        btnSalir.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
            finish()
        }
    }
}