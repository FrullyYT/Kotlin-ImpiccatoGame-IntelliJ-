fun verificaTipoLettera(lettera:Char):Int{
    var tipo = 0
    if (lettera == 'a' || lettera == 'e' || lettera == 'i' || lettera == 'o' || lettera == 'u'){
        tipo = 0
    }else if (lettera == 'b' || lettera == 'c' || lettera == 'd' || lettera == 'f' || lettera == 'g' || lettera == 'h' || lettera == 'j' || lettera == 'k' || lettera == 'l' || lettera == 'm' || lettera == 'n' || lettera == 'p' || lettera == 'q' || lettera == 'r' || lettera == 's' || lettera == 't' || lettera == 'v' || lettera == 'w' || lettera == 'x' || lettera == 'y' || lettera == 'z'){
        tipo = 1
    }else{
        tipo = 2
    }

    //0=vocale 1=consonante 2=nonValido
    return tipo
}