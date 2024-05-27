package online.maestoso.front.data

import kotlinx.serialization.Serializable

@Serializable
data class Pronouns(val subject: String, val obj: String, val d_possessive: String, val i_possessive: String, val reflexive: String) {
    override fun toString(): String {
        return "$subject/$obj"
    }
}

val THEY_THEM: Pronouns = Pronouns("they", "them", "their", "theirs", "themself")
val SHE_HER: Pronouns = Pronouns("she", "her", "her", "hers", "herself")
val HE_HIM: Pronouns = Pronouns("he", "him", "his", "his", "himself")
val IT_ITS: Pronouns = Pronouns("it", "it", "its", "its", "itself")
