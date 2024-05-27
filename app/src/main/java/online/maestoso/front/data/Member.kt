package online.maestoso.front.data

import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class Member(
    @Serializable(with = UUIDSerializer::class) val uuid: UUID,
    val shortname: String,
    val displayname: String,
    val birthday: LocalDate,
    val pronouns: Pronouns,
    val description: String,
    val created: Instant
    )
