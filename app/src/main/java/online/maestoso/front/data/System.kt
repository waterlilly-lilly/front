package online.maestoso.front.data

import kotlinx.serialization.Serializable

@Serializable
data class System(
    val shortname: String,
    val displayname: String,
    val description: String,
    val pronouns: Pronouns,
    val groups: MutableSet<Group>,
    val members: MutableSet<Member>,
    val frontTable: MutableSet<Front>
)
