package movie.watchlist

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform