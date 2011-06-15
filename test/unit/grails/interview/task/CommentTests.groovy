package grails.interview.task

import grails.test.*

class CommentTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testCommentTextIsMandatory() {
        def dummyArticle =  new Article([headline:'dummy'])
        mockForConstraintsTests(Comment)
        mockDomain(Article, [dummyArticle])

        def comment = new Comment(article: dummyArticle)
        assertFalse comment.validate()

        comment = new Comment(commentText: '', article: dummyArticle)
        assertFalse comment.validate()

        comment = new Comment(commentText: 'comment', article: dummyArticle)
        assertTrue comment.validate()
    }
}
