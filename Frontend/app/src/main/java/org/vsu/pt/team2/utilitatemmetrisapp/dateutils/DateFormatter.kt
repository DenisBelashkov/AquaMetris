package org.vsu.pt.team2.utilitatemmetrisapp.dateutils

import java.text.SimpleDateFormat
import java.util.*

object DateFormatter {
    val dateFormat = SimpleDateFormat("dd.mm.yyyy HH:mm:ss", Locale.ENGLISH)

    //2021-05-27T14:04:15.988Z
    val networkDateFormat = SimpleDateFormat("yyyy-dd-mmTHH:mm:ss.zzzZ", Locale.ENGLISH)

    fun toString(date: Date): String {
        return dateFormat.format(date)
    }

    fun fromString(dateStr: String): Date {
        return dateFormat.parse(dateStr)
    }

    fun toNetworkString(date: Date): String {
        return networkDateFormat.format(date)
    }

    fun fromNetworkString(dateStr: String): Date {
        return networkDateFormat.parse(dateStr)
    }

    fun fromNetworkStringToString(dateStr: String): String {
        return toString(fromNetworkString(dateStr))
    }
}