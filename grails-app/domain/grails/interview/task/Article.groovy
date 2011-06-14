package grails.interview.task

class Article {
    String imageUrl
	String intro
	Date lastUpdated
	String bodyText
	Comment[] comments



    static constraints = {
    }
}
