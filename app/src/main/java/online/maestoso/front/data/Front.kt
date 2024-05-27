package online.maestoso.front.data

import kotlinx.datetime.DateTimePeriod
import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class Front(
    val members: MutableSet<@Serializable(with = UUIDSerializer::class) UUID>,
    val period: DateTimePeriod,
    val notes: String
)
