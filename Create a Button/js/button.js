function incrementValue()
{
    var value = parseInt(document.getElementById('btn').innerText, 10);
    value = isNaN(value) ? 0 : value;
    value++;
    document.getElementById('btn').innerText = value;
}