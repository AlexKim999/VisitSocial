package ru.netology

fun main() {
    agoToText(240000)
}

fun agoToText(secondsAgo: Int) {
    val minutes = secondsAgo / 60
    val hours = minutes / 60


    val result = when {
        secondsAgo in 0..60 -> "был(а) только что"
        secondsAgo in 61..3600 -> "был(а) $minutes ${getMinutes(minutes)} назад"
        secondsAgo in 3601..86400 -> "был(а) $hours ${getHours(hours)} назад"
        secondsAgo in 86401..172800 -> "был(а) вчера"
        secondsAgo in 172801..259200 -> "был(а) позавчера"
        else -> "чет давно не было"
    }
    println(result)
}

fun getMinutes(minutes: Int): String {
    return when {
        (minutes in 5..20) || (minutes % 10 in 5..9) || (minutes % 10 == 0) -> "минут назад"
        (minutes % 10 == 1) -> "минут назад"
        else -> "минут назад"
    }
}

fun getHours(hours: Int): String {
    return when {
        (hours in 5..20) || (hours % 10 in 5..9) || (hours % 10 == 0) -> "часов назад"
        (hours % 10 == 1) -> "часов назад"
        else -> "часов назад"
    }
}