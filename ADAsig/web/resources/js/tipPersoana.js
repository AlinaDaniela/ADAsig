function hidePersFizica(x)
{
    if (x.checked)
    {
        document.getElementById("persFizicaForm").style.visibility = "hidden";
        document.getElementById("persJuridicaForm").style.visibility = "visible";
    }
}

function hidePersJuridica(x)
{
    if (x.checked)
    {
        document.getElementById("persJuridicaForm").style.visibility = "hidden";
        document.getElementById("persFizicaForm").style.visibility = "visible";
    }
}