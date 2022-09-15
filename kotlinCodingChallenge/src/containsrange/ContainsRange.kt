package containsrange


 fun containsRange(range1: IntRange, range2: IntRange): Boolean {
    for (item in range2){
        if (!range1.contains(item)){
            return false
        }
    }
     return true
}