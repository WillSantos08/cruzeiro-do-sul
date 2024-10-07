function escolha() {
    var numero = prompt("Insira um número: ");
    document.write("<select multiple style='height: 200px; width: 100px;'>")

    for (var n1 = 0; n1 <= 10; n1++) {
        document.write("<option>" + numero + "x" + n1 + "=" + n1 * numero + "</option>");
    }

    document.write("</select>");
}