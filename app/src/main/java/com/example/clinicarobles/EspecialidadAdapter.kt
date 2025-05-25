package com.example.clinicarobles

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EspecialidadAdapter(
    private val lista: List<Especialidad>,
    private val onItemClick: (Especialidad) -> Unit
) : RecyclerView.Adapter<EspecialidadAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nombre: TextView = itemView.findViewById(R.id.tvNombre)
        val doctor: TextView = itemView.findViewById(R.id.tvDoctor)
        val horario: TextView = itemView.findViewById(R.id.tvHorario)
        val imagen: ImageView = itemView.findViewById(R.id.imgEspecialidad)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_especialidad, parent, false)
        return ViewHolder(vista)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val especialidad = lista[position]
        holder.nombre.text = especialidad.nombre
        holder.doctor.text = especialidad.doctores.joinToString(separator = "\n")
        holder.horario.text = especialidad.horario
        holder.imagen.setImageResource(especialidad.imagen)

        holder.itemView.setOnClickListener {
            onItemClick(especialidad)
        }
    }

    override fun getItemCount(): Int = lista.size
}
