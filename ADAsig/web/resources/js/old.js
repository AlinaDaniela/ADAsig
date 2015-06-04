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

                alert(data);

                $.each(data, function (key, value) {
                    alert(val(key).text(value));

                });
                $("#message").html(data).slideDown('slow');
            }
        });


    });