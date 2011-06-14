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
                <section>
                    <ul>
                        <g:each in="${article.comments}" var="comment">
                        <li>${comment.commentText}</li>
                        </g:each>
                    </ul>
                </section>
            </article>
        </li>
        </g:each>
    </ul>
  </body>
</html>