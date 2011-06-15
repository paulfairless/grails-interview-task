package grails.interview.task

class HomeController {

    def index = {
        [articles: Article.list(sort:"lastUpdated", order:"desc")]
    }
}
