fun creaParolaMostrata(parola:CharArray):CharArray{
    val parolaMostrata = CharArray(parola.size)

    for (i in parolaMostrata.indices){
        if (i == 0 || i == parolaMostrata.size-1){
            parolaMostrata[i] = parola[i]
        }else if (verificaTipoLettera(parola[i]) == 0){
            parolaMostrata[i] = '+'
        }else if (verificaTipoLettera(parola[i]) == 1){
            parolaMostrata[i] = '-'
        }
    }

    return parolaMostrata
}