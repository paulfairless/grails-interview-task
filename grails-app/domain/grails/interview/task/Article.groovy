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
        headline(blank:false)
        intro(blank:false)
        imageUrl(blank:false)
        bodyText(blank:false)
    }
}
