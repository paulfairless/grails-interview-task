package grails.interview.task

import grails.test.*

class ArticleTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testHeadlineIsMandatory() {
        mockForConstraintsTests(Article)

        def article = new Article(bodyText: 'body', intro: 'intro', imageUrl:'dummy.jpg')
        assertFalse article.validate()

        article = new Article(headline:'', bodyText: 'body', intro: 'intro', imageUrl:'dummy.jpg')
        assertFalse article.validate()

        article = new Article(headline:'headline', bodyText: 'body', intro: 'intro', imageUrl:'dummy.jpg')
        assertTrue article.validate()
    }


    void testIntroIsMandatory() {
        mockForConstraintsTests(Article)

        def article = new Article(headline:'headline', bodyText: 'body', imageUrl:'dummy.jpg')
        assertFalse article.validate()

        article = new Article(headline:'headline', bodyText: 'body', intro: '', imageUrl:'dummy.jpg')
        assertFalse article.validate()

        article = new Article(headline:'headline', bodyText: 'body', intro: 'intro', imageUrl:'dummy.jpg')
        assertTrue article.validate()
    }

    void testBodyTextIsMandatory() {
        mockForConstraintsTests(Article)

        def article = new Article(headline:'headline', intro: 'intro', imageUrl:'dummy.jpg')
        assertFalse article.validate()

        article = new Article(headline:'headline', bodyText: '', intro: 'intro', imageUrl:'dummy.jpg')
        assertFalse article.validate()

        article = new Article(headline:'headline', bodyText: 'body', intro: 'intro', imageUrl:'dummy.jpg')
        assertTrue article.validate()
    }

    void testImageUrlIsMandatory() {
        mockForConstraintsTests(Article)

        def article = new Article(headline:'headline', bodyText: 'body', intro: 'intro')
        assertFalse article.validate()

        article = new Article(headline:'headline', bodyText: 'body', intro: 'intro', imageUrl:'')
        assertFalse article.validate()

        article = new Article(headline:'headline', bodyText: 'body', intro: 'intro', imageUrl:'dummy.jpg')
        assertTrue article.validate()
    }
}
