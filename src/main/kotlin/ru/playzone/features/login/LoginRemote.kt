package ru.playzone.features.login

import kotlinx.serialization.Serializable

@Serializable
data class LoginReceiveRemoteModel(
    val login: String,
    val password: String
)

@Serializable
data class LoginResponseRemote(
    val token: String
)
