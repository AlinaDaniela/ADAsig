<%-- 
    Document   : noReloadPage
    Created on : May 31, 2015, 10:48:17 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset=utf-8>
        <meta name="viewport" content="width=620">
        <title>HTML5 Demo: HTML5 History API</title>
        <link rel="stylesheet" href="css/html5demos.css">
        <script src="js/h5utils.js"></script></head>
    <body>
        <section id="wrapper">
            <div id="carbonads-container"><div class="carbonad"><div id="azcarbon"></div><script type="text/javascript">var z = document.createElement("script");
                z.type = "text/javascript";
                z.async = true;
                z.src = "http://engine.carbonads.com/z/14060/azcarbon_2_1_0_VERT";
                var s = document.getElementsByTagName("script")[0];
                s.parentNode.insertBefore(z, s);</script></div></div>
            <header>
                <h1>HTML5 History API</h1>
            </header>

            <style>
                #examples {
                    padding-left: 20px;
                }
                #examples li {
                    list-style: square;
                    padding: 0;
                    margin: 0;
                }
            </style>
            <article>
                <p id="status">HTML5 History API not supported</p>
                <p><em>Last event fired: <span id="lastevent">(none)</span></em></p>
                <p>To test the History API, click through the urls below. Note that none of these urls point to <em>real</em> pages. JavaScript will intercept these clicks, load data and the browser address bar will <em>appear</em> to change - but this is the History API in action!</p>
                <p>Use the back and forward buttons in your browser to navigate the history.</p>
                <ul id="examples">
                    <li><a href="/history/first">first</a></li>
                    <li><a href="/history/second">second</a></li>
                    <li><a href="/history/third">third</a></li>
                    <li><a href="/history/fourth">fourth</a></li>
                </ul>
                <p><small>Note: since these urls aren't real, refreshing the page will land on an invalid url.</small></p>
                <div id="output"></div>
            </article>
            <script>
                var $ = function (s) {
                    return document.getElementById(s);
                },
                        state = $('status'),
                        lastevent = $('lastevent'),
                        urlhistory = $('urlhistory'),
                        examples = $('examples'),
                        output = $('output'),
                        template = '<p>URL: <strong>{url}</strong>, name: <strong>{name}</strong>, location: <strong>{location}</strong></p>',
                        data = {// imagine these are ajax requests :)
                            first: {
                                name: "Remy",
                                location: "Brighton, UK"
                            },
                            second: {
                                name: "John",
                                location: "San Francisco, USA"
                            },
                            third: {
                                name: "Jeff",
                                location: "Vancover, Canada"
                            },
                            fourth: {
                                name: "Simon",
                                location: "London, UK"
                            }
                        };

                function reportEvent(event) {
                    lastevent.innerHTML = event.type;
                }

                function reportData(data) {
                    output.innerHTML = template.replace(/(:?\{(.*?)\})/g, function (a, b, c) {
                        return data[c];
                    });
                }

                if (typeof history.pushState === 'undefined') {
                    state.className = 'fail';
                } else {
                    state.className = 'success';
                    state.innerHTML = 'HTML5 History API available';
                }

                addEvent(examples, 'click', function (event) {
                    var title;

                    event.preventDefault();
                    if (event.target.nodeName == 'A') {
                        title = event.target.innerHTML;
                        data[title].url = event.target.getAttribute('href'); // slightly hacky (the setting), using getAttribute to keep it short
                        history.pushState(data[title], title, event.target.href);
                        reportData(data[title]);
                    }
                });

                addEvent(window, 'popstate', function (event) {
                    var data = event.state;
                    reportEvent(event);
                    reportData(event.state || {url: "unknown", name: "undefined", location: "undefined"});
                });

                addEvent(window, 'hashchange', function (event) {
                    reportEvent(event);

                    // we won't do this for now - let's stay focused on states
                    /*
                     if (event.newURL) {
                     urlhistory.innerHTML = event.oldURL;
                     } else {
                     urlhistory.innerHTML = "no support for <code>event.newURL/oldURL</code>";
                     }
                     */
                });

                addEvent(window, 'pageshow', function (event) {
                    reportEvent(event);
                });

                addEvent(window, 'pagehide', function (event) {
                    reportEvent(event);
                });

            </script><a id="html5badge" href="http://www.w3.org/html/logo/">
                <img src="http://www.w3.org/html/logo/badge/html5-badge-h-connectivity-device-graphics-multimedia-performance-semantics-storage.png" width="325" height="64" alt="HTML5 Powered with Connectivity / Realtime, Device Access, Graphics, 3D & Effects, Multimedia, Performance & Integration, Semantics, and Offline & Storage" title="HTML5 Powered with Connectivity / Realtime, Device Access, Graphics, 3D & Effects, Multimedia, Performance & Integration, Semantics, and Offline & Storage">
            </a>
            <footer><a href="/">HTML5 demos</a>/<a id="built" href="http://twitter.com/rem">@rem built this</a>/<a href="#view-source">view source</a></footer> 
        </section>
        <a href="http://github.com/remy/html5demos"><img style="position: absolute; top: 0; left: 0; border: 0;" src="http://s3.amazonaws.com/github/ribbons/forkme_left_darkblue_121621.png" alt="Fork me on GitHub" /></a>
        <script src="js/prettify.packed.js"></script>
        <script>
                var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
                document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
        </script>
        <script>
            try {
                var pageTracker = _gat._getTracker("UA-1656750-18");
                pageTracker._trackPageview();
            } catch (err) {
            }</script>
    </body>
</html>