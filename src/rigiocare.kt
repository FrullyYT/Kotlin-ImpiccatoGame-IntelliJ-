fun rigiocare(){
    var rigiocare:String
    do {
        println("volete rigiocare?")
        rigiocare = readLine() ?: ""
    }while (rigiocare != "y" && rigiocare != "n")

    if (rigiocare == "y"){
        println("bene!")
        main()
    }else{
        println("grazie per aver giocato!")
    }

}