package com.veronica.idn.githubapp.data.model


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    @field:SerializedName("login")
    var login: String,

    @field:SerializedName("avatar_url")
    var avatar_url: String,

    @field:SerializedName("html_url")
    var html_url: String,

    @field:SerializedName("type")
    var type: String,
) : Parcelable
