$(document).ready(function () {

    $.getJSON("Asigurare", function (data) {
        var data1 = data[0], data2 = data[1], data3 = data[2]; //We get both data1 and data2 from the array
        $.each(data1, function (key, value) {
            $('#aniOP').append($('<option>', {
                value: key,
                text: value
            }));
        });
        $.each(data2, function (key, value) {
            $('#judet').append($('<option>', {
                value: key,
                text: value
            }));
        });
    });

    $('#judet').change(function (event) {

        var $judet = $("select#judet").val();
        var value = 'judetDenumire=' + $judet;
        alert($judet);

        $.ajax({
            url: "Asigurare",
            //type: "post",
            data: value,
            cache: false,
            success: function (data) {

                alert("Am luat localitatile.");
                alert(data);
                var data3 = data[2]; //We get both data1 and data2 from the array
                $.each(data3, function (key, value) {
                    $('#localitate').append($('<option>', {
                        value: key,
                        text: value
                    }));
                });
            }
        });


    });
});