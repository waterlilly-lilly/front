package online.maestoso.front.data

import kotlinx.datetime.Instant
import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class Group(
    @Serializable(with = UUIDSerializer::class) val id: UUID,
    val shortname: String,
    val displayname: String,
    val description: String,
    val created: Instant,
    val members: MutableSet<@Serializable(with = UUIDSerializer::class) UUID>)
