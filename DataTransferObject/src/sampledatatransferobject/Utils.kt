package sampledatatransferobject

/**
 * this is a function of a mapper.
 * this is what I need for my
 */
fun ArrayList<Player>.toDomainPlayerReal(): List<PlayerReal>{

    return map {
        PlayerReal(
            name = it.name,
            sport = it.sport,
            age = it.age
        )
    }
}