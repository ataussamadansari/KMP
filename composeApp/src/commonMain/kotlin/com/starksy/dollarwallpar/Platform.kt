package com.starksy.dollarwallpar

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform