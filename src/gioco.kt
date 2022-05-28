fun gioco(parola:CharArray){

    var valoreImmagine = 0
    var valoreParola = 2
    val parolaMostrata = creaParolaMostrata(parola)
    var tentativo = 0

    while (valoreImmagine != 6 && valoreParola != parola.size){


        //fa vedere il disegno
        immagineImpiccato(valoreImmagine)
        println(" ")

        //fa vedere la parola da completare
        for (i in parola.indices){
            print(parolaMostrata[i])
        }
        println("")

        //lettera in input
        var letteraStringa:String
        var lettera:Char
        do {
            println("inserisci la lettera, o la parola se la hai gia indovinata")
            letteraStringa = readLine() ?: " "
            lettera = letteraStringa[0]
        }while (verificaTipoLettera(lettera) == 2)
        tentativo++

        //scrivi la parola prima se la hai gia indovinata
        var parolaStringa = ""
        for (i in parola.indices){
            parolaStringa += "${parola[i]}"
        }

        if (letteraStringa == parolaStringa){
            if (tentativo == 1){
                println("Bravo!, hai vinto in 1 tentativo")
                valoreImmagine = 6
            }else{
                println("Bravo!, hai vinto in $tentativo tentativi")
                print("la parola era ")
                for (i in parola.indices){
                    print(parola[i])
                }
                println("")
                valoreImmagine = 6
            }
        }else{

            var numeroVolte: Int

            if (verificaLettera(parola, lettera)){
                numeroVolte = 0
                for (i in parola.indices){
                    if (lettera == parola[i] && i != 0 && i != parolaMostrata.size-1){
                        parolaMostrata[i] = lettera
                        valoreParola++
                        numeroVolte++
                    }
                }
                if (numeroVolte == 1){
                    println("GIUSTO, la lettera $lettera è presente nella parola")
                }else if (numeroVolte > 1){
                    println("GIUSTO, la lettera $lettera è presente nella parola $numeroVolte volte")
                }else{
                    println("SBAGLIATO, la lettera $lettera non è presente nella parola")
                    valoreImmagine++
                }
            }else{
                println("SBAGLIATO, la lettera $lettera non è presente nella parola")
                valoreImmagine++
            }
            if (valoreParola == parola.size){
                if (tentativo == 1){
                    println("Bravo!, hai vinto in 1 tentativo")
                }else{
                    println("Bravo!, hai vinto in $tentativo tentativi")
                    print("la parola era ")
                    for (i in parola.indices){
                        print(parola[i])
                    }
                    println("")
                }
            }else{
                immagineImpiccato(valoreImmagine)
                println(" ")
                print("Peccato, hai perso. la parola era ")
                for (i in parola.indices){
                    print(parola[i])
                }
                println("")
            }
        }
    }

    rigiocare()

}