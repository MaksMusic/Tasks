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
    //� Mape ������� ������� (� ������ ������� ���� ��������)
    var groups:Map<String,ArrayList<Player>> = mapOf("Java" to group1,"Kotlin" to group2,"JavaScript" to group3)
}

class Player(var nomer:Int = (0..100).random(),var name:String ="Jo" + ('a'..'z').random().toString() +('a'..'b').random().toString() ){

}

//�������� fun1
//����� ����� ������� � ���������� ������� �� ������ ������ (������ �� ������)
// �������� �� � ��� � ������� (������, ��� �������) � ������� ���� M�p (return)

fun angoritmsN1(nomer:Map<String,ArrayList<Player>>){
}

//�������� fun2 ��������� ��� �� Map
// ���������� ������� ������� ������ ������� � ����� ������ ��� � �� ������

//�������� fun3 ��������� ��� �� Map
// ���������� ���� � ������ ������� ���� �� ���� 3 ������ ������ ������� ������ 50
