package grails.interview.task

class Article {
    String headline
    String imageUrl
	String intro
	Date lastUpdated
	String bodyText

    List<Comment> comments
	static hasMany = [comments:Comment]



    static constraints = {
    }
}
