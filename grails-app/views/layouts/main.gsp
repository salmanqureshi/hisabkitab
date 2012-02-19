<!DOCTYPE html>
<html>
    <head>
        <title><g:layoutTitle default="Hisab Kitab" /></title>
        <link rel="stylesheet" href="${resource(dir:'css',file:'main.css')}" />
        <link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon" />
        <g:layoutHead />
        <g:javascript library="application" />
    </head>
    <body>
        <div id="spinner" class="spinner" style="display:none;">
            <img src="${resource(dir:'images',file:'spinner.gif')}" alt="${message(code:'spinner.alt',default:'Loading...')}" />
        </div>
        <div id="header"><g:link class="logout" absolute="true" controller="logout" action="index"><img src="../images/skin/logout.jpg"/></g:link></div>
        <div id="outer-content">
	        <g:layoutBody />
        </div>
    </body>
</html>