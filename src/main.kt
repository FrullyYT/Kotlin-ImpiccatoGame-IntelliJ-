fun main() {

    println("i + indicano che quella lettera è una vocale, i - indicano che quella lettera è una consonante")
    println("se sai già la parola prima di finire scrivere la parola completa")
    var parolaStringa:String
    var parola: CharArray
    do {
        println("inserire la parola che un altra persona deve indovinare")
        parolaStringa = readLine() ?: " "
        parola = parolaStringa.toCharArray()
    }while (parola.size <= 2)


    //nasconde la parola
    for (i in 0..50){
        println(" ")
    }

    gioco(parola)

}