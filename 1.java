<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        #animatedSquare {
            width: 50px;
            height: 50px;
            background-color: blue;
            position: relative;
        }
    </style>
    <script>
        document.addEventListener("DOMContentLoaded", function () {
            var square = document.getElementById("animatedSquare");

            function animateSquare() {
                var position = 0;
                var id = setInterval(frame, 10);

                function frame() {
                    if (position == window.innerWidth - 50) {
                        clearInterval(id);
                    } else {
                        position++;
                        square.style.left = position + "px";
                    }
                }
            }

            animateSquare();
        });
    </script>
</head>
<body>
    <div id="animatedSquare"></div>
</body>
</html>