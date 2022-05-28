fun verificaLettera(parola:CharArray, lettera:Char):Boolean{
    var output = false
    var valido = true
    var contatore = 0
    while (valido){
        if (parola[contatore] == lettera){
            valido = false
            output = true
        }else if (contatore == parola.size-1){
            valido = false
        }else{
            contatore++
        }

    }
    return output
}