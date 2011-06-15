package grails.interview.task

import grails.test.*

class HomeControllerTests extends ControllerUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testHomeListsArticlesInLastUpdatedOrder() {
       def article1 = new Article(bodyText: "Article1", imageUrl: "/dummy.jpg", intro: "intro1", headline: 'Headline 1', lastUpdated: new Date()-2)
       def article2 = new Article(bodyText: "Article2", imageUrl: "/dummy.jpg", intro: "intro2", headline: 'Headline 2', lastUpdated: new Date())
       def article3 = new Article(bodyText: "Article3", imageUrl: "/dummy.jpg", intro: "intro3", headline: 'Headline 3', lastUpdated: new Date()-1)

       mockDomain(Article, [article1, article2, article3])

       def result = controller.index()
       assertEquals "Order not as expected", [article2, article3, article1], result.articles
    }
}
