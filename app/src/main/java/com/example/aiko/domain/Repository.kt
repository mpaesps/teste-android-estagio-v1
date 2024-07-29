package com.example.aiko.domain

import com.example.aiko.R

class Repository {
         fun getData(): List<DataClass> {
        // Aqui você pode incluir a lógica para buscar dados reais
        // Por exemplo, chamar uma API ou consultar um banco de dados
        // Para simplificar, vou usar dados estáticos aqui:

        val imageList = arrayOf(
            R.drawable.ic_directions_bus_24,
            R.drawable.ic_directions_bus_24,
            R.drawable.ic_directions_bus_24
        )

        val titleList = arrayOf(
            "oi",
            "tudo bem",
            "ss ou nn"
        )

        return imageList.indices.map { i ->
            DataClass(imageList[i], titleList[i])
        }
    }
}
