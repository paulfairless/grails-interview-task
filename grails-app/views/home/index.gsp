<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>Sky News</title></head>
  <body>

    <ul>
        <g:each in="${articles}" var="article">
        <li>
            <article>
                <header>
                    <h3>${article.headline}</h3>
                </header>
                <p>${article.intro}</p>
                <img src="${article.imageUrl}"/>
                <p>${article.bodyText}</p>
            </article>
        </li>
        </g:each>
    </ul>
  </body>
</html>