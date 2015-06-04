<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <title>Windows-8-like Animations with CSS3 and jQuery</title>

        <link rel="stylesheet" href="resources/css/demo-styles.css" />
        <script src="resources/js/modernizr-1.5.min.js"></script>
        <script src="resources/js/jquery-1.8.2.min.js"></script>
    </head>

    <body>
        <header>
            <a href="http://sarasoueidan.com/blog/windows8-animations/" class="tutorial-link">Read Tutorial</a>
        </header>
        <!--===============================Start Demo====================================================-->
        <c:if test="${not empty tile}">
            <script>
                var url = window.location.href;
                alert("Alert Message OnClick " + "Lalallalal " + url);

                $("#book").slideDown("slow", function () {
                    // Animation complete.
                    alert("Alert Message OnClick " + "Lalallalal " + url);
                });
                alert("Alert Message OnClick " + "Lalallalal " + url);
                for (var i = 1; i <= 3; i++) {
                    $('.col' + i).addClass('fadeOutback').removeClass('fadeInForward-' + i);
                }
                alert("Alert Message OnClick " + "Lalallalal " + url);
                $('.' + page).addClass('slidePageInFromLeft').removeClass('slidePageBackLeft');
                alert("Alert Message OnClick " + "Lalallalal " + url);
            </script>
        </c:if>


        <div class="demo-wrapper">
            <!-- classnames for the pages should include: 1) type of page 2) page name-->
            <div class="s-page random-restored-page">
                <h2 class="page-title">Some minimized App</h2>
                <div class="close-button s-close-button">x</div>
            </div>
            <div class="s-page custom-page" id="book">
                <h2 class="page-title">Thank You!</h2>
                <div class="close-button s-close-button" id="clickme">x</div>
                <form name="form1" method="GET" action="Ajaxexample" id="form1">
                    <table>
                        <tr>
                            <td>Number 1</td><td><input type="text" name="n1"/></td>
                        </tr>
                        <tr>
                            <td>Number 2</td><td><input type="text" name="n2"/></td>
                        </tr>
                        <tr>
                            <td></td><td><input type="submit" value="Calculate"/></td>
                        </tr>
                        <tr>
                            <td>Result</td><td><input type="text" value="" id="result"/></td>
                        </tr>
                    </table>
                </form>
            </div>
            <div class="r-page random-r-page">

                <div class="page-content">
                    <h2 class="page-title">App Screen</h2>
                    <p>Chew iPad power cord chew iPad power cord attack feet chase mice leave dead animals as gifts and stick butt in face chew iPad power cord. Chase mice. Run in circles use lap as chair why must they do that. Intrigued by the shower destroy couch leave hair everywhere sleep on keyboard chew iPad power cord. Use lap as chair. Missing until dinner time stand in front of the computer screen, intently sniff hand. Find something else more interesting. Destroy couch play time so inspect anything brought into the house hate dog burrow under covers. Sleep on keyboard destroy couch so hate dog so hide when guests come over. Chase mice destroy couch lick butt throwup on your pillow use lap as chair yet intrigued by the shower but climb leg. Stare at ceiling make muffins or hunt anything that moves claw drapes. Intently sniff hand intrigued by the shower. Why must they do that. Cat snacks leave dead animals as gifts or inspect anything brought into the house sweet beast so stare at ceiling give attitude. Flop over claw drapes but sun bathe lick butt, and chase mice. Rub face on everything lick butt leave hair everywhere lick butt, missing until dinner time for use lap as chair lick butt. Make muffins leave dead animals as gifts play time. Chew foot intrigued by the shower stare at ceiling inspect anything brought into the house yet hopped up on goofballs. 

                        Hunt anything that moves intently sniff hand for hunt anything that moves play time. Chew foot climb leg throwup on your pillow so lick butt yet make muffins hate dog. Intrigued by the shower. Intently sniff hand shake treat bag. Cat snacks burrow under covers make muffins but all of a sudden go crazy find something else more interesting. Flop over chase mice. Give attitude. Inspect anything brought into the house. Stick butt in face sun bathe so find something else more interesting and intrigued by the shower. Rub face on everything use lap as chair. 

                        Under the bed claw drapes chase mice but leave hair everywhere yet make muffins yet claw drapes. Use lap as chair. Find something else more interesting stretch for under the bed. Nap all day intrigued by the shower, hate dog sweet beast intently sniff hand so hate dog nap all day. Swat at dog hide when guests come over and mark territory chase mice for cat snacks. Use lap as chair. Lick butt throwup on your pillow need to chase tail. 

                        Mark territory. Stick butt in face shake treat bag yet hunt anything that moves, yet hopped up on goofballs yet stare at ceiling under the bed. Give attitude chase imaginary bugs stretch so hunt anything that moves so hide when guests come over but intrigued by the shower find something else more interesting. Make muffins behind the couch for chew foot. Sweet beast flop over but throwup on your pillow. Intently sniff hand use lap as chair and missing until dinner time and chase imaginary bugs. 
                    </p>
                </div>

                <div class="close-button r-close-button">x</div>
            </div>
            <!--each tile should specify what page type it opens (to determine which animation) and the corresponding page name it should open-->
            <div class="dashboard clearfix">
                <ul class="tiles">
                    <div class="col1 clearfix">
                        <li class="tile tile-big tile-1 slideTextUp" data-page-type="r-page" data-page-name="random-r-page">
                            <div><p>This tile's content slides up</p></div>
                            <div><p>View all tasks</p></div>
                        </li>
                        <li class="tile tile-small tile tile-2 slideTextRight" data-page-type="s-page" data-page-name ="random-restored-page">
                            <div><p class="icon-arrow-right"></p></div>
                            <div><p>Tile's content slides right. Page opens from left</p></div>
                        </li>
                        <li class="tile tile-small last tile-3" data-page-type="r-page" data-page-name="random-r-page">
                            <p class="icon-calendar-alt-fill"></p>
                        </li>
                        <li class="tile tile-big tile-4 fig-tile" data-page-type="r-page" data-page-name="random-r-page">
                            <figure>
                                <img src="images/blue.jpg" />
                                <figcaption class="tile-caption caption-left">Slide-out Caption from left</figcaption>
                            </figure>
                        </li>
                    </div>

                    <div class="col2 clearfix">
                        <li class="tile tile-big tile-5" data-page-type="r-page" data-page-name="random-r-page">
                            <div><p><span class="icon-cloudy"></span>Weather</p></div>
                        </li>
                        <li class="tile tile-big tile-6 slideTextLeft" data-page-type="r-page" data-page-name="random-r-page">
                            <div><p><span class="icon-skype"></span>Skype</p></div>
                            <div><p>Make a Call</p></div>
                        </li>
                        <!--Tiles with a 3D effect should have the following structure:
                            1) a container inside the tile with class of .faces
                            2) 2 figure elements, one with class .front and the other with class .back-->
                        <li class="tile tile-small tile-7 rotate3d rotate3dX" data-page-type="r-page" data-page-name="random-r-page">
                            <div class="faces">
                                <div class="front"><span class="icon-picassa"></span></div>
                                <div class="back"><p>Launch Picassa</p></div>
                            </div>
                        </li>
                        <li class="tile tile-small last tile-8 rotate3d rotate3dY" data-page-type="r-page" data-page-name="random-r-page">
                            <div class="faces">
                                <div class="front"><span class="icon-instagram"></span></div>
                                <div class="back"><p>Launch Instagram</p></div>
                            </div>
                        </li>
                    </div>

                    <div class="col3 clearfix">      
                        <li class="tile tile-2xbig tile-9 fig-tile" data-page-type="custom-page" data-page-name="random-r-page">
                            <figure>
                                <img src="images/summer.jpg" />
                                <figcaption class="tile-caption caption-bottom">Fixed Caption: Some Subtitle or Tile Description Goes Here with some kinda link or anything
                            </figure>
                        </li>
                        <li class="tile tile-big tile-10" data-page-type="s-page" data-page-name="custom-page">
                            <div><p>Windows-8-like Animations with CSS3 &amp; jQuery &copy; Sara Soueidan. Licensed under MIT.</p></div>
                        </li>
                    </div>
                </ul>
            </div><!--end dashboard-->

        </div>
        <!--====================================end demo wrapper================================================-->
        <script src="resources/js/jquery-1.8.2.min.js"></script>
        <script src="resources/js/scripts.js"></script>
        <script type="text/javascript">
            
           
                var form = $('#form1');
                form.submit(function () {

                    $.ajax({
                        type: form.attr('method'),
                        url: form.attr('action'),
                        data: form.serialize(),
                        success: function (data) {
                            var result = data;
                            $('#result').attr("value", result);

                        }
                    });

                    return false;
                });
        </script>
    </body>
</html>
