package sampledatatransferobject

object SampleData {

    val players:ArrayList<Player>
    get() {
        val data = ArrayList<Player>()
        data.add(Player("Okocha", "Single", 9, "Football", 45 ))
        data.add(Player("Oliseh", "Married", 6, "Football", 48))
        data.add(Player("Ronaldo", "Married", 11, "Football", 49))

        return data
    }

}