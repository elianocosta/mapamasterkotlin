package com.example.mapa_master_kotlin

import com.google.android.gms.maps.model.LatLng

interface RadarDAO {


        fun all(): Radar<LatLng>

        fun add(vararg product: Product)


}