package Tasks.Map


fun main() {

    var group1:ArrayList<Player> = ArrayList(100)
    for (i in 0..100) {
        group1.add(i, Player())
        println(group1.get(i).name)
    }


    var group2:ArrayList<Player> =ArrayList(100)

    for (i in 0..100) {
        group2.add(i, Player())
    }
    var group3:ArrayList<Player> =ArrayList(100)

    for (i in 0..100) {
        group3.add(i, Player())
    }
    //в Mape каманды игроков (у каждой команды есть название)
    var groups:Map<String,ArrayList<Player>> = mapOf("Java" to group1,"Kotlin" to group2,"JavaScript" to group3)
}

class Player(var nomer:Int = (0..100).random(),var name:String ="Jo" + ('a'..'z').random().toString() +('a'..'b').random().toString() ){

}

//написать fun1
//нужно найти игроков с одинаковым номером из разных команд (именно из разных)
// записать их в мап в формате (Игрока, его команда) и вернуть этот Mаp (return)

fun angoritmsN1(nomer:Map<String,ArrayList<Player>>){
}

//написать fun2 принимает тот же Map
// возвращает команду игроков номера которой в сумме больше чем у др команд

//написать fun3 принимает тот же Map
// возвращает лист с имнами игроков всех из всех 3 конмад номера которых больше 50
