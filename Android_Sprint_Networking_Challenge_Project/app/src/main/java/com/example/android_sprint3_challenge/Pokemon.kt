package com.example.android_sprint3_challenge


data class Pokemon(
    val name: String,
    val sprites: Sprite,
    val id: Int,
    val abilities: List<AbilityList>,
    val types: List<TypeList>
    )


data class Type(val name: String)

data class TypeList (val type: Type )

data class Ability(val name: String)

data class AbilityList(val ability: Ability)

data class Sprite (val front_default: String )

data class Id (val id: Int)

