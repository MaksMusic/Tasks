package Tasks.Skobka

import kotlin.collections.ArrayList


fun main() {
    println(isValid("[([]])"))
}


fun isValid2(s: String): Boolean {
    var strArr = ArrayList<Char>()
    var mass = s.toCharArray()
    var simval = charArrayOf('{', '}', '[', ']', '(', ')')
    for (i in mass.indices) {
        if (mass[i] == '(' || mass[i] == ')' || mass[i] == '{' || mass[i] == '}' || mass[i] == '[' || mass[i] == ']') {
            strArr.add(mass[i])
        }
    }
    if (mass[0] != '(' && mass[0] == '{' && mass[0] == '[') {
        // println("не начинается с открывающей скобки")
        return false
    } else if (mass[mass.size - 1] != ')' && mass[mass.size - 1] != '}' && mass[mass.size - 1] != ']') {
        // println("не закрывается с закрывающей скобки")
        return false
    } else {
        var s1 = false
        var s2 = false
        var s111 = 0;
        var s222 = 0;

        var s3 = false
        var s4 = false
        var s333 = 0;
        var s444 = 0;

        var s5 = false
        var s6 = false
        var s555 = 0;
        var s666 = 0;

        var n = 0;
        var nNext = 0;

        for (c in strArr.indices) {
            for (i in simval.indices) {
                if (strArr[c] == simval[i]) {
                    if (i == 0 || i == 2 || i == 4) {
                        if (strArr[c + 1] == simval[1] || strArr[c + 1] == simval[3] || strArr[c + 1] == simval[5]) {
                            var ch = '!'
                            for (l in simval.indices) {
                                if (strArr[c] == simval[l]) {
                                    when (simval[l]) {
                                        '{' -> ch = '}'
                                        '(' -> ch = ')'
                                        '[' -> ch = ']'
                                    }
                                }
                            }
                            if (strArr[c + 1] != ch) {  //strArr[c] ее противоположности)
                                return false //[)
                            }
                        }
                    }
                    if (i % 2 == 0) { //если скобка открывающая нужно чтоб след была такая же закрывающая
                        n = i;
                        if (n != 0 && n != 2 && n != 4) {///// разрешить видеть впереди только открывающие скобки такие же
                           // println("встречается не правильная скобка1")
                            return false
                        }//{{}}
                    } else {
                        n = i;//n != n - 1
                        if (n != 1 && n != 3 && n != 5) {///// разрешить видеть впереди только открывающие скобки
                           // println("встречается не правильная скобка2")
                            return false
                        }

                    }
                }
                //return
                when (strArr[c]) {
                    '(' -> {
                        s111++
                        if (s111 != s222) {
                            s1 = true
                            s2 = true
                        } else {
                            s2 = false
                            s1 = false
                        }
                    }
                    ')' -> {
                        s222++
                        if (s111 != s222) {
                            s2 = true
                            s1 = true
                        } else {
                            s1 = false
                            s2 = false
                        }
                    }
                    '{' -> {
                        s333++
                        if (s333 != s444) {
                            s3 = true
                            s4 = true
                        } else {
                            s3 = false
                            s4 = false
                        }
                    }

                    '}' -> {
                        s444++
                        if (s333 != s444) {
                            s3 = true
                            s4 = true
                        } else {
                            s3 = false
                            s4 = false
                        }
                    }
                    '[' -> {
                        s555++
                        if (s444 != s333) {
                            s5 = true
                            s6 = true
                        } else {
                            s5 = false
                            s6 = false
                        }
                    }
                    ']' -> {
                        s666++
                        if (s555 != s666) {
                            s5 = true
                            s6 = true
                        } else {
                            s5 = false
                            s6 = false
                        }
                    }

                }//when
            } // for
        }
        if (s1 || s2 || s3 || s4 || s5 || s6 && ((s111 != s222) || (s333 != s444) && (s555 != s666))) {
            //println("не равное количество скобок")
            return false
        } else {
            return true
        }
    }

}

